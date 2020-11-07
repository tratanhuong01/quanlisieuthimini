package view;

import view.nhanvien.*;
import java.awt.BorderLayout;
import java.awt.Dialog.ModalityType;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modal.ImageIconSoftware;
import modal.NhanVien;
import view.quanli.pnQLHoaDon;
import view.quanli.pnQLKhachHang;
import view.quanli.pnQLNhaCungCap;
import view.quanli.pnQLNhanVien;
import view.quanli.pnQLSanPham;
import view.quanli.pnQLTKDoanhThu;

public class jfQuanLi extends javax.swing.JFrame {
    static NhanVien nvs;
    public jfQuanLi(NhanVien nv) {
        initComponents();
        this.setTitle("Quản Lí Siêu Thị Mini");
        this.setIconImage(new ImageIconSoftware().createImageIcon().getImage());
        this.nvs = nv;
        pnHeaderf.removeAll(); 
        pnHeader pnH = new pnHeader(pnHeaderf,nvs);
        pnH.setVisible(true);
        pnHeaderf.setLayout(new BorderLayout());
        pnHeaderf.add(pnH);
        pnHeaderf.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnQuanLi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnHeaderf = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnThemKhachHang = new javax.swing.JMenu();
        mnHoaDon = new javax.swing.JMenu();
        mnNhanVien = new javax.swing.JMenu();
        mnNhaCungCap = new javax.swing.JMenu();
        mnSanPham = new javax.swing.JMenu();
        mnThongKeDoanhThu = new javax.swing.JMenu();
        mnThongKeDoanhThu1 = new javax.swing.JMenu();
        mnNhapHang = new javax.swing.JMenu();
        mnXuatHang = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1440, 850));
        setSize(new java.awt.Dimension(1440, 850));

        jPanel1.setEnabled(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(1440, 850));
        jPanel1.setMinimumSize(new java.awt.Dimension(1440, 850));
        jPanel1.setLayout(null);

        pnQuanLi.setBackground(java.awt.Color.white);
        pnQuanLi.setMaximumSize(new java.awt.Dimension(1440, 740));
        pnQuanLi.setMinimumSize(new java.awt.Dimension(1440, 740));
        pnQuanLi.setRequestFocusEnabled(false);
        pnQuanLi.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/adminImg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        pnQuanLi.add(jLabel1);
        jLabel1.setBounds(0, 0, 1440, 740);

        jPanel1.add(pnQuanLi);
        pnQuanLi.setBounds(0, 110, 1440, 740);

        pnHeaderf.setLayout(null);
        jPanel1.add(pnHeaderf);
        pnHeaderf.setBounds(0, 0, 1440, 100);

        mnThemKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/users.png"))); // NOI18N
        mnThemKhachHang.setText("Khách Hàng");
        mnThemKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnThemKhachHangMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnThemKhachHang);

        mnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-hoadon.png"))); // NOI18N
        mnHoaDon.setText("Hóa Đơn");
        mnHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnHoaDonMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnHoaDon);

        mnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-hoadon.png"))); // NOI18N
        mnNhanVien.setText("Nhân Viên");
        mnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnNhanVienMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnNhanVien);

        mnNhaCungCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/users.png"))); // NOI18N
        mnNhaCungCap.setText("Nhà Cung Cấp");
        mnNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnNhaCungCapMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnNhaCungCap);

        mnSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-hoadon.png"))); // NOI18N
        mnSanPham.setText("Sản Phẩm");
        mnSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSanPhamMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnSanPham);

        mnThongKeDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-hoadon.png"))); // NOI18N
        mnThongKeDoanhThu.setText("Thống Kê Doanh Thu");
        mnThongKeDoanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnThongKeDoanhThuMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnThongKeDoanhThu);

        mnThongKeDoanhThu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-hoadon.png"))); // NOI18N
        mnThongKeDoanhThu1.setText("Tạo Phiếu");
        mnThongKeDoanhThu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnThongKeDoanhThu1MouseClicked(evt);
            }
        });

        mnNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-hoadon.png"))); // NOI18N
        mnNhapHang.setText("Nhập Hàng");
        mnThongKeDoanhThu1.add(mnNhapHang);

        mnXuatHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-hoadon.png"))); // NOI18N
        mnXuatHang.setText("Xuất Hàng");
        mnThongKeDoanhThu1.add(mnXuatHang);

        jMenuBar1.add(mnThongKeDoanhThu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnThemKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnThemKhachHangMouseClicked
        pnQuanLi.removeAll();
        pnQLKhachHang pnDKH = new pnQLKhachHang();
        pnDKH.setVisible(true);
        pnQuanLi.setLayout(new BorderLayout());
        pnQuanLi.add(pnDKH);
        pnQuanLi.validate();
    }//GEN-LAST:event_mnThemKhachHangMouseClicked

    private void mnHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnHoaDonMouseClicked
        pnQuanLi.removeAll();
        pnQLHoaDon pnDHD = new pnQLHoaDon();
        pnDHD.setVisible(true);
        pnQuanLi.setLayout(new BorderLayout());
        pnQuanLi.add(pnDHD);
        pnQuanLi.validate();
    }//GEN-LAST:event_mnHoaDonMouseClicked

    private void mnNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnNhanVienMouseClicked
        pnQuanLi.removeAll();
        pnQLNhanVien pnDHD = new pnQLNhanVien();
        pnDHD.setVisible(true);
        pnQuanLi.setLayout(new BorderLayout());
        pnQuanLi.add(pnDHD);
        pnQuanLi.validate();
    }//GEN-LAST:event_mnNhanVienMouseClicked

    private void mnNhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnNhaCungCapMouseClicked
        pnQuanLi.removeAll();
        pnQLNhaCungCap pnDHD = new pnQLNhaCungCap();
        pnDHD.setVisible(true);
        pnQuanLi.setLayout(new BorderLayout());
        pnQuanLi.add(pnDHD);
        pnQuanLi.validate();
    }//GEN-LAST:event_mnNhaCungCapMouseClicked

    private void mnSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSanPhamMouseClicked
        pnQuanLi.removeAll();
        pnQLSanPham pnDHD = new pnQLSanPham();
        pnDHD.setVisible(true);
        pnQuanLi.setLayout(new BorderLayout());
        pnQuanLi.add(pnDHD);
        pnQuanLi.validate();
    }//GEN-LAST:event_mnSanPhamMouseClicked

    private void mnThongKeDoanhThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnThongKeDoanhThuMouseClicked
        pnQuanLi.removeAll();
        pnQLTKDoanhThu pnQltkdt = new pnQLTKDoanhThu();
        pnQltkdt.setVisible(true);
        pnQuanLi.setLayout(new BorderLayout());
        pnQuanLi.add(pnQltkdt);
        pnQuanLi.validate();
    }//GEN-LAST:event_mnThongKeDoanhThuMouseClicked

    private void mnThongKeDoanhThu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnThongKeDoanhThu1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnThongKeDoanhThu1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfQuanLi(nvs).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnHoaDon;
    private javax.swing.JMenu mnNhaCungCap;
    private javax.swing.JMenu mnNhanVien;
    private javax.swing.JMenu mnNhapHang;
    private javax.swing.JMenu mnSanPham;
    private javax.swing.JMenu mnThemKhachHang;
    private javax.swing.JMenu mnThongKeDoanhThu;
    private javax.swing.JMenu mnThongKeDoanhThu1;
    private javax.swing.JMenu mnXuatHang;
    private javax.swing.JPanel pnHeaderf;
    private javax.swing.JPanel pnQuanLi;
    // End of variables declaration//GEN-END:variables
}
