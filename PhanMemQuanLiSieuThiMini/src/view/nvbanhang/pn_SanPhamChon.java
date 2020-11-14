package view.nvbanhang;

import java.awt.Dimension;
import java.awt.Point;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import model.DongHoaDon;
import model.KhachHang;
import model.NhanVien;
import model.SanPham;

public class pn_SanPhamChon extends javax.swing.JPanel {

    SanPham sp;
    List<DongHoaDon> list;
    JPanel pnSanPhamDaChon;
    NhanVien nv;
    KhachHang kh;
    JScrollPane jscr;
    JTextField txtTongTien;
    JButton btnTaoHoaDon;
    JTextField txtTienKhuyenMai;

    public pn_SanPhamChon(SanPham sp, List<DongHoaDon> list, JPanel pnSanPhamDaChon, KhachHang kh,
            NhanVien nv, JScrollPane jscr, JTextField txtTongTien, JButton btnTaoHoaDon, JTextField txtTienKhuyenMai) {
        initComponents();
        this.sp = sp;
        this.list = list;
        this.kh = kh;
        this.nv = nv;
        this.jscr = jscr;
        this.btnTaoHoaDon = btnTaoHoaDon;
        this.txtTongTien = txtTongTien;
        this.pnSanPhamDaChon = pnSanPhamDaChon;
        this.txtTienKhuyenMai = txtTienKhuyenMai;
        lbGiaSanPham.setText(new DecimalFormat("###,###,###").format(sp.getDonGia() * Integer.parseInt(txtSoLuong.getText())) + " VNĐ");
        lbTenSanPham.setText(sp.getTenSanPham());
        lbHinhSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anhsanpham/" + sp.getUrlSanPham()))); // NOI18N
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        pnHinhSP = new javax.swing.JPanel();
        lbHinhSanPham = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        btnChon = new javax.swing.JButton();
        btnTang = new javax.swing.JButton();
        lbGiaSanPham = new javax.swing.JLabel();
        lbTenSanPham = new javax.swing.JLabel();
        btnGiam = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setMaximumSize(new java.awt.Dimension(210, 253));
        setMinimumSize(new java.awt.Dimension(210, 253));

        bg.setBackground(new java.awt.Color(204, 255, 204));
        bg.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        bg.setMaximumSize(new java.awt.Dimension(210, 253));
        bg.setMinimumSize(new java.awt.Dimension(210, 253));

        pnHinhSP.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnHinhSP.setMinimumSize(new java.awt.Dimension(80, 80));
        pnHinhSP.setLayout(new java.awt.GridLayout(1, 0));
        pnHinhSP.add(lbHinhSanPham);

        txtSoLuong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtSoLuong.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoLuong.setText("1");

        btnChon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnChon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-checked-48.png"))); // NOI18N
        btnChon.setText("Chọn");
        btnChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonActionPerformed(evt);
            }
        });

        btnTang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/up.png"))); // NOI18N
        btnTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTangActionPerformed(evt);
            }
        });

        lbGiaSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbGiaSanPham.setForeground(java.awt.Color.red);
        lbGiaSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGiaSanPham.setText("1.000.000.000.000 VNĐ");

        lbTenSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbTenSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTenSanPham.setText("jLabel1");

        btnGiam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/down1.png"))); // NOI18N
        btnGiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(pnHinhSP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(btnTang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(lbTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lbGiaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnChon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnHinhSP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(lbTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbGiaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnChon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTangActionPerformed
        int soLuong = Integer.parseInt(txtSoLuong.getText());
        soLuong++;
        txtSoLuong.setText(String.valueOf(soLuong));
        lbGiaSanPham.setText(new DecimalFormat("###,###,###").format(sp.getDonGia() * soLuong) + " VNĐ");
    }//GEN-LAST:event_btnTangActionPerformed

    private void btnChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonActionPerformed
        DongHoaDon dhd = new DongHoaDon("", "", sp.getIdSanPham(), sp.getTenSanPham(), sp.getIdDonViTinh(),
                sp.getDonGia(), Integer.parseInt(txtSoLuong.getText()), sp.getUrlSanPham(), sp.getGiam(), nv.getIdNhanVien(),
                nv.getIdNhanVien(), kh.getIdKhachHang(), kh.getHoTen(), "");
        int[] count = checkSanPhamTonTai(list, Integer.parseInt(txtSoLuong.getText()), sp);
        if (count[0] == 0) {
            list.add(dhd);
        } else {
            list.get(count[1]).setSoLuong(Integer.parseInt(txtSoLuong.getText()) + list.get(count[1]).getSoLuong());
        }
        pnSanPhamDaChon.removeAll();
        pnSanPhamDaChon.repaint();
        float tongTienC = 0;
        float giaKMC = 0;
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                pn_SanPhamDaChon pnsped = new pn_SanPhamDaChon(pnSanPhamDaChon, list.get(i).getTenSanPham(),
                        list.get(i).getDonGia(), list.get(i).getHinhSanPham(), list.get(i).getSoLuong(),
                        list.get(i), list, jscr, txtTongTien, btnTaoHoaDon,txtTienKhuyenMai);
                pnSanPhamDaChon.setLayout(new BoxLayout(pnSanPhamDaChon, BoxLayout.Y_AXIS));
                pnSanPhamDaChon.setPreferredSize(new Dimension(475, list.size() * 100));
                jscr.getViewport().setViewPosition(new Point(0, list.size()  * 100));
                jscr.getViewport().revalidate();
                pnSanPhamDaChon.add(pnsped);
                pnSanPhamDaChon.updateUI();
                tongTienC += (list.get(i).getDonGia() * list.get(i).getSoLuong());
                giaKMC += (list.get(i).getDonGia() * ((list.get(i).getGiam()) / 100)) * list.get(i).getSoLuong();
            }
            txtTongTien.setText(new DecimalFormat("###,###,###").format(tongTienC - giaKMC) + " VNĐ");
            txtTienKhuyenMai.setText(new DecimalFormat("###,###,###").format(giaKMC) + " VNĐ");
            btnTaoHoaDon.setEnabled(true);
        } else {
            btnTaoHoaDon.setEnabled(false);
        }
    }//GEN-LAST:event_btnChonActionPerformed
    public int[] checkSanPhamTonTai(List<DongHoaDon> list, int soLuong, SanPham sp) {
        int[] countArr = new int[2];
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (sp.getIdSanPham().equals(list.get(i).getIdSanPham())) {
                count++;
                countArr[0] = count;
                countArr[1] = i;
            }
        }
        return countArr;
    }
    private void btnGiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiamActionPerformed
        int soLuong = Integer.parseInt(txtSoLuong.getText());
        if (soLuong >= 2) {
            soLuong--;
            txtSoLuong.setText(String.valueOf(soLuong));
            lbGiaSanPham.setText(new DecimalFormat("###,###,###").format(sp.getDonGia() * soLuong) + " VNĐ");
        } else {
            soLuong = 1;
            txtSoLuong.setText(String.valueOf(1));
            lbGiaSanPham.setText(new DecimalFormat("###,###,###").format(sp.getDonGia() * soLuong) + " VNĐ");
        }
    }//GEN-LAST:event_btnGiamActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnChon;
    private javax.swing.JButton btnGiam;
    private javax.swing.JButton btnTang;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbGiaSanPham;
    private javax.swing.JLabel lbHinhSanPham;
    private javax.swing.JLabel lbTenSanPham;
    private javax.swing.JPanel pnHinhSP;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration//GEN-END:variables
}
