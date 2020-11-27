package view.quanli.khachhang;

import controller.SuaKhachHang;
import javax.swing.JOptionPane;
import model.KhachHang;
import view.jf_DiaChi;
import view.quanli.nhacungcap.*;

public class pn_SuaKhachHang extends javax.swing.JFrame {

    KhachHang kh;

    public pn_SuaKhachHang(KhachHang kh) {
        initComponents();
        this.kh = kh;
        txtIDKhachHang.setText(kh.getIdKhachHang());
        txtHoTen.setText(kh.getHoTen());
        txtSoDienThoai.setText(kh.getHoTen());
        txtDiaChi.setText(kh.getDiaChi());
        cbGioiTinh.setSelectedItem(kh.getGioiTinh());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        btnVeTrangChu = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        cbNhomKhachHang = new javax.swing.JComboBox<>();
        txtIDKhachHang = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        cbGioiTinh = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 595));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 595));

        jPanel2.setBackground(java.awt.Color.orange);
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Sửa Khách Hàng");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(170, 20, 350, 50);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel37.setText("Nhóm Khách Hàng");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel38.setText("Họ Tên");

        txtHoTen.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtHoTen.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtHoTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel40.setText("Giới Tính");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel41.setText("Địa Chỉ");

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtDiaChi.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDiaChi.setEnabled(false);
        txtDiaChi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDiaChiMouseClicked(evt);
            }
        });

        btnVeTrangChu.setBackground(java.awt.Color.orange);
        btnVeTrangChu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnVeTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-shutdown-45.png"))); // NOI18N
        btnVeTrangChu.setText("Thoát");
        btnVeTrangChu.setToolTipText("");
        btnVeTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeTrangChuActionPerformed(evt);
            }
        });

        btnLuu.setBackground(java.awt.Color.orange);
        btnLuu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-login-45.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        cbNhomKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cbNhomKhachHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NKH00002", "Item 2", "Item 3", "Item 4" }));
        cbNhomKhachHang.setEnabled(false);

        txtIDKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtIDKhachHang.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIDKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIDKhachHang.setEnabled(false);

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel42.setText("IDKhachHang");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel43.setText("Số Điện Thoại");

        txtSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtSoDienThoai.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSoDienThoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbGioiTinh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel37)
                .addGap(23, 23, 23)
                .addComponent(cbNhomKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtIDKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnVeTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(cbGioiTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel37))
                    .addComponent(cbNhomKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel42))
                    .addComponent(txtIDKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel38))
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVeTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVeTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeTrangChuActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVeTrangChuActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        new SuaKhachHang().Sua(txtIDKhachHang.getText(), txtHoTen.getText(), cbGioiTinh.getSelectedItem().toString(),
                 txtSoDienThoai.getText(), txtDiaChi.getText());
        this.dispose();
    }//GEN-LAST:event_btnLuuActionPerformed

    private void txtDiaChiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiaChiMouseClicked
        new jf_DiaChi(txtDiaChi).setVisible(true);
        
    }//GEN-LAST:event_txtDiaChiMouseClicked

//    public static void main(String args[]) {
//        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new pn_SuaKhachHang().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnVeTrangChu;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JComboBox<String> cbNhomKhachHang;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtIDKhachHang;
    private javax.swing.JTextField txtSoDienThoai;
    // End of variables declaration//GEN-END:variables
}
