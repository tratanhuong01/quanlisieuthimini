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
import model.NhanVien;

public class jd_DiaChi extends javax.swing.JDialog {

    JTextField _txtDiaChi;
    NhanVien nvs;

    public jd_DiaChi(java.awt.Frame parent, boolean modal, JTextField _txtDiaChi) {
        super(parent, modal);
        initComponents();
        this._txtDiaChi = _txtDiaChi;
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnF = new javax.swing.JPanel();
        txtDiaChi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnListTinh = new javax.swing.JPanel();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setUndecorated(true);

        pnF.setBackground(java.awt.Color.white);
        pnF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 4));
        pnF.setMaximumSize(new java.awt.Dimension(315, 300));
        pnF.setMinimumSize(new java.awt.Dimension(315, 300));

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDiaChi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        btnOk.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnFLayout = new javax.swing.GroupLayout(pnF);
        pnF.setLayout(pnFLayout);
        pnFLayout.setHorizontalGroup(
            pnFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFLayout.createSequentialGroup()
                .addGroup(pnFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7))
        );
        pnFLayout.setVerticalGroup(
            pnFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        ArrayList list = new LoadDiaChi().getTenTinh();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (txtDiaChi.getText().equals((String) list.get(i))) {
                this.setVisible(false);
                _txtDiaChi.setText(txtDiaChi.getText());
            } else {
                count = 1;
            }
        }
    }//GEN-LAST:event_btnOkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnF;
    private javax.swing.JPanel pnListTinh;
    private javax.swing.JTextField txtDiaChi;
    // End of variables declaration//GEN-END:variables
}
