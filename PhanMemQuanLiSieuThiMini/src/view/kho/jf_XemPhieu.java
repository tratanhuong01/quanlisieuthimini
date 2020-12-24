package view.kho;

public class jf_XemPhieu extends javax.swing.JFrame {

    public jf_XemPhieu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        txtIDSanPham = new javax.swing.JTextField();
        txtMaSKU = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbNgayNhap = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtSoLuongNhap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIDPhieu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTongTien1 = new javax.swing.JTextField();
        txtSoLuongNhap1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSoLuongNhap2 = new javax.swing.JTextField();
        bottom = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        main.setBackground(java.awt.Color.white);
        main.setLayout(new java.awt.BorderLayout());

        top.setBackground(java.awt.Color.white);
        top.setPreferredSize(new java.awt.Dimension(1366, 200));
        top.setLayout(null);

        txtIDSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        top.add(txtIDSanPham);
        txtIDSanPham.setBounds(180, 80, 260, 40);

        txtMaSKU.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        top.add(txtMaSKU);
        txtMaSKU.setBounds(180, 150, 260, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Mã SKU");
        top.add(jLabel2);
        jLabel2.setBounds(30, 150, 140, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Ngày");
        top.add(jLabel3);
        jLabel3.setBounds(480, 20, 150, 40);
        top.add(cbNgayNhap);
        cbNgayNhap.setBounds(630, 20, 260, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Số Lượng");
        top.add(jLabel5);
        jLabel5.setBounds(480, 80, 140, 40);

        txtSoLuongNhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        top.add(txtSoLuongNhap);
        txtSoLuongNhap.setBounds(630, 80, 260, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("ID Sản Phẩm");
        top.add(jLabel4);
        jLabel4.setBounds(30, 80, 140, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("ID Phiếu");
        top.add(jLabel6);
        jLabel6.setBounds(30, 20, 140, 40);

        txtIDPhieu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        top.add(txtIDPhieu);
        txtIDPhieu.setBounds(180, 20, 260, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Tổng Tiền");
        top.add(jLabel7);
        jLabel7.setBounds(480, 150, 140, 40);

        txtTongTien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        top.add(txtTongTien);
        txtTongTien.setBounds(630, 150, 260, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Tên Quản Lí");
        top.add(jLabel8);
        jLabel8.setBounds(930, 150, 140, 40);

        txtTongTien1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        top.add(txtTongTien1);
        txtTongTien1.setBounds(1080, 150, 260, 40);

        txtSoLuongNhap1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        top.add(txtSoLuongNhap1);
        txtSoLuongNhap1.setBounds(1080, 20, 260, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Tổng Sản Phẩm");
        top.add(jLabel9);
        jLabel9.setBounds(930, 80, 140, 40);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Tổng Mặt Hàng");
        top.add(jLabel10);
        jLabel10.setBounds(930, 20, 150, 40);

        txtSoLuongNhap2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        top.add(txtSoLuongNhap2);
        txtSoLuongNhap2.setBounds(1080, 80, 260, 40);

        main.add(top, java.awt.BorderLayout.PAGE_START);

        bottom.setBackground(java.awt.Color.white);
        bottom.setLayout(new java.awt.GridLayout(1, 0));

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

        bottom.add(jScrollPane2);

        main.add(bottom, java.awt.BorderLayout.CENTER);

        getContentPane().add(main, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void trueOrFalse(boolean b) {
        txtIDSanPham.setEditable(b);
        txtMaSKU.setEditable(b);
        txtSoLuongNhap.setEditable(b);
        cbNgayNhap.setEnabled(b);
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_XemPhieu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottom;
    private com.toedter.calendar.JDateChooser cbNgayNhap;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel main;
    private javax.swing.JTable table;
    private javax.swing.JPanel top;
    private javax.swing.JTextField txtIDPhieu;
    private javax.swing.JTextField txtIDSanPham;
    private javax.swing.JTextField txtMaSKU;
    private javax.swing.JTextField txtSoLuongNhap;
    private javax.swing.JTextField txtSoLuongNhap1;
    private javax.swing.JTextField txtSoLuongNhap2;
    private javax.swing.JTextField txtTongTien;
    private javax.swing.JTextField txtTongTien1;
    // End of variables declaration//GEN-END:variables
}
