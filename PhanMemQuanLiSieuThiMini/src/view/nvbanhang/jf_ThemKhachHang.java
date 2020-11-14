package view.nvbanhang;

import controller.PTHoaDon;
import controller.ThemKhachHang;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.KhachHang;
import model.NhanVien;
import model.StringUtil;
import view.jd_DiaChi;

public class jf_ThemKhachHang extends javax.swing.JFrame {

    boolean checkKhachHang = false;
    String idKhachCu;
    String idHoaDon;
    NhanVien nv;
    KhachHang kh;
    JPanel pnMain;

    public jf_ThemKhachHang() {
        initComponents();
    }

    public jf_ThemKhachHang(NhanVien nv, JPanel pnMain) {
        initComponents();
        this.nv = nv;
        this.pnMain = pnMain;
        txtIDKhachHang.setText(StringUtil.taoID("IDKhachHang", "KhachHang", "KH"));
        btnLuu.setVisible(false);
        txtDiaChi.setEditable(false);
        btnLuu_DaMua.setVisible(false);
        CheckKhachHang();
    }

    public void CheckKhachHang() {
        if (checkKhachHang == true) {
            btnLuu.setVisible(false);
            btnLuu_DaMua.setVisible(true);
        } else {
            txtIDKhachHang.setText(StringUtil.taoID("IDKhachHang", "KhachHang", "KH"));
            btnLuu.setVisible(true);
            btnLuu_DaMua.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnDocTheThanhVien = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        btnVeTrangChu = new javax.swing.JButton();
        cbGioiTinh = new javax.swing.JComboBox<>();
        btnLuu = new javax.swing.JButton();
        cbNhomKhachHang = new javax.swing.JComboBox<>();
        txtIDKhachHang = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        btnLuu_DaMua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setMaximumSize(new java.awt.Dimension(600, 700));
        bg.setMinimumSize(new java.awt.Dimension(600, 700));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.orange);
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Thêm Khách Hàng");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(80, 20, 300, 50);

        btnDocTheThanhVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDocTheThanhVien.setText("Đọc Thẻ Thành Viên");
        btnDocTheThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocTheThanhVienActionPerformed(evt);
            }
        });
        jPanel2.add(btnDocTheThanhVien);
        btnDocTheThanhVien.setBounds(390, 10, 200, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-info-45.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 20, 50, 50);

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel37.setText("Nhóm Khách Hàng");
        bg.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel38.setText("Họ Tên");
        bg.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        txtHoTen.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtHoTen.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtHoTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(txtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 330, 40));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel39.setText("Giới Tính");
        bg.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 100, -1));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel40.setText("Số Điện Thoại");
        bg.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 130, -1));

        txtSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtSoDienThoai.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSoDienThoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(txtSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 330, 40));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel41.setText("Địa Chỉ");
        bg.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 130, -1));

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtDiaChi.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDiaChi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDiaChiMouseClicked(evt);
            }
        });
        bg.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 330, 40));

        btnVeTrangChu.setBackground(java.awt.Color.orange);
        btnVeTrangChu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnVeTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-shutdown-45.png"))); // NOI18N
        btnVeTrangChu.setText("Trang Chủ");
        btnVeTrangChu.setToolTipText("");
        btnVeTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeTrangChuActionPerformed(evt);
            }
        });
        bg.add(btnVeTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 200, 70));

        cbGioiTinh.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));
        bg.add(cbGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 330, 40));

        btnLuu.setBackground(java.awt.Color.orange);
        btnLuu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-more-45.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        bg.add(btnLuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 200, 70));

        cbNhomKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cbNhomKhachHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NKH00002", "Item 2", "Item 3", "Item 4" }));
        bg.add(cbNhomKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 330, 40));

        txtIDKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtIDKhachHang.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIDKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(txtIDKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 330, 40));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel42.setText("IDKhachHang");
        bg.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 140, -1));

        btnLuu_DaMua.setBackground(java.awt.Color.orange);
        btnLuu_DaMua.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnLuu_DaMua.setText("Lưu");
        btnLuu_DaMua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuu_DaMuaActionPerformed(evt);
            }
        });
        bg.add(btnLuu_DaMua, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 200, 70));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDocTheThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocTheThanhVienActionPerformed
        checkKhachHang = true;
        idKhachCu = JOptionPane.showInputDialog(rootPane, "Vui Lòng Đưa Thẻ Thành Viên Vào Khe Cắm");
        txtIDKhachHang.setText(idKhachCu);
        CheckKhachHang();
    }//GEN-LAST:event_btnDocTheThanhVienActionPerformed

    private void txtDiaChiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiaChiMouseClicked
        new jd_DiaChi(new javax.swing.JFrame(), true, txtDiaChi).setVisible(true);
    }//GEN-LAST:event_txtDiaChiMouseClicked

    private void btnVeTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeTrangChuActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVeTrangChuActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        ThemKhachHang tkh = new ThemKhachHang();
        if (tkh.them(txtIDKhachHang.getText(), cbNhomKhachHang.getSelectedItem().toString(), txtHoTen.getText(),
                cbGioiTinh.getSelectedItem().toString(), txtSoDienThoai.getText(),
                txtDiaChi.getText()) == true) {
            this.setVisible(false);
            KhachHang kh = tkh.getKhachHang(txtIDKhachHang.getText());
            check(pnMain, kh);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Thêm Thất Bại Vui Lòng Kiểm Tra Lại Dữ Liệu Nhập Vào");
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnLuu_DaMuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuu_DaMuaActionPerformed
        this.setVisible(false);
        PTHoaDon pTHoaDon = new PTHoaDon();
        idHoaDon = StringUtil.taoID("IDHoaDon", "HoaDon", "HD");
        pTHoaDon.insertHoaDon(idHoaDon, txtIDKhachHang.getText(), nv.getIdNhanVien(),
                1, "");
        KhachHang kh = new ThemKhachHang().getKhachHang(txtIDKhachHang.getText());
        check(pnMain, kh);
    }//GEN-LAST:event_btnLuu_DaMuaActionPerformed
    public void check(JPanel pnMain, KhachHang kh) {
        if (kh == null) {
            ImageIcon imgLogo = new ImageIcon(getClass().getResource("/view/img/sieu-thi-mini.jpg"));
            Image newImage = imgLogo.getImage();
            Image editedImage = newImage.getScaledInstance(this.getContentPane().getWidth(), this.getContentPane().getWidth(), java.awt.Image.SCALE_SMOOTH);
            ImageIcon newImageIcon = new ImageIcon(editedImage);
            JLabel lb = new JLabel();
            lb.setIcon(newImageIcon);
            lb.setHorizontalAlignment((int) CENTER_ALIGNMENT);
            pnMain.add(lb);
        } else {
            pn_pnMain pnmain = new pn_pnMain(kh, nv, pnMain);
            pn_pnMain.txtTenKhachHang.setText(txtHoTen.getText());
            pnMain.removeAll();
            pnmain.setVisible(true);
            pnMain.add(pnmain);
            pnMain.validate();
            pnMain.repaint();
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_ThemKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnDocTheThanhVien;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnLuu_DaMua;
    private javax.swing.JButton btnVeTrangChu;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JComboBox<String> cbNhomKhachHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtIDKhachHang;
    private javax.swing.JTextField txtSoDienThoai;
    // End of variables declaration//GEN-END:variables
}
