package controller;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import modal.ConnectDAO;
import modal.DongHoaDon;
import modal.SanPham;
import modal.StringUtil;

public class PTHoaDon {
    DecimalFormat formatter = new DecimalFormat("###,###,###");

    public PTHoaDon() {

    }
    public int getSoLuongDongHoaDon(String idDongHoaDon) {
        int soLuong = 0;
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "SELECT SoLuong FROM DongHoaDon WHERE IDDongHoaDon = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,idDongHoaDon);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                soLuong = rs.getInt(1);
            }
            return soLuong;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return soLuong;
    }
    public boolean updateSanPhamDaThem(int soLuong,String idDongHoaDon) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "UPDATE DongHoaDon SET SoLuong = ?  WHERE IDDongHoaDon = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,soLuong);
            ps.setString(2, idDongHoaDon);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public List<DongHoaDon> getListDongHoaDon(String idHoaDon) {
        List<DongHoaDon> list = new ArrayList<>();
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT DongHoaDon.IDDongHoaDon, HoaDon.IDHoaDon ,SanPham.TenSanPham,\n"
                    + "SanPham.IDDonViTinh , BangGia.DonGia , DongHoaDon.SoLuong ,SanPham.UrlImage, \n"
                    + "BangGia.Giam , NhanVien.IDNhanVien , NhanVien.HoTen,KhachHang.IDKhachHang,KhachHang.HoTen"
                    + " ,HoaDon.NgayTao FROM HoaDon\n"
                    + "LEFT JOIN DongHoaDon ON HoaDon.IDHoaDon = DongHoaDon.IDHoaDon\n"
                    + "INNER JOIN SanPham ON DongHoaDon.IDSanPham = SanPham.IDSanPham\n"
                    + "INNER JOIN BangGia ON SanPham.IDBangGia = BangGia.IDBangGia\n"
                    + "INNER JOIN NhanVien ON HoaDon.IDNhanVien = NhanVien.IDNhanVien\n"
                    + "INNER JOIN KhachHang ON KhachHang.IDKhachHang = HoaDon.IDKhachHang\n"
                    + "WHERE HoaDon.IDHoaDon = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idHoaDon);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DongHoaDon dongHoaDon = new DongHoaDon(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getFloat(5), rs.getInt(6), rs.getString(7),
                        rs.getFloat(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12),rs.getString(13));
                list.add(dongHoaDon);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean insertHoaDon(String idHoaDon, String idKhachHang, String idNhanVien,
            int trangThai, String ptThanhToan) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "INSERT INTO HoaDon(IDHoaDon,NgayTao,IDKhachHang,IDNhanVien,TrangThai)"
                    + "VALUES (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idHoaDon);
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            ps.setString(2, dateFormat.format(cal.getTime()));
            ps.setString(3, idKhachHang);
            ps.setString(4, idNhanVien);
            ps.setInt(5, trangThai);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean insertDongHoaDon(String idDongHoaDon,String idHoaDon, String idSanPham, String idDonViTinh,
            int soLuong) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            
            String query = "INSERT INTO DongHoaDon(IDDongHoaDon,IDHoaDon,IDSanPham,IDDonViTinh,"
                    + "SoLuong)VALUES (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idDongHoaDon);
            ps.setString(2, idHoaDon);
            ps.setString(3, idSanPham);
            ps.setString(4, idDonViTinh);
            ps.setInt(5, soLuong);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public float load(JPanel pn, String hinhSanPham, String tenSanPham, float giaSanPham,
        String idHoaDon, JScrollPane jsc, JTextField txtTien,JTextField giaKhuyenMai,JButton btnTaoHoaDon) {
        pn.removeAll();
        pn.setLayout(new BoxLayout(pn, BoxLayout.Y_AXIS));
        List<DongHoaDon> list = getListDongHoaDon(idHoaDon);
        float tongTien = 0;
        float giaKM = 0;
        if (list.size() > 0) {
            btnTaoHoaDon.setEnabled(true);
            for (int i = 0; i < list.size(); i++) {
                JPanel pnMain = new JPanel();
                JLabel lbHinhSanPham = new JLabel();
                JLabel lbTenSanPham = new JLabel();
                JLabel lbGia = new JLabel();
                JButton btnXoa = new JButton();
                JButton btnTang = new JButton();
                JButton btnGiam = new JButton();
                JTextField txtSoLuong = new JTextField();
                tongTien += (list.get(i).getDonGia() * list.get(i).getSoLuong());
                pnMain.setLayout(null);
                lbHinhSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbHinhSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anhsanpham/" + list.get(i).getHinhSanPham()))); // NOI18N
                pnMain.add(lbHinhSanPham);
                lbHinhSanPham.setBounds(0, 0, 90, 90);

                lbTenSanPham.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                lbTenSanPham.setText(list.get(i).getTenSanPham());
                pnMain.add(lbTenSanPham);
                lbTenSanPham.setBounds(100, 0, 260, 30);

                txtSoLuong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                txtSoLuong.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                txtSoLuong.setText(String.valueOf(list.get(i).getSoLuong()));
                pnMain.add(txtSoLuong);
                txtSoLuong.setBounds(130, 50, 40, 30);

                btnGiam.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                btnGiam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/down1.png"))); // NOI18N
                pnMain.add(btnGiam);
                btnGiam.setBounds(100, 50, 30, 30);

                btnTang.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                btnTang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/up.png"))); // NOI18N
                pnMain.add(btnTang);
                btnTang.setBounds(170, 50, 30, 30);

                lbGia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                lbGia.setForeground(java.awt.Color.red);
                lbGia.setText(formatter.format(list.get(i).getSoLuong() * list.get(i).getDonGia()) + " VNĐ");
                pnMain.add(lbGia);
                lbGia.setBounds(210, 50, 150, 30);

                btnXoa.setBackground(java.awt.Color.yellow);
                btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-delete-40.png"))); // NOI18N
                pnMain.add(btnXoa);
                btnXoa.setBounds(350, 15, 60, 60);
                pnMain.setPreferredSize(new Dimension(410, 100));
                pnMain.setMaximumSize(new Dimension(410, 100));
                pnMain.setMinimumSize(new Dimension(410, 100));
                String idDongHoaDon = list.get(i).getIdDongHoaDon();
                float donGia = list.get(i).getDonGia();
                int soLuong = list.get(i).getSoLuong();
                float tongTien_clone = tongTien;
                float giaKM_clone = giaKM;
                btnXoa.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pn.removeAll();
                        pn.updateUI();
                        XoaSanPham xoa = new XoaSanPham();
                        xoa.xoa(idDongHoaDon);
                        load(pn, hinhSanPham, tenSanPham, giaSanPham, idHoaDon, jsc, txtTien,giaKhuyenMai,btnTaoHoaDon);
                    }
                });
                btnTang.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int soLuong = Integer.parseInt(txtSoLuong.getText());
                        soLuong++;
                        ThayDoiSLSanPham(soLuong, idDongHoaDon);
                        txtSoLuong.setText(String.valueOf(soLuong));
                    }
                });
                btnGiam.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int soLuong = Integer.parseInt(txtSoLuong.getText());
                        soLuong--;
                        ThayDoiSLSanPham(soLuong, idDongHoaDon);
                        txtSoLuong.setText(String.valueOf(soLuong));
                    }
                });
                int numComponent = pn.getComponentCount();
                pn.setPreferredSize(new Dimension(410, numComponent * 100));
                jsc.getViewport().setViewPosition(new Point(0, pn.getComponentCount() * 100));
                jsc.getViewport().revalidate();
                pn.add(pnMain);
                pn.updateUI();
            }
            tongTien = 0;
            giaKM = 0;
            for (int i = 0; i < list.size(); i++) {
                tongTien += (list.get(i).getDonGia() * list.get(i).getSoLuong());
                giaKM += (list.get(i).getDonGia()*((list.get(i).getGiam())/100)) * list.get(i).getSoLuong();
            }
            txtTien.setText(formatter.format(tongTien - giaKM) + " VNĐ");
            giaKhuyenMai.setText(formatter.format(giaKM) + " VNĐ");
        }
        else {
            btnTaoHoaDon.setEnabled(false);
            txtTien.setText(formatter.format(0) + " VNĐ");
            giaKhuyenMai.setText(formatter.format(0) + " VNĐ");
        }
        return tongTien;
    }
    public boolean ThayDoiSLSanPham(int soLuong,String idDongHoaDon) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "UPDATE SoLuong = ? FROM DongHoaDon WHERE IDDongHoaDon = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, soLuong);
            ps.setString(2, idDongHoaDon);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
