package view.quanli;

import view.nhanvien.*;
import controller.PTHoaDon;
import controller.ThemKhachHang;
import java.awt.BorderLayout;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import modal.KhachHang;
import modal.NhanVien;
import modal.StringUtil;
import view.DangNhap;
import view.jfBanHang;

public class pnDTaoTaiKhoan extends javax.swing.JDialog {
    public pnDTaoTaiKhoan(java.awt.Frame parent, boolean modal,NhanVien nv,pnMain pnM,JPanel pnBanHang,JMenuItem pnSua) {
        super(parent, modal);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        btnVeTrangChu = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        txtTenDangNhap = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtIDNhanVien = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        cbBoPhan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 700));
        setModal(true);
        setSize(new java.awt.Dimension(600, 700));

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 700));
        jPanel1.setLayout(null);

        jPanel2.setBackground(java.awt.Color.orange);
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 20, 70, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel2.setText("Tạo Tài Khoản Cho Nhân Viên");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(90, 20, 390, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 490, 90);

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel39.setText("Tài Khoản");
        jPanel1.add(jLabel39);
        jLabel39.setBounds(30, 290, 120, 50);

        btnVeTrangChu.setBackground(java.awt.Color.orange);
        btnVeTrangChu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnVeTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/home.png"))); // NOI18N
        btnVeTrangChu.setText("Trang Chủ");
        btnVeTrangChu.setToolTipText("");
        btnVeTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeTrangChuActionPerformed(evt);
            }
        });
        jPanel1.add(btnVeTrangChu);
        btnVeTrangChu.setBounds(30, 480, 191, 70);

        btnLuu.setBackground(java.awt.Color.orange);
        btnLuu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        btnLuu.setText("Tạo ");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel1.add(btnLuu);
        btnLuu.setBounds(250, 480, 190, 70);

        txtTenDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txtTenDangNhap);
        txtTenDangNhap.setBounds(170, 290, 280, 50);

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel41.setText("Mật Khẩu");
        jPanel1.add(jLabel41);
        jLabel41.setBounds(30, 370, 120, 50);

        txtMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txtMatKhau);
        txtMatKhau.setBounds(170, 370, 280, 50);

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel42.setText("ID Nhân Viên");
        jPanel1.add(jLabel42);
        jLabel42.setBounds(30, 210, 130, 50);

        txtIDNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txtIDNhanVien);
        txtIDNhanVien.setBounds(170, 210, 280, 50);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel37.setText("Bộ Phân");
        jPanel1.add(jLabel37);
        jLabel37.setBounds(30, 140, 70, 30);

        cbBoPhan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cbBoPhan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NKH00002", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbBoPhan);
        cbBoPhan.setBounds(170, 130, 280, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVeTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeTrangChuActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVeTrangChuActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        
    }//GEN-LAST:event_btnLuuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnVeTrangChu;
    private javax.swing.JComboBox<String> cbBoPhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtIDNhanVien;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
