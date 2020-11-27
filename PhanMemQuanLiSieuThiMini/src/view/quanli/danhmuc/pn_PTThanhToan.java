package view.quanli.danhmuc;

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

public class pn_PTThanhToan extends javax.swing.JPanel {

    public pn_PTThanhToan() {
        initComponents();
        loadTable();
    }
    public void loadTable() {
        String query = "SELECT * FROM PhuongThucThanhToan";
        try (Connection conn = new ConnectDAO().getConnection()) {
            Vector vTitle = null;
            Vector vData = null;
            DefaultTableModel tableMode;
            jTable1.getTableHeader().setPreferredSize(new Dimension(WIDTH, 30));
            jTable1.getTableHeader().setFont(new Font("Time New Roman", 1, 14));
            jTable1.getTableHeader().setBackground(Color.WHITE);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int soCot = rsm.getColumnCount();
            vTitle = new Vector(soCot);
            for (int i = 1; i <= soCot; i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }
            tableMode = new DefaultTableModel(vTitle, 0);
            jTable1.removeAll();
            while (rs.next()) {
                vData = new Vector();
                vData.add(rs.getString(1));
                vData.add(rs.getString(2));
                tableMode.addRow(vData);
            }
            jTable1.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean add(String idPTThanhToan,String tenPTThanhToan) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "INSERT INTO PhuongThucThanhToan(IDPTThanhToan,TenPTThanhToan)VALUES "
                    + "(?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idPTThanhToan);
            ps.setString(2, tenPTThanhToan);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean update(String tenPTThanhToan,String idPTThanhToan) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "UPDATE PhuongThucThanhToan SET "
                    + "TenPTThanhToan = ? WHERE IDPTThanhToan = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, tenPTThanhToan);
            ps.setString(2, idPTThanhToan);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean delete(String idPTThanhToan) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "DELETE FROM PhuongThucThanhToan WHERE "
                    + "IDPTThanhToan = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idPTThanhToan);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIDPTThanhToan = new javax.swing.JTextField();
        txtTenPTThanhToan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(java.awt.Color.white);
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phương Thức Thanh Toán", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(682, 200));
        jPanel1.setLayout(null);

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa);
        btnXoa.setBounds(540, 80, 110, 38);

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua);
        btnSua.setBounds(540, 140, 110, 38);

        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem);
        btnThem.setBounds(540, 20, 110, 38);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("ID PT Thanh Toán");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 200, 37);

        txtIDPTThanhToan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txtIDPTThanhToan);
        txtIDPTThanhToan.setBounds(220, 10, 280, 50);

        txtTenPTThanhToan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txtTenPTThanhToan);
        txtTenPTThanhToan.setBounds(220, 70, 280, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Tên PT Thanh Toán");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 80, 200, 37);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(220, 130, 280, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 140, 200, 37);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
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
        jTable1.setRowHeight(40);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (add(txtIDPTThanhToan.getText(), txtTenPTThanhToan.getText()) == true) {
            JOptionPane.showMessageDialog(this, "Thêm Thành Công");
        }
        else {
            JOptionPane.showMessageDialog(this, "Thêm Thất Bại... Vui Lòng Kiểm Tra Lại !!");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (delete(txtIDPTThanhToan.getText()) == true) {
            JOptionPane.showMessageDialog(this, "Xóa Thành Công");
        }
        else {
            JOptionPane.showMessageDialog(this, "Xóa Thất Bại... Vui Lòng Kiểm Tra Lại !!");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (update(txtTenPTThanhToan.getText(),txtIDPTThanhToan.getText()) == true) {
            JOptionPane.showMessageDialog(this, "Sửa Thành Công");
        }
        else {
            JOptionPane.showMessageDialog(this, "Sửa Thất Bại... Vui Lòng Kiểm Tra Lại !!");
        }
    }//GEN-LAST:event_btnSuaActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtIDPTThanhToan;
    private javax.swing.JTextField txtTenPTThanhToan;
    // End of variables declaration//GEN-END:variables
}
