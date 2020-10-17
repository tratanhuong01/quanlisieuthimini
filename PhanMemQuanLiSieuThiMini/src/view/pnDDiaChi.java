package view;

import controller.LoadDiaChi;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import modal.NhanVien;
import view.nhanvien.pnDKhachHang;
import view.nhanvien.pnMain;

public class pnDDiaChi extends javax.swing.JDialog {
    JTextField _txtDiaChi;
    NhanVien nvs;
    pnMain pnM;
    JPanel pnBanHang;
    public pnDDiaChi(java.awt.Frame parent, boolean modal,JTextField _txtDiaChi) {
        super(parent, modal);
        initComponents();
        this._txtDiaChi = _txtDiaChi;
        pnListTinh.setLayout(new BoxLayout(pnListTinh, BoxLayout.Y_AXIS));
        loadData("");
        txtDiaChi.addKeyListener(new KeyListener() {
            public void keyPressed(JTextComponent.KeyBinding e) { 
                loadData(" WHERE TenTinh LIKE N'%"+ txtDiaChi.getText() + "%'");
            }
            @Override
            public void keyTyped(KeyEvent e) {
                loadData(" WHERE TenTinh LIKE N'%"+ txtDiaChi.getText() + "%'");
            }
            @Override
            public void keyReleased(KeyEvent e) {
                loadData(" WHERE TenTinh LIKE N'%"+ txtDiaChi.getText() + "%'");
            }
            @Override
            public void keyPressed(KeyEvent e) {
                loadData(" WHERE TenTinh LIKE N'%"+ txtDiaChi.getText() + "%'");
            }
        });
    }
    public void loadData(String id) {
        pnListTinh.removeAll();
        pnListTinh.validate();
        jScrollPane1.getViewport().revalidate();
        List<JButton> listlb = new LoadDiaChi().load(id);
        pnListTinh.updateUI();
        for (int i = 0; i < listlb.size() ; i++) {
            int num = pnListTinh.getComponentCount();
            int j = i;
            listlb.get(i).addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    for (int a = 0 ; a < listlb.size() ; a++) {
                        if (a == j) {
                            listlb.get(j).setBackground(Color.BLUE);
                            listlb.get(j).setForeground(Color.WHITE);
                            txtDiaChi.setText(listlb.get(j).getText());
                        } 
                        else {
                            listlb.get(a).setBackground(Color.WHITE);
                            listlb.get(a).setForeground(Color.BLACK);
                        }
                    }
                }
            });
            pnListTinh.add(listlb.get(i));
            pnListTinh.setPreferredSize(new Dimension(315, num * 30));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtDiaChi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnListTinh = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(315, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(315, 300));
        jPanel1.setLayout(null);

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDiaChi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtDiaChi);
        txtDiaChi.setBounds(60, 20, 200, 40);

        pnListTinh.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout pnListTinhLayout = new javax.swing.GroupLayout(pnListTinh);
        pnListTinh.setLayout(pnListTinhLayout);
        pnListTinhLayout.setHorizontalGroup(
            pnListTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
        pnListTinhLayout.setVerticalGroup(
            pnListTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnListTinh);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 80, 320, 220);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(99, 335, 120, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList list = new LoadDiaChi().getTenTinh();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (txtDiaChi.getText().equals((String) list.get(i))) {
                this.setVisible(false);
                _txtDiaChi.setText(txtDiaChi.getText());
            }
            else {
                count = 1;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnListTinh;
    private javax.swing.JTextField txtDiaChi;
    // End of variables declaration//GEN-END:variables
}
