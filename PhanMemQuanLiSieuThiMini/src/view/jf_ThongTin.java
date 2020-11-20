package view;

import controller.SuaNhanVien;
import controller.ThemNhanVien;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import javax.swing.JOptionPane;
import model.ConnectDAO;
import model.NhanVien;

public class jf_ThongTin extends javax.swing.JFrame {

    public jf_ThongTin() {
        initComponents();
    }
    
    public jf_ThongTin(NhanVien nv) {
        initComponents();
        nv = new ThemNhanVien().getNhanVien(nv.getIdNhanVien());
        btnOk.setVisible(false);
        txtMaNhanVien.setEditable(false);
        txtTenBoPhan.setEditable(false);
        txtHoTen.setEditable(false);
        cbGioiTinh.setEnabled(false);
        txtDiaChi.setEditable(false);
        txtSoDienThoai.setEditable(false);
        txtTinhTrang.setEditable(false);
        txtMaNhanVien.setText(nv.getIdNhanVien());
        txtTenBoPhan.setText(nv.getTenBoPhan());
        txtHoTen.setText(nv.getHoTen());
        cbGioiTinh.setSelectedItem(nv.getGioiTinh());
        txtDiaChi.setText(nv.getDiaChi());
        txtSoDienThoai.setText(nv.getSoDienThoai());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtTinhTrang = new javax.swing.JTextField();
        btnThoat = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        txtTenBoPhan = new javax.swing.JTextField();
        cbGioiTinh = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        bg.setMaximumSize(new java.awt.Dimension(600, 700));
        bg.setMinimumSize(new java.awt.Dimension(600, 700));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.orange);
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Thông Tin Tài Khoản");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(170, 10, 350, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-info-45.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(100, 10, 60, 50);

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 70));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel36.setText("ID Nhân Viên");
        bg.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txtMaNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtMaNhanVien.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMaNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(txtMaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 370, 40));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel38.setText("Họ Tên");
        bg.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        txtHoTen.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtHoTen.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtHoTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(txtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 370, 40));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel39.setText("Giới Tính");
        bg.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 100, -1));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel40.setText("Số Điện Thoại");
        bg.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 130, -1));

        txtSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtSoDienThoai.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSoDienThoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(txtSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 370, 40));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel41.setText("Địa Chỉ");
        bg.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 130, -1));

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtDiaChi.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 370, 40));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel42.setText("Tình Trạng");
        bg.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 140, -1));

        txtTinhTrang.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTinhTrang.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTinhTrang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(txtTinhTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 370, 40));

        btnThoat.setBackground(java.awt.Color.orange);
        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/exit.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        bg.add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 160, 60));

        btnSua.setBackground(java.awt.Color.orange);
        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/exit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        bg.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 160, 60));

        btnOk.setBackground(java.awt.Color.orange);
        btnOk.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/exit.png"))); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        bg.add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 160, 60));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel43.setText("Tên Bộ Phận");
        bg.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        txtTenBoPhan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTenBoPhan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTenBoPhan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(txtTenBoPhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 370, 40));

        cbGioiTinh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));
        bg.add(cbGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 370, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        txtHoTen.setEditable(true);
        cbGioiTinh.setEditable(true);
        txtSoDienThoai.setEditable(true);
        cbGioiTinh.setEnabled(true);
        btnSua.setVisible(false);
        btnOk.setVisible(true);
        txtDiaChi.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new jf_DiaChi(txtDiaChi).setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        txtHoTen.setEditable(false);
        cbGioiTinh.setEnabled(false);
        txtSoDienThoai.setEditable(false);
        btnSua.setVisible(true);
        btnOk.setVisible(false);
        if (new SuaNhanVien().Sua(txtHoTen.getText(), cbGioiTinh.getSelectedItem().toString(),
                txtSoDienThoai.getText(), txtDiaChi.getText(), txtMaNhanVien.getText()) == true) {
            this.dispose();
            switch(txtTenBoPhan.getText()) {
                    case "Nhân Viên Bán Hàng" :
                        jf_BanHang.txtTenNhanVien.setText(txtHoTen.getText());
                        break;
                    case "Quản Lí" :
                        jf_QuanLi.txtTenNhanVien.setText(txtHoTen.getText());
                        break;
                    case "Thủ Kho" :
                        jf_ThuKho.txtTenNhanVien.setText(txtHoTen.getText());
                        break; 
                }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Kiểm tra lại giá trị nhập vào");
            txtHoTen.setEditable(true);
            cbGioiTinh.setEnabled(true);
            txtSoDienThoai.setEditable(true);
            btnSua.setVisible(false);
            btnOk.setVisible(true);
        }
    }//GEN-LAST:event_btnOkActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_ThongTin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenBoPhan;
    private javax.swing.JTextField txtTinhTrang;
    // End of variables declaration//GEN-END:variables
}
