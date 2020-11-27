package view.quanli.nhanvien;

public class pn_TaoTaiKhoan extends javax.swing.JFrame {

    public pn_TaoTaiKhoan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnTim = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTenNhanVien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIDNhanVien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tenNhanVien = new javax.swing.JTextField();
        btnTao = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnLoc = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1095, 600));
        setUndecorated(true);
        getContentPane().setLayout(null);

        btnTim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-search-client-45.png"))); // NOI18N
        btnTim.setText("Tìm");

        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-shutdown-45.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("  Tên Nhân Viên");

        txtTenNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("   Số Điện Thoại");

        txtSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 13, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1098, 93);

        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Tài Khoản");

        txtTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Mật Khẩu");

        txtMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("ID Nhân Viên");

        txtIDNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("*******************************************");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Nhân Viên");

        tenNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        btnTao.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-add-new-45.png"))); // NOI18N
        btnTao.setText("Tạo");
        btnTao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(txtIDNhanVien))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tenNhanVien))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTaiKhoan))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatKhau)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnTao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnTao, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(742, 0, 344, 525);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chưa Có Tài Khoản", "Đã Có Tài Khoản" }));
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(10, 30, 250, 50);

        btnLoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-search-client-45.png"))); // NOI18N
        btnLoc.setText("Lọc");
        jPanel2.add(btnLoc);
        btnLoc.setBounds(280, 30, 120, 50);

        jList1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jList1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Bạn cần chọn chế độ chưa có tài khoản", "sau đó bấm nút lọc và chọn vào nhân ", "viên sau đó tiến hành cấp tài khoản cho", "nhân viên" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(410, 10, 320, 100);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(table);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 120, 720, 390);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 100, 1070, 520);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTaoActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pn_TaoTaiKhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnTao;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table;
    private javax.swing.JTextField tenNhanVien;
    private javax.swing.JTextField txtIDNhanVien;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTaiKhoan;
    private javax.swing.JTextField txtTenNhanVien;
    // End of variables declaration//GEN-END:variables
}
