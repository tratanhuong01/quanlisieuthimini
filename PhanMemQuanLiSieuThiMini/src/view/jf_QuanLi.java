package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import model.NhanVien;
import view.quanli.pn_PhieuNhap;
import view.quanli.pn_PhieuXuat;
import view.quanli.pn_QLHoaDon;
import view.quanli.pn_QLKhachHang;
import view.quanli.pn_QLNhaCungCap;
import view.quanli.pn_QLNhanVien;
import view.quanli.pn_QLSanPham;
import view.quanli.pn_QLSub;
import view.quanli.pn_QLThongKe;

public class jf_QuanLi extends javax.swing.JFrame {
    NhanVien nv;

    public jf_QuanLi() {
        initComponents();
    }
    
    public jf_QuanLi(NhanVien nv) {
        initComponents();
        this.nv = nv;
        pnMain.setLayout(new GridLayout(1,1));
        txtBoPhan.setText(nv.getTenBoPhan());
        txtTenNhanVien.setText(nv.getHoTen());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnHeader = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();
        btnThongTin = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        txtBoPhan = new javax.swing.JLabel();
        txtTenNhanVien = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbNgayGio = new javax.swing.JLabel();
        lbPhienBan = new javax.swing.JLabel();
        pnMain = new javax.swing.JPanel();
        pnEnd = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnKhachHang = new javax.swing.JMenu();
        mnHoaDon = new javax.swing.JMenu();
        mnNhanVien = new javax.swing.JMenu();
        mnNhaCungCap = new javax.swing.JMenu();
        mnSanPham = new javax.swing.JMenu();
        mnThongKe = new javax.swing.JMenu();
        mnTaoPhieu = new javax.swing.JMenu();
        mnPhieuNhap = new javax.swing.JMenuItem();
        mnPhieuXuat = new javax.swing.JMenuItem();
        mnNhieuHon = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnHeader.setPreferredSize(new java.awt.Dimension(1366, 90));
        pnHeader.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/logo.png"))); // NOI18N
        jPanel4.add(jLabel6);

        pnHeader.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel5.setPreferredSize(new java.awt.Dimension(400, 100));
        jPanel5.setLayout(null);

        btnDangXuat.setBackground(java.awt.SystemColor.controlHighlight);
        btnDangXuat.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-shutdown-45.png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jPanel5.add(btnDangXuat);
        btnDangXuat.setBounds(210, 10, 190, 70);

        btnThongTin.setBackground(java.awt.SystemColor.controlHighlight);
        btnThongTin.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        btnThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-info-45.png"))); // NOI18N
        btnThongTin.setText("Thông Tin");
        btnThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinActionPerformed(evt);
            }
        });
        jPanel5.add(btnThongTin);
        btnThongTin.setBounds(0, 10, 190, 70);

        pnHeader.add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel6.setBackground(java.awt.Color.white);
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jPanel8.setBackground(java.awt.Color.white);
        jPanel8.setLayout(new java.awt.GridLayout(2, 0));

        txtBoPhan.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        txtBoPhan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBoPhan.setText("Nhân Viên");
        jPanel8.add(txtBoPhan);

        txtTenNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        txtTenNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTenNhanVien.setText("Trà Tấn Hưởng");
        jPanel8.add(txtTenNhanVien);

        jPanel6.add(jPanel8);

        jPanel7.setBackground(java.awt.Color.white);
        jPanel7.setLayout(new java.awt.GridLayout(2, 0));

        lbNgayGio.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        lbNgayGio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNgayGio.setText("Thứ 7 - 10/11/2020");
        jPanel7.add(lbNgayGio);

        lbPhienBan.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        lbPhienBan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPhienBan.setText("Version 1.9");
        jPanel7.add(lbPhienBan);

        jPanel6.add(jPanel7);

        pnHeader.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnHeader, java.awt.BorderLayout.PAGE_START);

        pnMain.setBackground(new java.awt.Color(255, 206, 91));
        pnMain.setPreferredSize(new java.awt.Dimension(1366, 685));
        pnMain.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnMain, java.awt.BorderLayout.CENTER);

        pnEnd.setBackground(java.awt.Color.white);
        pnEnd.setPreferredSize(new java.awt.Dimension(1366, 30));
        pnEnd.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(pnEnd, java.awt.BorderLayout.PAGE_END);

        mnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-customer-45.png"))); // NOI18N
        mnKhachHang.setText("Khách Hàng");
        mnKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mnKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnKhachHangMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnKhachHang);

        mnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-bill-45.png"))); // NOI18N
        mnHoaDon.setText("Hóa Đơn");
        mnHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mnHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnHoaDonMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnHoaDon);

        mnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/unnamed.png"))); // NOI18N
        mnNhanVien.setText("Nhân Viên");
        mnNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnNhanVienMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnNhanVien);

        mnNhaCungCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-supplier-45.png"))); // NOI18N
        mnNhaCungCap.setText("Nhà Cung Cấp");
        mnNhaCungCap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mnNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnNhaCungCapMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnNhaCungCap);

        mnSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-product-45.png"))); // NOI18N
        mnSanPham.setText("Sản Phẩm");
        mnSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mnSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSanPhamMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnSanPham);

        mnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-graph-report-script-45.png"))); // NOI18N
        mnThongKe.setText("Thống Kê");
        mnThongKe.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnThongKeMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnThongKe);

        mnTaoPhieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-elections-45.png"))); // NOI18N
        mnTaoPhieu.setText("Tạo Phiếu");
        mnTaoPhieu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        mnPhieuNhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mnPhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-elections-45.png"))); // NOI18N
        mnPhieuNhap.setText("Phiếu Nhập");
        mnPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPhieuNhapActionPerformed(evt);
            }
        });
        mnTaoPhieu.add(mnPhieuNhap);

        mnPhieuXuat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mnPhieuXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-elections-45.png"))); // NOI18N
        mnPhieuXuat.setText("Phiếu Xuất");
        mnPhieuXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPhieuXuatActionPerformed(evt);
            }
        });
        mnTaoPhieu.add(mnPhieuXuat);

        jMenuBar1.add(mnTaoPhieu);

        mnNhieuHon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-more-45.png"))); // NOI18N
        mnNhieuHon.setText("Nhiều Hơn...");
        mnNhieuHon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mnNhieuHon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnNhieuHonMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnNhieuHon);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        this.dispose();
        new jf_DangNhap().setVisible(true);
    }//GEN-LAST:event_btnDangXuatActionPerformed
    
    private void btnThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinActionPerformed
        new jf_ThongTin(nv).setVisible(true);
    }//GEN-LAST:event_btnThongTinActionPerformed
    public void load(Component comp) {
        pnMain.removeAll();
        pnMain.setLayout(new BorderLayout());
        comp.setVisible(true);
        pnMain.add(comp);
        pnMain.validate();
        pnMain.updateUI();
    }
    private void mnKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnKhachHangMouseClicked
        load(new pn_QLKhachHang());
    }//GEN-LAST:event_mnKhachHangMouseClicked

    private void mnHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnHoaDonMouseClicked
        load(new pn_QLHoaDon());
    }//GEN-LAST:event_mnHoaDonMouseClicked

    private void mnNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnNhanVienMouseClicked
        load(new pn_QLNhanVien());
    }//GEN-LAST:event_mnNhanVienMouseClicked

    private void mnNhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnNhaCungCapMouseClicked
        load(new pn_QLNhaCungCap());
    }//GEN-LAST:event_mnNhaCungCapMouseClicked

    private void mnSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSanPhamMouseClicked
        load(new pn_QLSanPham());
    }//GEN-LAST:event_mnSanPhamMouseClicked

    private void mnThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnThongKeMouseClicked
        load(new pn_QLThongKe());
    }//GEN-LAST:event_mnThongKeMouseClicked

    private void mnNhieuHonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnNhieuHonMouseClicked
        load(new pn_QLSub());
    }//GEN-LAST:event_mnNhieuHonMouseClicked

    private void mnPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPhieuNhapActionPerformed
        load(new pn_PhieuNhap());
    }//GEN-LAST:event_mnPhieuNhapActionPerformed

    private void mnPhieuXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPhieuXuatActionPerformed
        load(new pn_PhieuXuat());
    }//GEN-LAST:event_mnPhieuXuatActionPerformed
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_QuanLi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnThongTin;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lbNgayGio;
    private javax.swing.JLabel lbPhienBan;
    private javax.swing.JMenu mnHoaDon;
    private javax.swing.JMenu mnKhachHang;
    private javax.swing.JMenu mnNhaCungCap;
    private javax.swing.JMenu mnNhanVien;
    private javax.swing.JMenu mnNhieuHon;
    private javax.swing.JMenuItem mnPhieuNhap;
    private javax.swing.JMenuItem mnPhieuXuat;
    private javax.swing.JMenu mnSanPham;
    private javax.swing.JMenu mnTaoPhieu;
    private javax.swing.JMenu mnThongKe;
    private javax.swing.JPanel pnEnd;
    private javax.swing.JPanel pnHeader;
    private javax.swing.JPanel pnMain;
    private javax.swing.JLabel txtBoPhan;
    public static javax.swing.JLabel txtTenNhanVien;
    // End of variables declaration//GEN-END:variables
}
