package view;

import view.nvbanhang.jf_ThemKhachHang;
import java.awt.Component;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.KhachHang;
import model.NhanVien;

public class jf_BanHang extends javax.swing.JFrame {

    NhanVien nv;
    JTextField txtTenKhachHang;
    KhachHang kh = null;

    public jf_BanHang() {
        initComponents();
        
    }

    public jf_BanHang(NhanVien nv) {
        initComponents();
        this.nv = nv;
        txtBoPhan.setText(nv.getTenBoPhan());
        txtTenNhanVien.setText(nv.getHoTen());
        pnMain.setLayout(new GridLayout());
        pnMain.removeAll();
        JLabel lb = new JLabel();
        lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/sieu-thi-mini.jpg"))); // NOI18N
        lb.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        pnMain.add(lb);
        pnMain.updateUI();
        pnMain.add(lb);
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
        jButton1 = new javax.swing.JButton();
        pnMain = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnThemKhachHang = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

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

        btnDangXuat.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
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

        btnThongTin.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
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

        jButton1.setText("Lịch");

        javax.swing.GroupLayout pnEndLayout = new javax.swing.GroupLayout(pnEnd);
        pnEnd.setLayout(pnEndLayout);
        pnEndLayout.setHorizontalGroup(
            pnEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEndLayout.createSequentialGroup()
                .addGap(0, 1219, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnEndLayout.setVerticalGroup(
            pnEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEndLayout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        getContentPane().add(pnEnd, java.awt.BorderLayout.PAGE_END);

        pnMain.setMinimumSize(new java.awt.Dimension(1366, 601));

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        getContentPane().add(pnMain, java.awt.BorderLayout.CENTER);

        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-customer-45.png"))); // NOI18N
        jMenu1.setText("Khách Hàng");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        mnThemKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-add-male-user-45.png"))); // NOI18N
        mnThemKhachHang.setText("Thêm Khách Hàng");
        mnThemKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mnThemKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnThemKhachHangMouseClicked(evt);
            }
        });
        jMenu1.add(mnThemKhachHang);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-bill-45.png"))); // NOI18N
        jMenu3.setText("Hóa Đơn");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu3);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-report-file-45.png"))); // NOI18N
        jMenu2.setText("Báo Cáo");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu2);

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

    private void mnThemKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnThemKhachHangMouseClicked
        new jf_ThemKhachHang(nv, pnMain).setVisible(true);
    }//GEN-LAST:event_mnThemKhachHangMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_BanHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnThongTin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lbNgayGio;
    private javax.swing.JLabel lbPhienBan;
    private javax.swing.JMenu mnThemKhachHang;
    private javax.swing.JPanel pnEnd;
    private javax.swing.JPanel pnHeader;
    public static javax.swing.JPanel pnMain;
    private javax.swing.JLabel txtBoPhan;
    public static javax.swing.JLabel txtTenNhanVien;
    // End of variables declaration//GEN-END:variables

}
