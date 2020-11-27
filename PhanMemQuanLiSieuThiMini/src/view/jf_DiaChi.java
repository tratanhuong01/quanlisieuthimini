package view;

import controller.LoadDiaChi;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import model.NhanVien;

public class jf_DiaChi extends javax.swing.JFrame {
    JTextField _txtDiaChi;
    public jf_DiaChi(JTextField txtDiaChi) {
        initComponents();
        this._txtDiaChi = txtDiaChi;
        pnListTinh.setLayout(new BoxLayout(pnListTinh, BoxLayout.Y_AXIS));
        loadData("");
        txtDiaChi.addKeyListener(new KeyListener() {
            public void keyPressed(JTextComponent.KeyBinding e) {
                loadData(" WHERE TenTinh LIKE N'%" + txtDiaChi.getText() + "%'");
            }

            @Override
            public void keyTyped(KeyEvent e) {
                loadData(" WHERE TenTinh LIKE N'%" + txtDiaChi.getText() + "%'");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                loadData(" WHERE TenTinh LIKE N'%" + txtDiaChi.getText() + "%'");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                loadData(" WHERE TenTinh LIKE N'%" + txtDiaChi.getText() + "%'");
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnF = new javax.swing.JPanel();
        btnOk = new javax.swing.JButton();
        txtDiaChi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnListTinh = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(364, 383));
        setUndecorated(true);
        setSize(new java.awt.Dimension(364, 383));

        pnF.setBackground(java.awt.Color.white);
        pnF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 4));
        pnF.setMaximumSize(new java.awt.Dimension(364, 383));
        pnF.setMinimumSize(new java.awt.Dimension(364, 383));
        pnF.setLayout(null);

        btnOk.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        pnF.add(btnOk);
        btnOk.setBounds(113, 316, 129, 40);

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDiaChi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnF.add(txtDiaChi);
        txtDiaChi.setBounds(64, 24, 217, 40);

        pnListTinh.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout pnListTinhLayout = new javax.swing.GroupLayout(pnListTinh);
        pnListTinh.setLayout(pnListTinhLayout);
        pnListTinhLayout.setHorizontalGroup(
            pnListTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );
        pnListTinhLayout.setVerticalGroup(
            pnListTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnListTinh);

        pnF.add(jScrollPane1);
        jScrollPane1.setBounds(14, 84, 330, 220);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnF, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnF, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        ArrayList list = new LoadDiaChi().getTenTinh();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (txtDiaChi.getText().equals((String) list.get(i))) {
                this.dispose();
                _txtDiaChi.setText(txtDiaChi.getText());
            } else {
                count = 1;
            }
        }
    }//GEN-LAST:event_btnOkActionPerformed
    public void loadData(String id) {
        pnListTinh.removeAll();
        pnListTinh.validate();
        jScrollPane1.getViewport().revalidate();
        List<JButton> listlb = new LoadDiaChi().load(id);
        pnListTinh.updateUI();
        for (int i = 0; i < listlb.size(); i++) {
            int num = pnListTinh.getComponentCount();
            int j = i;
            listlb.get(i).addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    for (int a = 0; a < listlb.size(); a++) {
                        if (a == j) {
                            listlb.get(j).setBackground(Color.BLUE);
                            listlb.get(j).setForeground(Color.WHITE);
                            txtDiaChi.setText(listlb.get(j).getText());
                        } else {
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
    
    public static void main(String args[]) {
        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new jf_DiaChi().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnF;
    private javax.swing.JPanel pnListTinh;
    private javax.swing.JTextField txtDiaChi;
    // End of variables declaration//GEN-END:variables
}
