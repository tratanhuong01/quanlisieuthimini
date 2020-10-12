package view;

import modal.NhanVien;

public class pnDInfo extends javax.swing.JDialog {
    NhanVien nvs;
    public pnDInfo(java.awt.Frame parent, boolean modal,NhanVien nv) {
        super(parent, modal);
        initComponents();
        this.nvs = nv;
        txtMaNhanVien.setEditable(false);
        txtTenBoPhan.setEditable(false);
        txtHoTen.setEditable(false);
        txtGioiTinh.setEditable(false);
        txtDiaChi.setEditable(false);
        txtSoDienThoai.setEditable(false);
        txtLoaiNhanVien.setEditable(false);
        txtMaNhanVien.setText(nvs.getIdNhanVien());
        txtTenBoPhan.setText(nvs.getTenBoPhan());
        txtHoTen.setText(nvs.getHoTen());
        txtGioiTinh.setText(nvs.getGioiTinh());
        txtDiaChi.setText(nvs.getDiaChi());
        txtSoDienThoai.setText(nvs.getSoDienThoai());
        txtLoaiNhanVien.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtTenBoPhan = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtGioiTinh = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtLoaiNhanVien = new javax.swing.JTextField();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 700));
        setModal(true);
        setSize(new java.awt.Dimension(600, 700));

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 700));
        jPanel1.setLayout(null);

        jPanel2.setBackground(java.awt.Color.orange);
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/info.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(60, 10, 70, 70);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Thông Tin Nhân Viên");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(160, 20, 350, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 600, 90);

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel36.setText("Mã Nhân Viên");
        jPanel1.add(jLabel36);
        jLabel36.setBounds(40, 130, 121, 24);

        txtMaNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtMaNhanVien.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMaNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtMaNhanVien);
        txtMaNhanVien.setBounds(180, 120, 370, 40);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel37.setText("Bộ Phận");
        jPanel1.add(jLabel37);
        jLabel37.setBounds(40, 200, 70, 24);

        txtTenBoPhan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTenBoPhan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTenBoPhan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtTenBoPhan);
        txtTenBoPhan.setBounds(180, 190, 370, 40);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel38.setText("Họ Tên");
        jPanel1.add(jLabel38);
        jLabel38.setBounds(40, 270, 63, 24);

        txtHoTen.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtHoTen.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtHoTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtHoTen);
        txtHoTen.setBounds(180, 260, 370, 40);

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel39.setText("Giới Tính");
        jPanel1.add(jLabel39);
        jLabel39.setBounds(40, 340, 100, 24);

        txtGioiTinh.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtGioiTinh.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtGioiTinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtGioiTinh);
        txtGioiTinh.setBounds(180, 330, 370, 40);

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel40.setText("Số Điện Thoại");
        jPanel1.add(jLabel40);
        jLabel40.setBounds(40, 410, 130, 24);

        txtSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtSoDienThoai.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSoDienThoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSoDienThoai);
        txtSoDienThoai.setBounds(180, 400, 370, 40);

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel41.setText("Địa Chỉ");
        jPanel1.add(jLabel41);
        jLabel41.setBounds(40, 480, 130, 24);

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtDiaChi.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtDiaChi);
        txtDiaChi.setBounds(180, 470, 370, 40);

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel42.setText("Loại Nhân Viên");
        jPanel1.add(jLabel42);
        jLabel42.setBounds(40, 550, 140, 24);

        txtLoaiNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtLoaiNhanVien.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtLoaiNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtLoaiNhanVien);
        txtLoaiNhanVien.setBounds(180, 540, 370, 40);

        btnThoat.setBackground(java.awt.Color.orange);
        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/exit.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel1.add(btnThoat);
        btnThoat.setBounds(230, 610, 160, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLoaiNhanVien;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenBoPhan;
    // End of variables declaration//GEN-END:variables
}
