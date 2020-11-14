package view;

import controller.DangNhapController;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ConnectDAO;
import model.DAO;
import model.NhanVien;
import java.sql.*;

public class jf_DangNhap extends javax.swing.JFrame {

    public jf_DangNhap() {
        initComponents();
        loadBoPhan();
    }

    public void loadBoPhan() {
        ArrayList list = new DAO().getBoPhan();
        for (int i = 0; i < list.size(); i++) {
            cbBoPhan.addItem((String) list.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        cbBoPhan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        btnDangNhap = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(770, 605));
        setMinimumSize(new java.awt.Dimension(770, 605));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(770, 605));
        setResizable(false);
        setSize(new java.awt.Dimension(770, 642));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Chọn");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Mật khẩu");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        txtTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        getContentPane().add(txtTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 268, 49));

        cbBoPhan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        getContentPane().add(cbBoPhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 268, 48));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Tài khoản");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-shutdown-45.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 460, 160, 60));

        btnDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-login-45.png"))); // NOI18N
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        getContentPane().add(btnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 190, 60));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Quản Lí Siêu Thị Mini");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 470, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/pngtree-supermarket-big-promotion-cute-cartoon-banner-image_196194.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 150));
        getContentPane().add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 270, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public String checkTaiKhoan(String taikhoan) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT IDNhanVien FROM TaiKhoan WHERE TaiKhoan = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, taikhoan);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        NhanVien nv = new DangNhapController().getNhanVien(txtTaiKhoan.getText(),
                txtMatKhau.getText(), cbBoPhan.getSelectedItem().toString(), checkTaiKhoan(txtTaiKhoan.getText()));
        switch (cbBoPhan.getSelectedItem().toString()) {
            case "Quản Lí":
                if (nv != null) {
                    this.dispose();
                    new jf_QuanLi(nv).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Sai Tên Đăng Nhập Hoặc Mật Khẩu");
                }
                break;
            case "Nhân Viên Bán Hàng":
                if (nv != null) {
                    this.dispose();
                    new jf_BanHang(nv).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Sai Tên Đăng Nhập Hoặc Mật Khẩu");
                }
                break;
            case "Thủ Kho":
                if (nv != null) {
                    this.dispose();
                    new jf_ThuKho(nv).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Sai Tên Đăng Nhập Hoặc Mật Khẩu");
                }
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> cbBoPhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
