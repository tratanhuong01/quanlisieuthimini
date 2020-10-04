package view;

import controller.LoginController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modal.ConnectDAO;
import modal.DAO;
import modal.NhanVien;
import view.nhanvien.nvBanHang;
import view.quanli.jfQuanLi;
import view.thukho.jfThuKho;
import java.sql.*;

public class DangNhap extends javax.swing.JFrame {
    
    public DangNhap() {
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
        setTitle("Đăng Nhập Hệ Thống");
        setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        setMinimumSize(new java.awt.Dimension(770, 605));
        setResizable(false);
        setSize(new java.awt.Dimension(770, 642));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Chọn");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 220, 44, 24);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Mật khẩu");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 370, 81, 24);

        txtTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        getContentPane().add(txtTaiKhoan);
        txtTaiKhoan.setBounds(320, 290, 268, 49);

        cbBoPhan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        getContentPane().add(cbBoPhan);
        cbBoPhan.setBounds(320, 210, 268, 48);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Tài khoản");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 300, 84, 24);

        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnThoat.setText("Thoát");
        getContentPane().add(btnThoat);
        btnThoat.setBounds(240, 460, 134, 49);

        btnDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        getContentPane().add(btnDangNhap);
        btnDangNhap.setBounds(400, 460, 134, 49);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Quản Lí Siêu Thị Mini");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 50, 470, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/pngtree-supermarket-big-promotion-cute-cartoon-banner-image_196194.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 770, 150);
        getContentPane().add(txtMatKhau);
        txtMatKhau.setBounds(320, 360, 270, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        NhanVien nv = new LoginController().getNhanVien(txtTaiKhoan.getText(), txtMatKhau.getText(), cbBoPhan.getSelectedItem().toString());
        System.out.println(nv.getHoTen());
        if (cbBoPhan.getSelectedItem().equals("Quản Lí")) {
            if (nv != null) {
                this.setVisible(false);
                new jfQuanLi(nv).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Sai Tên Đăng Nhập Hoặc Mật Khẩu");
            }
        } else if (cbBoPhan.getSelectedItem().equals("Nhân Viên Bán Hàng")) {
            if (nv != null) {
                this.setVisible(false);
                new nvBanHang(nv).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Sai Tên Đăng Nhập Hoặc Mật Khẩu");
            }
        } else {
            if (nv != null) {
                this.setVisible(false);
                
                new jfThuKho(nv).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Sai Tên Đăng Nhập Hoặc Mật Khẩu");
            }
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
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
