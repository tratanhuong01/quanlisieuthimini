package view.quanli;

import view.nhanvien.*;
import java.awt.BorderLayout;
import java.awt.Dialog.ModalityType;
import javax.swing.JDialog;
import javax.swing.JFrame;
import modal.ImageIconSoftware;
import modal.NhanVien;

public class jfQuanLi extends javax.swing.JFrame {
    NhanVien nvs;
    public jfQuanLi() {
        initComponents();
        this.setTitle("Quản Lí Siêu Thị Mini");
        this.setIconImage(new ImageIconSoftware().createImageIcon().getImage());
    }

    public jfQuanLi(NhanVien nv) {
        initComponents();
        this.setTitle("Quản Lí Siêu Thị Mini");
        this.setIconImage(new ImageIconSoftware().createImageIcon().getImage());
        this.nvs = nv;
        lbBoPhan.setText(nvs.getTenBoPhan());
        lbTenNhanVien.setText(nvs.getHoTen());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnBanHang = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbBoPhan = new javax.swing.JLabel();
        lbTenNhanVien = new javax.swing.JLabel();
        bnDangXuat = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        pnThongTin = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnThemKhachHang = new javax.swing.JMenu();
        pnThemKhachHang = new javax.swing.JMenuItem();
        pnThemKhachHang1 = new javax.swing.JMenuItem();
        pnThemKhachHang2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        mnThemKhachHang1 = new javax.swing.JMenu();
        pnThemKhachHang4 = new javax.swing.JMenuItem();
        pnThemKhachHang5 = new javax.swing.JMenuItem();
        pnThemKhachHang6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1440, 850));
        setSize(new java.awt.Dimension(1440, 850));

        jPanel1.setEnabled(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(1440, 850));
        jPanel1.setMinimumSize(new java.awt.Dimension(1440, 850));
        jPanel1.setLayout(null);

        pnBanHang.setBackground(java.awt.Color.white);
        pnBanHang.setMaximumSize(new java.awt.Dimension(1440, 740));
        pnBanHang.setMinimumSize(new java.awt.Dimension(1440, 740));
        pnBanHang.setRequestFocusEnabled(false);
        pnBanHang.setLayout(null);
        jPanel1.add(pnBanHang);
        pnBanHang.setBounds(0, 110, 1440, 740);

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/logo.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 300, 90);

        lbBoPhan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbBoPhan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBoPhan.setText("Nhân Viên");
        jPanel2.add(lbBoPhan);
        lbBoPhan.setBounds(300, 10, 470, 30);

        lbTenNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbTenNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTenNhanVien.setText("Trà Tấn Hưởng");
        jPanel2.add(lbTenNhanVien);
        lbTenNhanVien.setBounds(300, 60, 470, 30);

        bnDangXuat.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Đăng Xuất");
        bnDangXuat.add(jLabel7);
        jLabel7.setBounds(80, 0, 100, 70);

        jPanel5.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/info.png"))); // NOI18N
        jPanel5.add(jLabel8);
        jLabel8.setBounds(0, 0, 70, 70);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("Thông Tin");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(80, 0, 100, 70);

        bnDangXuat.add(jPanel5);
        jPanel5.setBounds(740, 10, 180, 70);

        jPanel6.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/info.png"))); // NOI18N
        jPanel6.add(jLabel10);
        jLabel10.setBounds(0, 0, 70, 70);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setText("Thông Tin");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(80, 0, 100, 70);

        jPanel7.setLayout(null);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/info.png"))); // NOI18N
        jPanel7.add(jLabel12);
        jLabel12.setBounds(0, 0, 70, 70);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setText("Thông Tin");
        jPanel7.add(jLabel13);
        jLabel13.setBounds(80, 0, 100, 70);

        jPanel6.add(jPanel7);
        jPanel7.setBounds(740, 10, 180, 70);

        bnDangXuat.add(jPanel6);
        jPanel6.setBounds(740, 10, 180, 70);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/exit.png"))); // NOI18N
        bnDangXuat.add(jLabel30);
        jLabel30.setBounds(0, 0, 70, 70);

        jPanel2.add(bnDangXuat);
        bnDangXuat.setBounds(1250, 10, 180, 70);

        pnThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnThongTinMouseClicked(evt);
            }
        });
        pnThongTin.setLayout(null);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/info.png"))); // NOI18N
        pnThongTin.add(jLabel14);
        jLabel14.setBounds(0, 0, 60, 70);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setText("Thông Tin");
        pnThongTin.add(jLabel15);
        jLabel15.setBounds(70, 0, 100, 70);

        jPanel9.setLayout(null);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/info.png"))); // NOI18N
        jPanel9.add(jLabel16);
        jLabel16.setBounds(0, 0, 70, 70);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel17.setText("Thông Tin");
        jPanel9.add(jLabel17);
        jLabel17.setBounds(80, 0, 100, 70);

        pnThongTin.add(jPanel9);
        jPanel9.setBounds(740, 10, 180, 70);

        jPanel10.setLayout(null);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/info.png"))); // NOI18N
        jPanel10.add(jLabel18);
        jLabel18.setBounds(0, 0, 70, 70);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel19.setText("Thông Tin");
        jPanel10.add(jLabel19);
        jLabel19.setBounds(80, 0, 100, 70);

        jPanel11.setLayout(null);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/info.png"))); // NOI18N
        jPanel11.add(jLabel20);
        jLabel20.setBounds(0, 0, 70, 70);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel21.setText("Thông Tin");
        jPanel11.add(jLabel21);
        jLabel21.setBounds(80, 0, 100, 70);

        jPanel10.add(jPanel11);
        jPanel11.setBounds(740, 10, 180, 70);

        pnThongTin.add(jPanel10);
        jPanel10.setBounds(740, 10, 180, 70);

        jPanel2.add(pnThongTin);
        pnThongTin.setBounds(1060, 10, 180, 70);

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel31.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.shadow"));
        jLabel31.setText("Version 4.2 - Updated");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(830, 50, 200, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Thứ ba  - 25/09/2020 -  12:30");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(800, 10, 260, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1440, 90);

        mnThemKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/users.png"))); // NOI18N
        mnThemKhachHang.setText("Khách Hàng");

        pnThemKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        pnThemKhachHang.setText("Thông Tin Khách Hàng");
        mnThemKhachHang.add(pnThemKhachHang);

        pnThemKhachHang1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        pnThemKhachHang1.setText("Tìm Kiếm Khách Hàng");
        mnThemKhachHang.add(pnThemKhachHang1);

        pnThemKhachHang2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        pnThemKhachHang2.setText("Lọc Khách Hàng");
        mnThemKhachHang.add(pnThemKhachHang2);

        jMenuBar1.add(mnThemKhachHang);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-hoadon.png"))); // NOI18N
        jMenu2.setText("Hóa Đơn");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jMenuItem3.setText("Tra Cứu Hóa Đơn");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-hoadon.png"))); // NOI18N
        jMenu3.setText("Nhân Viên");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jMenuItem4.setText("Thêm Nhân Viên");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jMenuItem5.setText("Xóa Nhân Viên");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jMenuItem6.setText("Sửa Nhân Viên");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jMenuItem7.setText("Lương ");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jMenuItem8.setText("Chi Tiết Nhân Viên");
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-hoadon.png"))); // NOI18N
        jMenu4.setText("Kho");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jMenuItem9.setText("Tạo Phiếu Nhập Hàng");
        jMenu4.add(jMenuItem9);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jMenuItem10.setText("Tạo Phiếu Xuất Hàng");
        jMenu4.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jMenuItem11.setText("Kiểm Tra Hàng Tồn");
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-hoadon.png"))); // NOI18N
        jMenu5.setText("Thống Kê");

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jMenuItem14.setText("Doanh Thu ");
        jMenu5.add(jMenuItem14);

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jMenuItem15.setText("Sản Phẩm Bán Chạy");
        jMenu5.add(jMenuItem15);

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jMenu5.add(jMenuItem16);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-hoadon.png"))); // NOI18N
        jMenu6.setText("Phần Mềm");

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jMenuItem17.setText("Cập Nhật ");
        jMenu6.add(jMenuItem17);

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jMenuItem18.setText("Thông Tin ");
        jMenu6.add(jMenuItem18);

        jMenuBar1.add(jMenu6);

        mnThemKhachHang1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/users.png"))); // NOI18N
        mnThemKhachHang1.setText("Nhà Cung Cấp");

        pnThemKhachHang4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        pnThemKhachHang4.setText("Thêm Nhà Cung Cấp");
        mnThemKhachHang1.add(pnThemKhachHang4);

        pnThemKhachHang5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        pnThemKhachHang5.setText("Sửa Nhà Cung Cấp");
        mnThemKhachHang1.add(pnThemKhachHang5);

        pnThemKhachHang6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        mnThemKhachHang1.add(pnThemKhachHang6);

        jMenuBar1.add(mnThemKhachHang1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnThongTinMouseClicked
        jfQuanLi nv = new jfQuanLi();
        pnDInfo info = new pnDInfo(nv, true);
        info.setModalityType(ModalityType.APPLICATION_MODAL);
        info.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        info.setVisible(true);
    }//GEN-LAST:event_pnThongTinMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfQuanLi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bnDangXuat;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbBoPhan;
    private javax.swing.JLabel lbTenNhanVien;
    private javax.swing.JMenu mnThemKhachHang;
    private javax.swing.JMenu mnThemKhachHang1;
    private javax.swing.JPanel pnBanHang;
    private javax.swing.JMenuItem pnThemKhachHang;
    private javax.swing.JMenuItem pnThemKhachHang1;
    private javax.swing.JMenuItem pnThemKhachHang2;
    private javax.swing.JMenuItem pnThemKhachHang4;
    private javax.swing.JMenuItem pnThemKhachHang5;
    private javax.swing.JMenuItem pnThemKhachHang6;
    private javax.swing.JPanel pnThongTin;
    // End of variables declaration//GEN-END:variables
}
