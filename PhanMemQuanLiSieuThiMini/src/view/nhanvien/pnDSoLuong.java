package view.nhanvien;

import controller.PTHoaDon;
import controller.ThemKhachHang;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.List;
import javafx.scene.Parent;
import javax.swing.*;
import modal.DongHoaDon;
import modal.HoaDon;
import modal.KhachHang;
import modal.NhanVien;
import modal.SanPham;
import modal.StringUtil;
import view.jfBanHang;

public class pnDSoLuong extends javax.swing.JDialog {
    JPanel pnSanPhamDaChon;
    SanPham sp;
    int soLuong = 0;
    NhanVien nv;
    KhachHang kh;
    String idHoaDon;
    JScrollPane jsc;
    float tongTien;
    JPanel pnBanHang;
    JTextField txtTien;
    JButton btnTaoHoaDon;
    JTextField tienKhuyenMai;
    DecimalFormat formatter = new DecimalFormat("###,###,###");
    public pnDSoLuong(java.awt.Frame parent, boolean modal,SanPham sp,NhanVien nv,KhachHang kh,
            String idHoaDon,JPanel pnSanPhamDaChon,JScrollPane jsc,JPanel pnBanHang,
            JTextField txtTien,JButton btnTaoHoaDon,JTextField tienKhuyenMai) {
        super(parent, modal);
        initComponents();
        this.sp = sp;
        this.kh = kh;
        this.nv = nv;
        this.idHoaDon = idHoaDon;
        this.pnSanPhamDaChon = pnSanPhamDaChon;
        this.jsc = jsc;
        this.pnBanHang = pnBanHang;
        this.txtTien = txtTien;
        this.btnTaoHoaDon = btnTaoHoaDon;
        this.tienKhuyenMai = tienKhuyenMai;
        load();
    }
    public void load() {
        soLuong = Integer.parseInt(txtSoLuong.getText());
        hinhSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anhsanpham/" + sp.getUrlSanPham())));
        lbTenSanPham.setText(sp.getTenSanPham());
        lbGiaSanPham.setText(formatter.format(sp.getDonGia() * soLuong) + " VNĐ");
        btnTang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                soLuong++;
                lbGiaSanPham.setText(formatter.format(sp.getDonGia() * soLuong) + " VNĐ");
            }
        });
        btnGiam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                soLuong--;
                lbGiaSanPham.setText(formatter.format(sp.getDonGia() * soLuong) + " VNĐ");
            }
        });
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

        hinhSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anhsanpham/BG00010SP00010.png"))); // NOI18N
        jPanel1.add(hinhSanPham);
        hinhSanPham.setBounds(20, 60, 70, 80);

        lbGiaSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
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
        txtSoLuong.setText("1");
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
        btnChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonActionPerformed(evt);
            }
        });
        jPanel1.add(btnChon);
        btnChon.setBounds(220, 230, 100, 50);

        btnHuy.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
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

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonActionPerformed
        this.setVisible(false);
        PTHoaDon pTHoaDon = new PTHoaDon();
        pTHoaDon.insertDongHoaDon(idHoaDon, sp.getIdSanPham(), sp.getIdDonViTinh(),
                Integer.parseInt(txtSoLuong.getText()));
        pTHoaDon.load(pnSanPhamDaChon, sp.getUrlSanPham(), sp.getTenSanPham(), 
                sp.getDonGia(), idHoaDon,jsc,txtTien,tienKhuyenMai,btnTaoHoaDon);
        
        List<DongHoaDon> list = pTHoaDon.getListDongHoaDon(idHoaDon);
        if (list.size() > 0 ) {
            btnTaoHoaDon.setEnabled(true);
        }
        else {
            btnTaoHoaDon.setEnabled(false);
        }
    }//GEN-LAST:event_btnChonActionPerformed


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
