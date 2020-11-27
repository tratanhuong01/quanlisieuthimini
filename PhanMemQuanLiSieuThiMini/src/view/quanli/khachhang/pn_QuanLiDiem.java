package view.quanli.khachhang;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ConnectDAO;

public class pn_QuanLiDiem extends javax.swing.JFrame {

    public pn_QuanLiDiem() {
        initComponents();
        loadTable("");
        txtDiemHienTai.setText(String.valueOf(getDiemHienTai()));
    }

    public boolean suaDiemHienTai(String diem) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "UPDATE TichDiem SET QuyDiemDiem = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, diem);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public int getDiemHienTai() {
        int diem = 0;
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT QuyDiemDiem FROM TichDiem";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                diem = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return diem;
    }

    public void loadTable(String text) {
        String query = "SELECT KhachHang.IDKhachHang ,KhachHang.HoTen,TichDiem.SoDiem ,TichDiem.QuyDiemDiem FROM KhachHang\n"
                + "INNER JOIN TichDiem ON KhachHang.IDKhachHang = TichDiem.IDKhachHang \n"
                + "WHERE KhachHang.IDKhachHang LIKE N'%" + text + "%' OR KhachHang.HoTen LIKE N'%" + text + "%' ";
        System.out.print(query);
        try (Connection conn = new ConnectDAO().getConnection()) {
            Vector vTitle = null;
            Vector vData = null;
            DefaultTableModel tableMode;
            table1.getTableHeader().setPreferredSize(new Dimension(WIDTH, 30));
            table1.getTableHeader().setFont(new Font("Time New Roman", 1, 14));
            table1.getTableHeader().setBackground(Color.WHITE);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int soCot = rsm.getColumnCount();
            vTitle = new Vector(soCot);
            for (int i = 1; i <= soCot; i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }
            tableMode = new DefaultTableModel(vTitle, 0);
            table1.removeAll();
            while (rs.next()) {
                vData = new Vector();
                vData.add(rs.getString(1));
                vData.add(rs.getString(2));
                vData.add(rs.getString(3));
                vData.add(rs.getString(4));
                tableMode.addRow(vData);
            }
            table1.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnTim = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDiemHienTai = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIDKhachHang = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtSoDiem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1095, 600));
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel6.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 3, true));

        jPanel1.setBackground(java.awt.Color.white);

        btnTim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-search-client-45.png"))); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-shutdown-45.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Nhập Tên Hoặc ID Của Khách Hàng");

        txtInput.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 13, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInput)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        table1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        table1.setRowHeight(40);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table1);

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Giá Quy Đổi Điểm Hiện Tại");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(10, 270, 332, 53);

        txtDiemHienTai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel4.add(txtDiemHienTai);
        txtDiemHienTai.setBounds(90, 320, 177, 53);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("ID Khách Hàng");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(10, 0, 123, 53);

        txtIDKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel4.add(txtIDKhachHang);
        txtIDKhachHang.setBounds(142, 0, 190, 53);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("*******************************************");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(0, 230, 344, 16);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Tên");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(10, 80, 100, 53);

        txtTen.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel4.add(txtTen);
        txtTen.setBounds(140, 80, 190, 53);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Thay Đổi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(120, 390, 110, 50);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Số Điểm");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(10, 160, 100, 53);

        txtSoDiem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel4.add(txtSoDiem);
        txtSoDiem.setBounds(140, 160, 190, 53);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel6);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void table1tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1tableMouseClicked
        int row = table1.getSelectedRow();
        txtIDKhachHang.setText(table1.getModel().getValueAt(row, 0).toString());
        txtTen.setText(table1.getModel().getValueAt(row, 1).toString());
        txtSoDiem.setText(table1.getModel().getValueAt(row, 2).toString());
    }//GEN-LAST:event_table1tableMouseClicked

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        loadTable(txtInput.getText());
    }//GEN-LAST:event_btnTimActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (suaDiemHienTai(txtDiemHienTai.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Sửa Thành Công");
            loadTable("");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Sửa Thất Bại");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pn_QuanLiDiem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtDiemHienTai;
    private javax.swing.JTextField txtIDKhachHang;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtSoDiem;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
