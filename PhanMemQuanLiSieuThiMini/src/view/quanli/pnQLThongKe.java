package view.quanli;

public class pnQLThongKe extends javax.swing.JPanel {

    public pnQLThongKe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnXoaNhanVien = new javax.swing.JButton();
        btnSuaNhanVien = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnThemNhanVien = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1440, 740));
        setMinimumSize(new java.awt.Dimension(1440, 740));

        pn.setMaximumSize(new java.awt.Dimension(1440, 740));
        pn.setMinimumSize(new java.awt.Dimension(1440, 740));
        pn.setLayout(null);

        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 200, 1190, 540);

        pn.add(jPanel1);
        jPanel1.setBounds(0, 0, 1190, 740);

        btnXoaNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoaNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        btnXoaNhanVien.setText("Xóa Nhân Viên");
        pn.add(btnXoaNhanVien);
        btnXoaNhanVien.setBounds(1210, 160, 230, 80);

        btnSuaNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSuaNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        btnSuaNhanVien.setText("Sửa Nhân Viên");
        pn.add(btnSuaNhanVien);
        btnSuaNhanVien.setBounds(1210, 320, 230, 80);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jButton3.setText("Tìm Kiếm");
        pn.add(jButton3);
        jButton3.setBounds(1210, 480, 230, 80);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        jButton2.setText("Tìm Kiếm");
        pn.add(jButton2);
        jButton2.setBounds(1210, 630, 230, 80);

        btnThemNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThemNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/add-user.png"))); // NOI18N
        btnThemNhanVien.setText("Thêm Nhân Viên");
        pn.add(btnThemNhanVien);
        btnThemNhanVien.setBounds(1210, 10, 230, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaNhanVien;
    private javax.swing.JButton btnThemNhanVien;
    private javax.swing.JButton btnXoaNhanVien;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pn;
    // End of variables declaration//GEN-END:variables
}
