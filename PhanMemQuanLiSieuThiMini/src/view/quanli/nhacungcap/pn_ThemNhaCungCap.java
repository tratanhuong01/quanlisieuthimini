package view.quanli.nhacungcap;

public class pn_ThemNhaCungCap extends javax.swing.JFrame {

    public pn_ThemNhaCungCap() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        btnVeTrangChu = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        cbNhomKhachHang = new javax.swing.JComboBox<>();
        txtIDKhachHang = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtDiaChi1 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtDiaChi3 = new javax.swing.JTextField();
        txtDiaChi4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 740));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 740));
        jPanel1.setLayout(null);

        jPanel2.setBackground(java.awt.Color.orange);
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Thêm Nhà Cung Cấp");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(170, 20, 350, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-login-45.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(100, 20, 60, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 600, 90);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel37.setText("Nhóm Khách Hàng");
        jPanel1.add(jLabel37);
        jLabel37.setBounds(40, 130, 157, 24);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel38.setText("Nhà Cung Cấp");
        jPanel1.add(jLabel38);
        jLabel38.setBounds(40, 270, 140, 24);

        txtHoTen.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtHoTen.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtHoTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtHoTen);
        txtHoTen.setBounds(220, 260, 330, 40);

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel40.setText("Số Điện Thoại");
        jPanel1.add(jLabel40);
        jLabel40.setBounds(40, 340, 130, 24);

        txtSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtSoDienThoai.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSoDienThoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSoDienThoai);
        txtSoDienThoai.setBounds(220, 330, 330, 40);

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel41.setText("Địa Chỉ");
        jPanel1.add(jLabel41);
        jLabel41.setBounds(40, 410, 130, 24);

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtDiaChi.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtDiaChi);
        txtDiaChi.setBounds(220, 400, 330, 40);

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
        jPanel1.add(btnVeTrangChu);
        btnVeTrangChu.setBounds(66, 657, 200, 70);

        btnLuu.setBackground(java.awt.Color.orange);
        btnLuu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-login-45.png"))); // NOI18N
        btnLuu.setText("Thêm");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel1.add(btnLuu);
        btnLuu.setBounds(325, 657, 200, 70);

        cbNhomKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cbNhomKhachHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NKH00002", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbNhomKhachHang);
        cbNhomKhachHang.setBounds(220, 120, 330, 40);

        txtIDKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtIDKhachHang.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIDKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtIDKhachHang);
        txtIDKhachHang.setBounds(220, 190, 330, 40);

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel42.setText("IDKhachHang");
        jPanel1.add(jLabel42);
        jLabel42.setBounds(40, 200, 140, 24);

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel43.setText("Mã Số Thuê");
        jPanel1.add(jLabel43);
        jLabel43.setBounds(40, 480, 130, 24);

        txtDiaChi1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtDiaChi1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDiaChi1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtDiaChi1);
        txtDiaChi1.setBounds(220, 470, 330, 40);

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel44.setText("Thu DK");
        jPanel1.add(jLabel44);
        jLabel44.setBounds(40, 545, 130, 24);

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel45.setText("Tra DK");
        jPanel1.add(jLabel45);
        jLabel45.setBounds(40, 610, 130, 24);

        txtDiaChi3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtDiaChi3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDiaChi3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtDiaChi3);
        txtDiaChi3.setBounds(220, 600, 330, 40);

        txtDiaChi4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtDiaChi4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDiaChi4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtDiaChi4);
        txtDiaChi4.setBounds(220, 540, 330, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pn_ThemNhaCungCap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnVeTrangChu;
    private javax.swing.JComboBox<String> cbNhomKhachHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDiaChi1;
    private javax.swing.JTextField txtDiaChi3;
    private javax.swing.JTextField txtDiaChi4;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtIDKhachHang;
    private javax.swing.JTextField txtSoDienThoai;
    // End of variables declaration//GEN-END:variables
}
