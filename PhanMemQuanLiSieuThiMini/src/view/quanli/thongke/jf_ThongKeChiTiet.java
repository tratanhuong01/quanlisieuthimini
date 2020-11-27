package view.quanli.thongke;

public class jf_ThongKeChiTiet extends javax.swing.JFrame {

    public jf_ThongKeChiTiet() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listNhanVien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 70));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Từ");
        jPanel8.add(jLabel1);
        jPanel8.add(jDateChooser1);

        jPanel1.add(jPanel8);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Đến");
        jPanel7.add(jLabel2);
        jPanel7.add(jDateChooser2);

        jPanel1.add(jPanel7);

        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));
        jPanel6.add(jLabel3);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Lọc");
        jPanel6.add(jButton1);

        jPanel1.add(jPanel6);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 90));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel9.setBackground(java.awt.Color.white);
        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Tổng Doanh Thu :  ");
        jPanel9.add(jLabel6);

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("28.389.00 VNĐ");
        jPanel9.add(jLabel7);

        jPanel2.add(jPanel9);

        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        jLabel10.setBackground(java.awt.Color.white);
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Tổng Hóa Đơn  :  ");
        jPanel11.add(jLabel10);

        jLabel11.setBackground(java.awt.Color.white);
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("500 Hóa Đơn");
        jPanel11.add(jLabel11);

        jPanel2.add(jPanel11);

        jPanel10.setBackground(java.awt.Color.white);
        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        jLabel8.setBackground(java.awt.Color.white);
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Tổng Sản Phẩm :  ");
        jPanel10.add(jLabel8);

        jLabel9.setBackground(java.awt.Color.white);
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("1.237 Sản Phẩm");
        jPanel10.add(jLabel9);

        jPanel2.add(jPanel10);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel4.setMinimumSize(new java.awt.Dimension(100, 60));
        jPanel4.setPreferredSize(new java.awt.Dimension(1366, 50));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jButton3.setText("jButton3");
        jPanel4.add(jButton3);
        jPanel4.add(jLabel4);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox1);
        jPanel4.add(jLabel5);

        jButton2.setText("jButton2");
        jPanel4.add(jButton2);

        jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        listNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        listNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        listNhanVien.setRowHeight(40);
        listNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listNhanVien);

        jPanel5.add(jScrollPane1);

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listNhanVienMouseClicked
        
    }//GEN-LAST:event_listNhanVienMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_ThongKeChiTiet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listNhanVien;
    // End of variables declaration//GEN-END:variables
}
