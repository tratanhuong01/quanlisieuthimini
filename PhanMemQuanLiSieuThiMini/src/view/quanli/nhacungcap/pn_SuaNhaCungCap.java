package view.quanli.nhacungcap;

import controller.LoadTable;
import controller.SuaKhachHang;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.KhachHang;
import view.jf_DiaChi;

public class pn_SuaNhaCungCap extends javax.swing.JFrame {
    JTable listNhaCungCap;
    public pn_SuaNhaCungCap(KhachHang kh,JTable listNhaCungCap) {
        initComponents();
        this.listNhaCungCap = listNhaCungCap;
        txtIDKhachHang.setEditable(false);
        txtNhomKhachHang.setEditable(false);
        txtDiaChi.setEditable(false);
        txtNhomKhachHang.setText(kh.getTenNhomKhachHang());
        txtIDKhachHang.setText(kh.getIdKhachHang());
        txtHoTen.setText(kh.getHoTen());
        txtSoDienThoai.setText(kh.getSoDienThoai());
        txtDiaChi.setText(kh.getDiaChi());
        txtMaSoThue.setText(kh.getMaSoThue());
        txtThuDK.setText(String.valueOf(kh.getThuDK()));
        txtTraDk.setText(String.valueOf(kh.getTraDK()));
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
        txtSoDienThoai = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        btnVeTrangChu = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        txtNhomKhachHang = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtMaSoThue = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtThuDK = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtTraDk = new javax.swing.JTextField();
        txtIDKhachHang = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 595));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 595));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Sửa Nhà Cung Cấp");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(140, 0, 350, 60);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 600, 64);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel37.setText("Nhóm Khách Hàng");
        jPanel1.add(jLabel37);
        jLabel37.setBounds(47, 92, 157, 24);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel38.setText("Nhà Cung Cấp");
        jPanel1.add(jLabel38);
        jLabel38.setBounds(47, 232, 140, 24);

        txtHoTen.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtHoTen.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtHoTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtHoTen);
        txtHoTen.setBounds(227, 222, 330, 40);

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel40.setText("Số Điện Thoại");
        jPanel1.add(jLabel40);
        jLabel40.setBounds(47, 302, 130, 24);

        txtSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtSoDienThoai.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSoDienThoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSoDienThoai);
        txtSoDienThoai.setBounds(227, 292, 330, 40);

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel41.setText("Địa Chỉ");
        jPanel1.add(jLabel41);
        jLabel41.setBounds(47, 382, 130, 24);

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtDiaChi.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDiaChi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDiaChiMouseClicked(evt);
            }
        });
        jPanel1.add(txtDiaChi);
        txtDiaChi.setBounds(227, 372, 330, 40);

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
        btnVeTrangChu.setBounds(80, 630, 200, 70);

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
        btnLuu.setBounds(320, 630, 200, 70);

        txtNhomKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtNhomKhachHang.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNhomKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtNhomKhachHang);
        txtNhomKhachHang.setBounds(230, 80, 330, 40);

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel42.setText("IDKhachHang");
        jPanel1.add(jLabel42);
        jLabel42.setBounds(47, 162, 140, 24);

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel43.setText("Mã Số Thuê");
        jPanel1.add(jLabel43);
        jLabel43.setBounds(50, 450, 130, 24);

        txtMaSoThue.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtMaSoThue.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMaSoThue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtMaSoThue);
        txtMaSoThue.setBounds(230, 440, 330, 40);

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel44.setText("Thu DK");
        jPanel1.add(jLabel44);
        jLabel44.setBounds(50, 510, 130, 24);

        txtThuDK.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtThuDK.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtThuDK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtThuDK);
        txtThuDK.setBounds(230, 510, 330, 40);

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel45.setText("Tra DK");
        jPanel1.add(jLabel45);
        jLabel45.setBounds(50, 580, 130, 24);

        txtTraDk.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTraDk.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTraDk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtTraDk);
        txtTraDk.setBounds(230, 570, 330, 40);

        txtIDKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtIDKhachHang.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIDKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtIDKhachHang);
        txtIDKhachHang.setBounds(227, 152, 330, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVeTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeTrangChuActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVeTrangChuActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if (new SuaKhachHang().Sua(txtIDKhachHang.getText(), txtHoTen.getText(), null, txtSoDienThoai.getText()
                , txtDiaChi.getText(),txtMaSoThue.getText(),Float.parseFloat(txtThuDK.getText()),
                Float.parseFloat(txtTraDk.getText())) == true) {
            new LoadTable().NhaCungCap("", listNhaCungCap);
            JOptionPane.showMessageDialog(this, "Cập Nhật Thành Công");
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(this, "Cập Nhật Thất Bại");
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void txtDiaChiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiaChiMouseClicked
        new jf_DiaChi(txtDiaChi).setVisible(true);
    }//GEN-LAST:event_txtDiaChiMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnVeTrangChu;
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
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtIDKhachHang;
    private javax.swing.JTextField txtMaSoThue;
    private javax.swing.JTextField txtNhomKhachHang;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtThuDK;
    private javax.swing.JTextField txtTraDk;
    // End of variables declaration//GEN-END:variables
}
