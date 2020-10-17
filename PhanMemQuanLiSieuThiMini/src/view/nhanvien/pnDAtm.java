package view.nhanvien;

import controller.LuuAtm;
import controller.PTHoaDon;
import controller.ThemKhachHang;
import java.awt.BorderLayout;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import modal.KhachHang;
import modal.NhanVien;
import modal.StringUtil;
import view.DangNhap;
import view.jfBanHang;
import view.pnDDiaChi;

public class pnDAtm extends javax.swing.JDialog {
    NhanVien nvs;
    pnMain pnM;
    JPanel pnBanHang;
    jpnTaoHoaDon thd;
    String idHoaDon = "";
    String tenPTThanhToan;
    KhachHang kh;
    public pnDAtm(java.awt.Frame parent, boolean modal,KhachHang kh,NhanVien nv,pnMain pnM,JPanel pnBanHang,jpnTaoHoaDon thd,String tenPTThanhToan) {
        super(parent,modal);
        initComponents();
        this.nvs = nv;
        this.pnM = pnM;
        this.pnBanHang = pnBanHang;
        this.thd = thd;
        this.tenPTThanhToan = tenPTThanhToan;
        this.kh = kh;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDocThe = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtTenTaiKhoan = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtChiNhanh = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        cbLoaiThe = new javax.swing.JComboBox<>();
        txtSoTaiKhoan = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtTenNganHang = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        btnHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setModal(true);
        setSize(new java.awt.Dimension(600, 600));

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel1.setLayout(null);

        jPanel2.setBackground(java.awt.Color.orange);
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(60, 20, 70, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Thông Tin Thẻ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(190, 20, 250, 50);

        btnDocThe.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDocThe.setText("Đọc Thẻ");
        btnDocThe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocTheActionPerformed(evt);
            }
        });
        jPanel2.add(btnDocThe);
        btnDocThe.setBounds(450, 10, 120, 60);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 600, 90);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel37.setText("Loại Thẻ ");
        jPanel1.add(jLabel37);
        jLabel37.setBounds(50, 150, 81, 24);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel38.setText("Tên Tài Khoản");
        jPanel1.add(jLabel38);
        jLabel38.setBounds(50, 370, 150, 24);

        txtTenTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTenTaiKhoan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTenTaiKhoan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtTenTaiKhoan);
        txtTenTaiKhoan.setBounds(230, 360, 330, 40);

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel40.setText("Chi Nhánh");
        jPanel1.add(jLabel40);
        jLabel40.setBounds(50, 450, 130, 24);

        txtChiNhanh.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtChiNhanh.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtChiNhanh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtChiNhanh);
        txtChiNhanh.setBounds(230, 440, 330, 40);

        btnLuu.setBackground(java.awt.Color.orange);
        btnLuu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel1.add(btnLuu);
        btnLuu.setBounds(340, 510, 200, 70);

        cbLoaiThe.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cbLoaiThe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vietcombank", "Vietinbank", "Sacombank", "BIDV", "Agribank", "VP Bank", "ACB", "TP Bank", "Eximbank", "Techcombank", "MB Bank", "LienVietPost", "VietABank" }));
        jPanel1.add(cbLoaiThe);
        cbLoaiThe.setBounds(230, 140, 330, 40);

        txtSoTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtSoTaiKhoan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSoTaiKhoan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSoTaiKhoan);
        txtSoTaiKhoan.setBounds(230, 290, 330, 40);

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel42.setText("Số Tài Khoản");
        jPanel1.add(jLabel42);
        jLabel42.setBounds(50, 300, 140, 24);

        txtTenNganHang.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTenNganHang.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTenNganHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtTenNganHang);
        txtTenNganHang.setBounds(230, 220, 330, 40);

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel43.setText("Tên Ngân Hàng");
        jPanel1.add(jLabel43);
        jLabel43.setBounds(50, 230, 140, 24);

        btnHuy.setBackground(java.awt.Color.orange);
        btnHuy.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnHuy);
        btnHuy.setBounds(60, 510, 200, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        
        if (new LuuAtm().luu(new LuuAtm().getIDByTen(tenPTThanhToan), cbLoaiThe.getSelectedItem().toString()
                , txtSoTaiKhoan.getText(), txtTenTaiKhoan.getText(), txtChiNhanh.getText(), txtTenNganHang.getText()) == true) {
            this.setVisible(false);
            pnBanHang.removeAll();
            thd.setVisible(true);
            pnBanHang.setLayout(new BorderLayout());
            pnBanHang.add(thd);
            pnBanHang.validate();
        }
        else {
            
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnDocTheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocTheActionPerformed
        JOptionPane.showConfirmDialog(rootPane, "Vui Lòng Đưa Thẻ Vào Để Quét", "Message", WIDTH);
    }//GEN-LAST:event_btnDocTheActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocThe;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox<String> cbLoaiThe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtChiNhanh;
    private javax.swing.JTextField txtSoTaiKhoan;
    private javax.swing.JTextField txtTenNganHang;
    private javax.swing.JTextField txtTenTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
