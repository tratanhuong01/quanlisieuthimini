package view;

import view.jfBanHang;
import view.nhanvien.*;
import java.awt.BorderLayout;
import java.awt.Dialog.ModalityType;
import javax.swing.JDialog;
import javax.swing.JFrame;
import modal.ImageIconSoftware;
import modal.NhanVien;

public class jfThuKho extends javax.swing.JFrame {
    NhanVien nvs;
    public jfThuKho() {
        initComponents();
        this.setTitle("Quản Lí Siêu Thị Mini");
        this.setIconImage(new ImageIconSoftware().createImageIcon().getImage());
    }
    public jfThuKho(NhanVien nv) {
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
        pnBanHang = new javax.swing.JPanel();
        pnHeaderf = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnThemKhachHang = new javax.swing.JMenu();
        pnThemKhachHang = new javax.swing.JMenuItem();
        pnThemKhachHang1 = new javax.swing.JMenuItem();
        pnThemKhachHang2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1440, 850));
        setSize(new java.awt.Dimension(1440, 850));

        jPanel1.setEnabled(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(1440, 850));
        jPanel1.setMinimumSize(new java.awt.Dimension(1440, 850));
        jPanel1.setLayout(null);

        pnBanHang.setBackground(java.awt.Color.white);
        pnBanHang.setMaximumSize(new java.awt.Dimension(1440, 740));
        pnBanHang.setMinimumSize(new java.awt.Dimension(1440, 740));
        pnBanHang.setRequestFocusEnabled(false);
        pnBanHang.setLayout(null);
        jPanel1.add(pnBanHang);
        pnBanHang.setBounds(0, 110, 1440, 740);

        pnHeaderf.setLayout(null);
        jPanel1.add(pnHeaderf);
        pnHeaderf.setBounds(0, 0, 1440, 100);

        mnThemKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/users.png"))); // NOI18N
        mnThemKhachHang.setText("Kho");

        pnThemKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        pnThemKhachHang.setText("Phiếu Nhập");
        pnThemKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnThemKhachHangActionPerformed(evt);
            }
        });
        mnThemKhachHang.add(pnThemKhachHang);

        pnThemKhachHang1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        pnThemKhachHang1.setText("Phiếu Xuất");
        pnThemKhachHang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnThemKhachHang1ActionPerformed(evt);
            }
        });
        mnThemKhachHang.add(pnThemKhachHang1);

        pnThemKhachHang2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        pnThemKhachHang2.setText("Hàng Tồn");
        pnThemKhachHang2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnThemKhachHang2ActionPerformed(evt);
            }
        });
        mnThemKhachHang.add(pnThemKhachHang2);

        jMenuBar1.add(mnThemKhachHang);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnThemKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnThemKhachHangActionPerformed
        
    }//GEN-LAST:event_pnThemKhachHangActionPerformed

    private void pnThemKhachHang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnThemKhachHang1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnThemKhachHang1ActionPerformed

    private void pnThemKhachHang2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnThemKhachHang2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnThemKhachHang2ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfThuKho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnThemKhachHang;
    private javax.swing.JPanel pnBanHang;
    private javax.swing.JPanel pnHeaderf;
    private javax.swing.JMenuItem pnThemKhachHang;
    private javax.swing.JMenuItem pnThemKhachHang1;
    private javax.swing.JMenuItem pnThemKhachHang2;
    // End of variables declaration//GEN-END:variables
}
