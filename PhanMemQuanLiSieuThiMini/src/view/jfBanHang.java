package view;

import controller.PTHoaDon;
import java.awt.BorderLayout;
import java.awt.Dialog.ModalityType;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import modal.ImageIconSoftware;
import modal.KhachHang;
import modal.NhanVien;
import view.nhanvien.pnDKhachHang;
import view.nhanvien.pnDSuaKH;
import view.nhanvien.pnMain;

public class jfBanHang extends javax.swing.JFrame {
    pnMain pnM;
    static NhanVien nvs;
    KhachHang kh;
    public JMenu getMnHoaDon() {
        return mnHoaDon;
    }
    public jfBanHang(NhanVien nv,KhachHang kh) {
        initComponents();
        this.nvs = nv;
        this.kh = kh;
        mnHoaDon.setEnabled(false);
        load();
    }
    public jfBanHang(NhanVien nv) {
        initComponents();
        this.nvs = nv;
        mnHoaDon.setEnabled(false);
        load();
    }

    public void load() {
        this.setTitle("Quản Lí Siêu Thị Mini");
        this.setIconImage(new ImageIconSoftware().createImageIcon().getImage());
        pnBanHang.removeAll();
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        pnM = new pnMain(pnBanHang,null,nvs, (jfBanHang) topFrame);
        pnM.setVisible(true);
        pnHeaderf.removeAll(); 
        pnHeader pnH = new pnHeader(pnHeaderf,nvs);
        pnH.setVisible(true);
        pnHeaderf.setLayout(new BorderLayout());
        pnHeaderf.add(pnH);
        pnHeaderf.validate();
        pnBanHang.setLayout(new BorderLayout());
        pnBanHang.add(pnM);
        pnBanHang.validate();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnFullGui = new javax.swing.JPanel();
        pnBanHang = new javax.swing.JPanel();
        pnThongBao = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        pnHeaderf = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        mnThemKhachHang = new javax.swing.JMenu();
        pnThemKhachHang = new javax.swing.JMenuItem();
        pnKhachHangThanThien = new javax.swing.JMenuItem();
        mnHoaDon = new javax.swing.JMenu();
        mniSuaHoaDon = new javax.swing.JMenuItem();
        mniXemHoaDon = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1440, 950));
        setSize(new java.awt.Dimension(1440, 950));

        pnFullGui.setEnabled(false);
        pnFullGui.setMaximumSize(new java.awt.Dimension(1440, 850));
        pnFullGui.setMinimumSize(new java.awt.Dimension(1440, 850));
        pnFullGui.setLayout(null);

        pnBanHang.setBackground(java.awt.Color.white);
        pnBanHang.setMaximumSize(new java.awt.Dimension(1440, 740));
        pnBanHang.setMinimumSize(new java.awt.Dimension(1440, 740));
        pnBanHang.setRequestFocusEnabled(false);
        pnBanHang.setLayout(null);
        pnFullGui.add(pnBanHang);
        pnBanHang.setBounds(0, 150, 1440, 740);

        pnThongBao.setBackground(java.awt.Color.gray);
        pnThongBao.setLayout(null);

        jLabel22.setBackground(java.awt.Color.gray);
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(java.awt.Color.white);
        jLabel22.setText(" Thông Báo : Vừa thanh toán và in hóa đơn cho khách hàng với id là KH0001 - Tổng số tiền vừa thanh toán là 1.459.00 VNNĐ ");
        pnThongBao.add(jLabel22);
        jLabel22.setBounds(0, 0, 1410, 40);

        pnFullGui.add(pnThongBao);
        pnThongBao.setBounds(0, 100, 1440, 40);

        pnHeaderf.setLayout(null);
        pnFullGui.add(pnHeaderf);
        pnHeaderf.setBounds(0, 0, 1440, 100);

        mnThemKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/users.png"))); // NOI18N
        mnThemKhachHang.setText("Khách Hàng");

        pnThemKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        pnThemKhachHang.setText("Thêm Khách Hàng");
        pnThemKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnThemKhachHangActionPerformed(evt);
            }
        });
        mnThemKhachHang.add(pnThemKhachHang);

        pnKhachHangThanThien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        pnKhachHangThanThien.setText("Khách Hàng Thân Thiện");
        pnKhachHangThanThien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnKhachHangThanThienActionPerformed(evt);
            }
        });
        mnThemKhachHang.add(pnKhachHangThanThien);

        menu.add(mnThemKhachHang);

        mnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-hoadon.png"))); // NOI18N
        mnHoaDon.setText("Hóa Đơn");

        mniSuaHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        mniSuaHoaDon.setText("Sửa Hóa Đơn");
        mnHoaDon.add(mniSuaHoaDon);

        mniXemHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        mniXemHoaDon.setText("Xem Hóa Đơn");
        mnHoaDon.add(mniXemHoaDon);

        menu.add(mnHoaDon);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnFullGui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnFullGui, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnThemKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnThemKhachHangActionPerformed
        jfBanHang nv = new jfBanHang(nvs);
        pnDKhachHang pnbanhang = new pnDKhachHang(nv, true,nvs,pnM,pnBanHang);
        pnbanhang.setModalityType(ModalityType.APPLICATION_MODAL);
        pnbanhang.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pnbanhang.setVisible(true); 
    }//GEN-LAST:event_pnThemKhachHangActionPerformed

    private void pnKhachHangThanThienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnKhachHangThanThienActionPerformed
        
    }//GEN-LAST:event_pnKhachHangThanThienActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfBanHang(nvs).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel22;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu mnHoaDon;
    private javax.swing.JMenu mnThemKhachHang;
    private javax.swing.JMenuItem mniSuaHoaDon;
    private javax.swing.JMenuItem mniXemHoaDon;
    private javax.swing.JPanel pnBanHang;
    private javax.swing.JPanel pnFullGui;
    private javax.swing.JPanel pnHeaderf;
    private javax.swing.JMenuItem pnKhachHangThanThien;
    private javax.swing.JMenuItem pnThemKhachHang;
    private javax.swing.JPanel pnThongBao;
    // End of variables declaration//GEN-END:variables
}
