package view.kho;

public class pn_KiemKeTK extends javax.swing.JPanel {

    public pn_KiemKeTK() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 150));
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Xuất File");
        jPanel1.add(jButton1);
        jButton1.setBounds(1170, 20, 160, 51);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Đến");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 90, 60, 50);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hết Hạn", "Sắp Hết Hạn" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(150, 20, 283, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Sản Phẩm");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(579, 24, 130, 40);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(710, 20, 293, 50);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Lọc");
        jPanel1.add(jButton3);
        jButton3.setBounds(451, 20, 90, 51);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Tìm");
        jPanel1.add(jButton2);
        jButton2.setBounds(1020, 20, 80, 51);

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

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.setText("Lọc");
        jPanel1.add(jButton7);
        jButton7.setBounds(451, 90, 90, 51);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(270, 90, 160, 50);
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
