package view.quanli.phieu;

import controller.LoadTable;
import java.util.List;
import javax.swing.JTable;

public class DialogUpdate extends javax.swing.JFrame {

    String idSanPham;
    List<String[]> listsp;
    JTable tableRight;

    public DialogUpdate(String idSanPham, List<String[]> listsp, JTable tableRight) {
        initComponents();
        this.idSanPham = idSanPham;
        this.listsp = listsp;
        this.tableRight = tableRight;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnDong = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        txtInput = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 143));
        setMinimumSize(new java.awt.Dimension(400, 143));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 143));
        setSize(new java.awt.Dimension(400, 143));

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"), 3));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        btnDong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-shutdown-45.png"))); // NOI18N
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });
        jPanel3.add(btnDong);
        btnDong.setBounds(258, 13, 130, 52);

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-edit-45.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel3.add(btnSua);
        btnSua.setBounds(48, 78, 120, 52);

        txtInput.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txtInput);
        txtInput.setBounds(12, 20, 180, 50);

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-delete-40.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel3.add(btnXoa);
        btnXoa.setBounds(258, 78, 130, 52);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        for (int i = 0; i < listsp.size(); i++) {
            if (listsp.get(i)[0].equals(idSanPham)) {
                listsp.get(i)[10] = txtInput.getText();
            }
        }
        this.dispose();
        new LoadTable().PhieuNhapRight(listsp, tableRight);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        for (int i = 0; i < listsp.size(); i++) {
            if (listsp.get(i)[0].equals(idSanPham)) {
                listsp.remove(i);
            }
        }
        this.dispose();
        new LoadTable().PhieuNhapRight(listsp, tableRight);
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnXoa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
