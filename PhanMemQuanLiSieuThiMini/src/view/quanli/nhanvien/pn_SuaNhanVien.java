package view.quanli.nhanvien;

import controller.ThemNhanVien;
import model.NhanVien;

public class pn_SuaNhanVien extends javax.swing.JFrame {
    NhanVien nv;
    public pn_SuaNhanVien(NhanVien nv) {
        initComponents();
        this.nv = nv;
        txtIDNhanVien.setText(nv.getHoTen());
        txtDiaChi.setText(nv.getDiaChi());
        txtSoDienThoai.setText(nv.getSoDienThoai());
        cbGioiTinh.setSelectedItem(nv.getGioiTinh());
        cbTinhTrang.setSelectedItem(get(nv.getTinhTrang()));
    }
    public String get(int a) {
        String s = "";
        switch (a) {
            case 0 : 
                s = "Nghĩ Việc";
                break;
            case 1 : 
                s = "Đang Làm";
                break;
            case 2 : 
                s = "Nghĩ Phép";
                break;
            case 3 : 
                s = "Đình Chỉ";
                break;
        }
        return s;
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
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        btnVeTrangChu = new javax.swing.JButton();
        cbTinhTrang = new javax.swing.JComboBox<>();
        btnLuu = new javax.swing.JButton();
        cbBoPhan = new javax.swing.JComboBox<>();
        txtIDNhanVien = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        cbGioiTinh = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 700));
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 700));
        jPanel1.setLayout(null);

        jPanel2.setBackground(java.awt.Color.orange);
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Sửa Nhân Viên");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(160, 0, 440, 90);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 600, 90);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel37.setText("Bộ Phân");
        jPanel1.add(jLabel37);
        jLabel37.setBounds(40, 130, 70, 24);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel38.setText("Họ Tên");
        jPanel1.add(jLabel38);
        jLabel38.setBounds(40, 270, 63, 24);

        txtHoTen.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtHoTen.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtHoTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtHoTen);
        txtHoTen.setBounds(220, 260, 330, 40);

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel39.setText("Giới Tính");
        jPanel1.add(jLabel39);
        jLabel39.setBounds(40, 340, 100, 24);

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel40.setText("Số Điện Thoại");
        jPanel1.add(jLabel40);
        jLabel40.setBounds(40, 420, 130, 24);

        txtSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtSoDienThoai.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSoDienThoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSoDienThoai);
        txtSoDienThoai.setBounds(220, 410, 330, 40);

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel41.setText("Địa Chỉ");
        jPanel1.add(jLabel41);
        jLabel41.setBounds(40, 500, 130, 24);

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtDiaChi.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDiaChi.setEnabled(false);
        jPanel1.add(txtDiaChi);
        txtDiaChi.setBounds(220, 490, 330, 40);

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
        btnVeTrangChu.setBounds(70, 630, 200, 70);

        cbTinhTrang.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cbTinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));
        jPanel1.add(cbTinhTrang);
        cbTinhTrang.setBounds(220, 560, 330, 40);

        btnLuu.setBackground(java.awt.Color.orange);
        btnLuu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-login-45.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel1.add(btnLuu);
        btnLuu.setBounds(330, 630, 200, 70);

        cbBoPhan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cbBoPhan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NKH00002", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbBoPhan);
        cbBoPhan.setBounds(220, 120, 330, 40);

        txtIDNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtIDNhanVien.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIDNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIDNhanVien.setEnabled(false);
        jPanel1.add(txtIDNhanVien);
        txtIDNhanVien.setBounds(220, 190, 330, 40);

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel42.setText("ID Nhân Viên");
        jPanel1.add(jLabel42);
        jLabel42.setBounds(40, 200, 140, 24);

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel43.setText("Tình Trạng");
        jPanel1.add(jLabel43);
        jLabel43.setBounds(40, 570, 130, 24);

        cbGioiTinh.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));
        jPanel1.add(cbGioiTinh);
        cbGioiTinh.setBounds(220, 330, 330, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
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

//    public static void main(String args[]) {
//  
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new pn_SuaNhanVien().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnVeTrangChu;
    private javax.swing.JComboBox<String> cbBoPhan;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JComboBox<String> cbTinhTrang;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtIDNhanVien;
    private javax.swing.JTextField txtSoDienThoai;
    // End of variables declaration//GEN-END:variables
}
