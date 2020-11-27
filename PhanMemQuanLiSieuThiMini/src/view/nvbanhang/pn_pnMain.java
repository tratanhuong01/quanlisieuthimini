package view.nvbanhang;

import controller.CapNhatTienHoaDon;
import controller.PTHoaDon;
import controller.TimKiemSanPham;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javafx.stage.Screen;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.ConnectDAO;
import model.DAO;
import model.DongHoaDon;
import model.InfoAtm;
import model.KhachHang;
import model.NhanVien;
import model.NhomSanPham;
import model.SanPham;
import view.jf_QuanLi;

public class pn_pnMain extends javax.swing.JPanel {

    KhachHang kh;
    NhanVien nv;
    List<DongHoaDon> listDongHoaDon = new ArrayList<>();
    JPanel pnMains;
    public pn_pnMain(NhanVien nv) {
        initComponents();
        this.nv = nv;
        JLabel lb = new JLabel();
        lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/sieu-thi-mini.jpg")));
        pnMain.removeAll();
        pnMain.setLayout(new GridLayout());
        pnMain.add(lb);
    }
    
    public pn_pnMain(KhachHang kh, NhanVien nv) {
        initComponents();
        this.kh = kh;
        this.nv = nv;
        loadNhomSanPham();
        loadPTThanhToan();
        cssJScrollPanel();
        loadSanPhamByNhomSanPham(cbNhomSanPham.getSelectedItem().toString());
    }
    
    public pn_pnMain(KhachHang kh, NhanVien nv,JPanel pnMains) {
        initComponents();
        this.kh = kh;
        this.nv = nv;
        this.pnMains = pnMains;
        loadNhomSanPham();
        loadPTThanhToan();
        cssJScrollPanel();
        loadSanPhamByNhomSanPham(cbNhomSanPham.getSelectedItem().toString());
        int diem = check(kh.getIdKhachHang());
        if (diem == 0) {
            txtSoDiemTich.setText(String.valueOf(0));
        }
        else {
            txtSoDiemTich.setText(String.valueOf(check(kh.getIdKhachHang())));
        }
    }
    public int check(String idKhachHang) {
        int diem = 0;
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "SELECT SoDiem FROM TichDiem WHERE IDKhachHang = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idKhachHang);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) 
                diem = rs.getInt(1);
            else 
                diem = 0;
            return diem;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return diem;
    }
    public void loadSanPhamByNhomSanPham(List<SanPham> list) {
        for (int i = 0; i < list.size(); i++) {
            pn_SanPhamChon pn = new pn_SanPhamChon(list.get(i), listDongHoaDon, pnSanPhamDaChon,
                     kh, nv, jScrollPane1, txtTongTien, btnTaoHoaDon, txtTienKhuyenMai);
            int numComponent = pnChonSanPham.getComponentCount();
            pnChonSanPham.setPreferredSize(new Dimension(6 * 210, numComponent * 253));
            jScrollPane1.getViewport().revalidate();
            pnChonSanPham.add(pn);
            pnChonSanPham.updateUI();
        }
    }

    public void loadSanPhamByNhomSanPham(String tenNhomSP) {
        List<SanPham> list = new DAO().getSanPhamByNhomSanPham(cbNhomSanPham.getSelectedItem().toString());
        for (int i = 0; i < list.size(); i++) {
            int numComponent = pnChonSanPham.getComponentCount();
            pn_SanPhamChon pn = new pn_SanPhamChon(list.get(i), listDongHoaDon, pnSanPhamDaChon, kh,
                     nv, jScrollPane1, txtTongTien, btnTaoHoaDon, txtTienKhuyenMai);
            pnChonSanPham.setPreferredSize(new Dimension(6 * 210, numComponent * 253));
            jScrollPane1.getViewport().revalidate();
            pnChonSanPham.add(pn);
            pnChonSanPham.updateUI();
        }
    }

    public void cssJScrollPanel() {
        jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
        jScrollPane1.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 10));
        jScrollPane2.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
        jScrollPane2.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 10));
    }

    public void loadNhomSanPham() {
        List<NhomSanPham> list = new DAO().getNhomSanPham();
        for (int i = 0; i < list.size(); i++) {
            cbNhomSanPham.addItem(list.get(i).getTenNhomSanPham());
        }
    }

    public void loadPTThanhToan() {
        ptThanhToan.removeAllItems();
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT TenPTThanhToan FROM PhuongThucThanhToan";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ptThanhToan.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getIDPTThanhToan(String tenPTThanhToan) {
        String string = "";
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT IDPTThanhToan FROM PhuongThucThanhToan WHERE TenPTThanhToan = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, tenPTThanhToan);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                string = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return string;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        pnCenter = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        txtTenKhachHang = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        txtSoDiemTich = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        cbNhomSanPham = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        pnFooter = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        txtTienKhuyenMai = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtTienKhachTra = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        ptThanhToan = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnTaoHoaDon = new javax.swing.JButton();
        pnContent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnSanPhamDaChon = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnChonSanPham = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        pnMain.setLayout(new java.awt.BorderLayout());

        pnCenter.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        pnCenter.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel2.setPreferredSize(new java.awt.Dimension(550, 100));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel9.setPreferredSize(new java.awt.Dimension(180, 100));
        jPanel9.setLayout(new java.awt.GridLayout(2, 0));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel36.setText("Tên Khách Hàng");
        jPanel9.add(jLabel36);

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel40.setText("Số Điểm Tích");
        jPanel9.add(jLabel40);

        jPanel2.add(jPanel9, java.awt.BorderLayout.LINE_START);

        jPanel10.setLayout(new java.awt.GridLayout(2, 0));

        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        txtTenKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtTenKhachHang.setEnabled(false);
        jPanel11.add(txtTenKhachHang);

        jPanel10.add(jPanel11);

        jPanel12.setLayout(new java.awt.GridLayout(1, 3));

        txtSoDiemTich.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtSoDiemTich.setEnabled(false);
        jPanel12.add(txtSoDiemTich);
        jPanel12.add(jLabel5);

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel12.add(btnSua);

        jPanel10.add(jPanel12);

        jPanel2.add(jPanel10, java.awt.BorderLayout.CENTER);

        pnCenter.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel13.setPreferredSize(new java.awt.Dimension(70, 100));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/search1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel13, java.awt.BorderLayout.LINE_START);

        jPanel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel14.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanel14.setPreferredSize(new java.awt.Dimension(400, 100));

        cbNhomSanPham.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cbNhomSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNhomSanPhamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cbNhomSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cbNhomSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel14, java.awt.BorderLayout.LINE_END);

        jPanel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel15.setLayout(new java.awt.GridLayout(2, 0));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Nhập Tên Mặt Hàng Cần Thêm");
        jPanel15.add(jLabel38);

        txtSearch.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });
        jPanel15.add(txtSearch);

        jPanel3.add(jPanel15, java.awt.BorderLayout.CENTER);

        pnCenter.add(jPanel3, java.awt.BorderLayout.CENTER);

        pnMain.add(pnCenter, java.awt.BorderLayout.PAGE_START);

        pnFooter.setPreferredSize(new java.awt.Dimension(1366, 120));
        pnFooter.setLayout(new java.awt.GridLayout(1, 3));

        jPanel17.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 30, 8, 8));
        jPanel17.setLayout(new java.awt.GridLayout(2, 2));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel37.setText("Tiền Khuyến Mãi");
        jPanel17.add(jLabel37);

        txtTienKhuyenMai.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTienKhuyenMai.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTienKhuyenMai.setText("0");
        txtTienKhuyenMai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.add(txtTienKhuyenMai);

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel34.setText("Tiền Khách Trả");
        jPanel17.add(jLabel34);

        txtTienKhachTra.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTienKhachTra.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTienKhachTra.setText("0");
        txtTienKhachTra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.add(txtTienKhachTra);

        pnFooter.add(jPanel17);

        jPanel16.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        jPanel16.setLayout(new java.awt.GridLayout(2, 2));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Thanh Toán");
        jPanel16.add(jLabel41);

        ptThanhToan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        ptThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel16.add(ptThanhToan);

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Tổng Tiền");
        jPanel16.add(jLabel35);

        txtTongTien.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTongTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTongTien.setText("0");
        txtTongTien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTienActionPerformed(evt);
            }
        });
        jPanel16.add(txtTongTien);

        pnFooter.add(jPanel16);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));

        btnTaoHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnTaoHoaDon.setText("Tạo Hóa Đơn");
        btnTaoHoaDon.setEnabled(false);
        btnTaoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTaoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTaoHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnFooter.add(jPanel1);

        pnMain.add(pnFooter, java.awt.BorderLayout.PAGE_END);

        pnContent.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(475, 418));

        pnSanPhamDaChon.setBackground(java.awt.Color.white);
        pnSanPhamDaChon.setPreferredSize(new java.awt.Dimension(475, 418));

        javax.swing.GroupLayout pnSanPhamDaChonLayout = new javax.swing.GroupLayout(pnSanPhamDaChon);
        pnSanPhamDaChon.setLayout(pnSanPhamDaChonLayout);
        pnSanPhamDaChonLayout.setHorizontalGroup(
            pnSanPhamDaChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );
        pnSanPhamDaChonLayout.setVerticalGroup(
            pnSanPhamDaChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnSanPhamDaChon);

        pnContent.add(jScrollPane1, java.awt.BorderLayout.LINE_START);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(966, 416));

        pnChonSanPham.setBackground(java.awt.Color.white);
        pnChonSanPham.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 30, 1, 1));
        pnChonSanPham.setPreferredSize(new java.awt.Dimension(942, 414));
        pnChonSanPham.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));
        jScrollPane2.setViewportView(pnChonSanPham);

        pnContent.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        pnMain.add(pnContent, java.awt.BorderLayout.CENTER);

        add(pnMain, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    private void cbNhomSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNhomSanPhamActionPerformed
        pnChonSanPham.removeAll();
        pnChonSanPham.repaint();
        loadSanPhamByNhomSanPham(cbNhomSanPham.getSelectedItem().toString());
    }//GEN-LAST:event_cbNhomSanPhamActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        pnChonSanPham.removeAll();
        pnChonSanPham.repaint();
        List<SanPham> list = new TimKiemSanPham().getSanPhamByNhomSanPham(txtSearch.getText());
        loadSanPhamByNhomSanPham(list);
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtTongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTienActionPerformed

    }//GEN-LAST:event_txtTongTienActionPerformed

    private void btnTaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHoaDonActionPerformed

        float tongTien = 0;
        float tienKhuyenMai = 0;
        for (int i = 0; i < listDongHoaDon.size(); i++) {
            tongTien += (listDongHoaDon.get(i).getDonGia() * listDongHoaDon.get(i).getSoLuong());
            tienKhuyenMai += (listDongHoaDon.get(i).getDonGia() * (listDongHoaDon.get(i).getGiam() / 100)) * listDongHoaDon.get(i).getSoLuong();
        }
        if (Float.parseFloat(txtTienKhachTra.getText()) < (tongTien - tienKhuyenMai)) {

        } else {
            int result = JOptionPane.showConfirmDialog(null, "Bạn Có Chắc Chắn Là Muốn Tạo Hóa Đơn Không?");
            if (result == JOptionPane.YES_OPTION) {
                if (ptThanhToan.getSelectedItem().toString().equals("ATM")) {
                    jf_pnATM pnAtm = new jf_pnATM(ptThanhToan.getSelectedItem().toString(), listDongHoaDon, kh, nv
                    ,Float.parseFloat(txtTienKhachTra.getText()),tienKhuyenMai,pnMains);
                    pnAtm.setVisible(true);

                } else {
                    InfoAtm info = null;
                    new jf_TaoHoaDon(listDongHoaDon, kh, nv, info, ptThanhToan.getSelectedItem().toString()
                            ,tienKhuyenMai, Float.parseFloat(txtTienKhachTra.getText()),pnMains).setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btnTaoHoaDonActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        new jf_SuaKhachHang(kh).setVisible(true);
    }//GEN-LAST:event_btnSuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaoHoaDon;
    private javax.swing.JComboBox<String> cbNhomSanPham;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnChonSanPham;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnFooter;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnSanPhamDaChon;
    private javax.swing.JComboBox<String> ptThanhToan;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSoDiemTich;
    public static javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTienKhachTra;
    private javax.swing.JTextField txtTienKhuyenMai;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
