package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import model.NhanVien;
import view.kho.pn_KiemKeTK;
import view.kho.pn_NhapHangTK;
import view.kho.pn_XuatHangTK;
import view.quanli.phieu.pn_PhieuNhap;
import view.quanli.phieu.pn_PhieuXuat;
import view.quanli.hoadon.pn_QLHoaDon;
import view.quanli.khachhang.pn_QLKhachHang;
import view.quanli.nhacungcap.pn_QLNhaCungCap;
import view.quanli.nhanvien.pn_QLNhanVien;
import view.quanli.sanpham.pn_QLSanPham;
import view.quanli.danhmuc.pn_QLSub;
import view.quanli.thongke.pn_QLThongKe;

public class jf_ThuKho extends javax.swing.JFrame {
    NhanVien nv;

    public jf_ThuKho() {
        initComponents();
    }
    
    public jf_ThuKho(NhanVien nv) {
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
        pnEnd = new javax.swing.JPanel();
        pnMain = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnTaoPhieu = new javax.swing.JMenu();
        mnNhapHang = new javax.swing.JMenuItem();
        mnXuatHang = new javax.swing.JMenuItem();
        mbKiemKe = new javax.swing.JMenuItem();
        mnNhieuHon = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));

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

        pnEnd.setBackground(java.awt.Color.white);
        pnEnd.setPreferredSize(new java.awt.Dimension(1366, 30));
        pnEnd.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(pnEnd, java.awt.BorderLayout.PAGE_END);

        pnMain.setPreferredSize(new java.awt.Dimension(1366, 600));
        getContentPane().add(pnMain, java.awt.BorderLayout.CENTER);

        mnTaoPhieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-elections-45.png"))); // NOI18N
        mnTaoPhieu.setText("Sản Phẩm");
        mnTaoPhieu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        mnNhapHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mnNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-elections-45.png"))); // NOI18N
        mnNhapHang.setText("Nhập Hàng");
        mnNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNhapHangActionPerformed(evt);
            }
        });
        mnTaoPhieu.add(mnNhapHang);

        mnXuatHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mnXuatHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-elections-45.png"))); // NOI18N
        mnXuatHang.setText("Xuất Hàng");
        mnXuatHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnXuatHangActionPerformed(evt);
            }
        });
        mnTaoPhieu.add(mnXuatHang);

        mbKiemKe.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mbKiemKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-elections-45.png"))); // NOI18N
        mbKiemKe.setText("Kiểm Kê");
        mbKiemKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbKiemKeActionPerformed(evt);
            }
        });
        mnTaoPhieu.add(mbKiemKe);

        jMenuBar1.add(mnTaoPhieu);

        mnNhieuHon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-more-45.png"))); // NOI18N
        mnNhieuHon.setText("Danh Mục");
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
    private void mnNhieuHonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnNhieuHonMouseClicked
        
    }//GEN-LAST:event_mnNhieuHonMouseClicked

    private void mnXuatHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnXuatHangActionPerformed
        load(new pn_XuatHangTK());
    }//GEN-LAST:event_mnXuatHangActionPerformed

    private void mnNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNhapHangActionPerformed
        load(new pn_NhapHangTK());
    }//GEN-LAST:event_mnNhapHangActionPerformed

    private void mbKiemKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbKiemKeActionPerformed
        load(new pn_KiemKeTK());
    }//GEN-LAST:event_mbKiemKeActionPerformed
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_ThuKho().setVisible(true);
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
    private javax.swing.JMenuItem mbKiemKe;
    private javax.swing.JMenuItem mnNhapHang;
    private javax.swing.JMenu mnNhieuHon;
    private javax.swing.JMenu mnTaoPhieu;
    private javax.swing.JMenuItem mnXuatHang;
    private javax.swing.JPanel pnEnd;
    private javax.swing.JPanel pnHeader;
    private javax.swing.JPanel pnMain;
    private javax.swing.JLabel txtBoPhan;
    public static javax.swing.JLabel txtTenNhanVien;
    // End of variables declaration//GEN-END:variables
}
