package view.kho;

import controller.LoadTable;
import controller.XuatFile;
import javax.swing.JProgressBar;

public class pn_KiemKeTK extends javax.swing.JPanel {

    public pn_KiemKeTK() {
        initComponents();
        new LoadTable().SanPham("", table);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnXuatFile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbTinhTrangSP = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        btnTinhTrang = new javax.swing.JButton();
        btnTimSp = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnTuDen = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 150));
        jPanel1.setLayout(null);

        btnXuatFile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXuatFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-xls-export-40.png"))); // NOI18N
        btnXuatFile.setText("Xuất File");
        btnXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileActionPerformed(evt);
            }
        });
        jPanel1.add(btnXuatFile);
        btnXuatFile.setBounds(1170, 20, 180, 51);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Đến");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 90, 60, 50);

        cbTinhTrangSP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbTinhTrangSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hết Hạn", "Sắp Hết Hạn" }));
        jPanel1.add(cbTinhTrangSP);
        cbTinhTrangSP.setBounds(150, 20, 283, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Sản Phẩm");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(579, 24, 130, 40);

        txtInput.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txtInput);
        txtInput.setBounds(710, 20, 293, 50);

        btnTinhTrang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTinhTrang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-search-client-45.png"))); // NOI18N
        btnTinhTrang.setText("Lọc");
        btnTinhTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhTrangActionPerformed(evt);
            }
        });
        jPanel1.add(btnTinhTrang);
        btnTinhTrang.setBounds(451, 20, 120, 51);

        btnTimSp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTimSp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-search-client-45.png"))); // NOI18N
        btnTimSp.setText("Tìm");
        btnTimSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimSpActionPerformed(evt);
            }
        });
        jPanel1.add(btnTimSp);
        btnTimSp.setBounds(1020, 20, 120, 51);

        jPanel3.setPreferredSize(new java.awt.Dimension(0, 150));
        jPanel3.setLayout(null);

        jButton4.setText("Xuất File");
        jPanel3.add(jButton4);
        jButton4.setBounds(1170, 20, 160, 51);

        jLabel3.setText("jLabel1");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(12, 25, 135, 40);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox2);
        jComboBox2.setBounds(150, 20, 283, 50);

        jLabel4.setText("jLabel1");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(579, 42, 135, 16);

        jTextField2.setText("jTextField1");
        jPanel3.add(jTextField2);
        jTextField2.setBounds(710, 20, 293, 50);

        jButton5.setText("Lọc");
        jPanel3.add(jButton5);
        jButton5.setBounds(471, 19, 51, 51);

        jButton6.setText("Tìm");
        jPanel3.add(jButton6);
        jButton6.setBounds(1020, 20, 55, 51);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 0, 150);

        btnTuDen.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTuDen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-search-client-45.png"))); // NOI18N
        btnTuDen.setText("Lọc");
        btnTuDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTuDenActionPerformed(evt);
            }
        });
        jPanel1.add(btnTuDen);
        btnTuDen.setBounds(451, 90, 120, 51);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(270, 90, 160, 50);

        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jDateChooser2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jDateChooser2);
        jDateChooser2.setBounds(50, 90, 150, 50);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Tình Trạng SP");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 20, 135, 50);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Từ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 90, 40, 50);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(25);
        jScrollPane2.setViewportView(table);

        jPanel2.add(jScrollPane2);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTinhTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhTrangActionPerformed
        switch (cbTinhTrangSP.getSelectedIndex()) {
            case 0 :
                new LoadTable().SanPham("WHERE HanSuDung <= GETDATE()",table);
                break;
            case 1:
                new LoadTable().SanPham("WHERE HanSuDung <= GETDATE()-15",table);
                break;
        }
    }//GEN-LAST:event_btnTinhTrangActionPerformed

    private void btnTuDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTuDenActionPerformed
        new LoadTable().SanPham("WHERE HanSuDung <= GETDATE()",table);
    }//GEN-LAST:event_btnTuDenActionPerformed

    private void btnTimSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimSpActionPerformed
        new LoadTable().SanPham("WHERE SanPham.TenSanPham LIKE N'%" + txtInput.getText() + "%'",table);
    }//GEN-LAST:event_btnTimSpActionPerformed

    private void btnXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileActionPerformed
        new XuatFile().execute(table, new JProgressBar(), "SP");
    }//GEN-LAST:event_btnXuatFileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimSp;
    private javax.swing.JButton btnTinhTrang;
    private javax.swing.JButton btnTuDen;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JComboBox<String> cbTinhTrangSP;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables

}
