package view;

import java.awt.GridLayout;
import model.NhanVien;

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
        pnMain = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnEnd = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

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

        btnDangXuat.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jPanel5.add(btnDangXuat);
        btnDangXuat.setBounds(210, 10, 190, 70);

        btnThongTin.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
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

        pnMain.setPreferredSize(new java.awt.Dimension(1366, 600));
        pnMain.setLayout(new java.awt.BorderLayout());

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/adminImg.jpg"))); // NOI18N
        pnMain.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(pnMain, java.awt.BorderLayout.CENTER);

        pnEnd.setBackground(java.awt.Color.white);
        pnEnd.setPreferredSize(new java.awt.Dimension(1366, 30));
        pnEnd.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(pnEnd, java.awt.BorderLayout.PAGE_END);

        jMenu1.setText("Khách Hàng");
        jMenuBar1.add(jMenu1);

        jMenu3.setText("Hóa Đơn");
        jMenuBar1.add(jMenu3);

        jMenu2.setText("Nhân Viên");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Nhà Cung Cấp");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Sản Phẩm");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Thống Kê");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Tạo Phiếu");
        jMenuBar1.add(jMenu7);

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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lbNgayGio;
    private javax.swing.JLabel lbPhienBan;
    private javax.swing.JPanel pnEnd;
    private javax.swing.JPanel pnHeader;
    private javax.swing.JPanel pnMain;
    private javax.swing.JLabel txtBoPhan;
    public static javax.swing.JLabel txtTenNhanVien;
    // End of variables declaration//GEN-END:variables
}
