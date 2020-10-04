package view.nhanvien;

public class pnDSoLuong extends javax.swing.JDialog {

    public pnDSoLuong(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hinhSanPham = new javax.swing.JLabel();
        lbGiaSanPham = new javax.swing.JLabel();
        lbTenSanPham = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        btnTang = new javax.swing.JButton();
        btnGiam = new javax.swing.JButton();
        btnChon = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setSize(new java.awt.Dimension(400, 300));

        jPanel1.setBackground(java.awt.Color.orange);
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Số Lượng Sản Phẩm");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 0, 220, 60);

        hinhSanPham.setText("jLabel2");
        jPanel1.add(hinhSanPham);
        hinhSanPham.setBounds(20, 60, 70, 80);

        lbGiaSanPham.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbGiaSanPham.setForeground(java.awt.Color.red);
        lbGiaSanPham.setText("Thịt bò 500g");
        jPanel1.add(lbGiaSanPham);
        lbGiaSanPham.setBounds(110, 110, 270, 30);

        lbTenSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbTenSanPham.setText("Thịt bò 500g");
        jPanel1.add(lbTenSanPham);
        lbTenSanPham.setBounds(110, 70, 280, 40);

        txtSoLuong.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSoLuong.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoLuong.setText("0");
        jPanel1.add(txtSoLuong);
        txtSoLuong.setBounds(160, 160, 70, 40);

        btnTang.setBackground(java.awt.Color.white);
        btnTang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTang.setText("+");
        btnTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTangActionPerformed(evt);
            }
        });
        jPanel1.add(btnTang);
        btnTang.setBounds(270, 160, 50, 40);

        btnGiam.setBackground(java.awt.Color.white);
        btnGiam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGiam.setText("-");
        btnGiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiamActionPerformed(evt);
            }
        });
        jPanel1.add(btnGiam);
        btnGiam.setBounds(70, 160, 50, 40);

        btnChon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnChon.setText("Chọn");
        jPanel1.add(btnChon);
        btnChon.setBounds(220, 230, 100, 50);

        btnHuy.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnHuy.setText("Hủy");
        jPanel1.add(btnHuy);
        btnHuy.setBounds(70, 230, 100, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTangActionPerformed
        int sl = Integer.parseInt(txtSoLuong.getText());
        sl++;
        txtSoLuong.setText(String.valueOf(sl));
    }//GEN-LAST:event_btnTangActionPerformed

    private void btnGiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiamActionPerformed
        int sl = Integer.parseInt(txtSoLuong.getText());
        sl--;
        txtSoLuong.setText(String.valueOf(sl));
    }//GEN-LAST:event_btnGiamActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChon;
    private javax.swing.JButton btnGiam;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnTang;
    private javax.swing.JLabel hinhSanPham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbGiaSanPham;
    private javax.swing.JLabel lbTenSanPham;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration//GEN-END:variables
}
