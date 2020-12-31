package view.quanli.thongke;

import controller.ThemKhachHang;
import controller.ThongKe;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
import model.*;

public class jf_ThongKeChiTiet extends javax.swing.JFrame {

    String query;
    DecimalFormat format = new DecimalFormat("###,###,###");
    List<NhanVien> listnv = new ArrayList<>();
    List<KhachHang> listkh = new ArrayList<>();
    String idKhachHang = "";
    String idNhanVien = "";
    String subQuery1 = "";

    public jf_ThongKeChiTiet(String query) {
        initComponents();
        this.query = query;
        int[] arr = new ThongKe().load(query, pn);
        soHoaDon.setText(format.format(arr[1]) + " Hóa Đơn");
        tongSanPham.setText(format.format(arr[0]) + " Sản Phẩm");
        tienLai.setText(format.format(arr[2]) + " VNĐ");
        pn.setPreferredSize(new Dimension(1366, arr[3]));
        pn.repaint();
        pn.validate();
        listnv = getNhanVienBanHang();
        listkh = new ThemKhachHang().getAllNhaCungCap();
        cbNhanVien.removeAllItems();
        cbNhanVien.addItem("Tất Cả");
        for (int i = 1; i <= listnv.size(); i++) {
            cbNhanVien.addItem(listnv.get(i - 1).getHoTen());
        }
        cbNhaCungCap.removeAllItems();
        cbNhaCungCap.addItem("Tất Cả");
        for (int i = 1; i <= listkh.size(); i++) {
            cbNhaCungCap.addItem(listkh.get(i - 1).getHoTen());
        }
        radioNhaCungCap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radioNhaCungCap.isSelected()) {
                    cbNhanVien.setEnabled(false);
                    cbNhaCungCap.setEnabled(true);
                }
            }
        });
        radioNhanVien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radioNhanVien.isSelected()) {
                    cbNhanVien.setEnabled(true);
                    cbNhaCungCap.setEnabled(false);
                }
            }
        });
        cbNhanVien.setEnabled(false);
        cbNhaCungCap.setEnabled(false);
    }

    public List<NhanVien> getNhanVienBanHang() {
        List<NhanVien> listnv = new ArrayList<>();
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT TaiKhoan.TaiKhoan , TaiKhoan.MatKhau, NhanVien.IDNhanVien,NhanVien.IDBoPhan ,\n"
                    + "NhanVien.HoTen,NhanVien.GioiTinh,NhanVien.SoDienThoai,Nhanvien.DiaChi,BoPhan.TenBoPhan,NhanVien.TinhTrang \n"
                    + "FROM NhanVien INNER JOIN BoPhan ON NhanVien.IDBoPhan = BoPhan.IDBoPhan\n"
                    + "FULL JOIN TaiKhoan ON NhanVien.IDNhanVien = TaiKhoan.IDNhanVien \n"
                    + "WHERE BoPhan.IDBoPhan = 'BP100003' AND NhanVien.TinhTrang = '1' ";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10));
                listnv.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listnv;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        soHoaDon = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tongSanPham = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tienLai = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        den = new com.toedter.calendar.JDateChooser();
        tu = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbNhanVien = new javax.swing.JComboBox<>();
        cbLoai = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbNhaCungCap = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnLoc = new javax.swing.JButton();
        radioNhanVien = new javax.swing.JRadioButton();
        radioNhaCungCap = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pn = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));

        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 90));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel9.setBackground(java.awt.Color.white);
        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-supplier-45.png"))); // NOI18N
        jLabel6.setText("Hóa Đơn : ");
        jPanel9.add(jLabel6);

        soHoaDon.setBackground(java.awt.Color.white);
        soHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        soHoaDon.setText("28.389.00 VNĐ");
        jPanel9.add(soHoaDon);

        jPanel2.add(jPanel9);

        jPanel11.setBackground(java.awt.Color.white);
        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        jLabel12.setBackground(java.awt.Color.white);
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-supplier-45.png"))); // NOI18N
        jLabel12.setText("Sản Phẩm : ");
        jPanel11.add(jLabel12);

        tongSanPham.setBackground(java.awt.Color.white);
        tongSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tongSanPham.setText("500 Hóa Đơn");
        jPanel11.add(tongSanPham);

        jPanel2.add(jPanel11);

        jPanel10.setBackground(java.awt.Color.white);
        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        jLabel13.setBackground(java.awt.Color.white);
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-supplier-45.png"))); // NOI18N
        jLabel13.setText("Tiền Lãi : ");
        jPanel10.add(jLabel13);

        tienLai.setBackground(java.awt.Color.white);
        tienLai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tienLai.setText("1.237 Sản Phẩm");
        jPanel10.add(tienLai);

        jPanel2.add(jPanel10);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel4.setMinimumSize(new java.awt.Dimension(100, 60));
        jPanel4.setPreferredSize(new java.awt.Dimension(1366, 150));
        jPanel4.setLayout(null);

        den.setDateFormatString("yyyy-MM-dd");
        den.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel4.add(den);
        den.setBounds(70, 90, 180, 40);

        tu.setDateFormatString("yyyy-MM-dd");
        tu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel4.add(tu);
        tu.setBounds(70, 20, 180, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Đến");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(10, 90, 60, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Từ");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(10, 20, 60, 40);

        cbNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNhanVienActionPerformed(evt);
            }
        });
        jPanel4.add(cbNhanVien);
        cbNhanVien.setBounds(810, 80, 260, 50);

        cbLoai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Sản Phẩm", "Hóa Đơn", "Doanh Thu" }));
        cbLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiActionPerformed(evt);
            }
        });
        jPanel4.add(cbLoai);
        cbLoai.setBounds(340, 50, 260, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel4.add(jLabel3);
        jLabel3.setBounds(280, 10, 100, 50);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Nhân Viên");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(670, 70, 100, 60);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Nhà Cung Cấp");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(670, 0, 130, 70);

        cbNhaCungCap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbNhaCungCap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNhaCungCapActionPerformed(evt);
            }
        });
        jPanel4.add(cbNhaCungCap);
        cbNhaCungCap.setBounds(810, 10, 260, 50);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-search-client-45.png"))); // NOI18N
        jButton1.setText("Xuất File");
        jPanel4.add(jButton1);
        jButton1.setBounds(1160, 80, 180, 60);

        btnLoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-search-client-45.png"))); // NOI18N
        btnLoc.setText("Lọc");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });
        jPanel4.add(btnLoc);
        btnLoc.setBounds(1160, 10, 180, 60);

        radioNhanVien.setBackground(java.awt.Color.white);
        jPanel4.add(radioNhanVien);
        radioNhanVien.setBounds(630, 90, 30, 25);

        radioNhaCungCap.setBackground(java.awt.Color.white);
        jPanel4.add(radioNhaCungCap);
        radioNhaCungCap.setBounds(630, 20, 30, 25);

        jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(1366, 468));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1366, 468));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1366, 468));

        pn.setBackground(java.awt.Color.white);
        pn.setPreferredSize(new java.awt.Dimension(1366, 300));
        pn.setLayout(null);
        jScrollPane1.setViewportView(pn);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLoaiActionPerformed

    private void cbNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNhanVienActionPerformed
        int index = cbNhanVien.getSelectedIndex();
        if (index <= 0) {
            idNhanVien = "";
        } else {
            idNhanVien = listnv.get(index - 1).getIdNhanVien();
        }
    }//GEN-LAST:event_cbNhanVienActionPerformed

    private void cbNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNhaCungCapActionPerformed
        int index = cbNhaCungCap.getSelectedIndex();
        if (index <= 0) {
            idKhachHang = "";
        } else {
            idKhachHang = listkh.get(index - 1).getIdKhachHang();
        }
    }//GEN-LAST:event_cbNhaCungCapActionPerformed

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        String subQuery = " WHERE HoaDon.NgayTao >= '" + new SimpleDateFormat("yyyy-MM-dd").format(tu.getDate()) + "' AND "
                + " HoaDon.NgayTao <= '" + new SimpleDateFormat("yyyy-MM-dd").format(den.getDate()) + "' AND "
                + "HoaDon.IDNhanVien LIKE '%" + idNhanVien + "%' ";
        pn.removeAll();
        pn.repaint();
        pn.validate();
        int[] arr = new ThongKe().load(subQuery, pn);
        soHoaDon.setText(format.format(arr[1]) + " Hóa Đơn");
        tongSanPham.setText(format.format(arr[0]) + " Sản Phẩm");
        tienLai.setText(format.format(arr[2]) + " VNĐ");
    }//GEN-LAST:event_btnLocActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbLoai;
    private javax.swing.JComboBox<String> cbNhaCungCap;
    private javax.swing.JComboBox<String> cbNhanVien;
    private com.toedter.calendar.JDateChooser den;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn;
    private javax.swing.JRadioButton radioNhaCungCap;
    private javax.swing.JRadioButton radioNhanVien;
    private javax.swing.JLabel soHoaDon;
    private javax.swing.JLabel tienLai;
    private javax.swing.JLabel tongSanPham;
    private com.toedter.calendar.JDateChooser tu;
    // End of variables declaration//GEN-END:variables
}
