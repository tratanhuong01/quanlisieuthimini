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

public class pn_DonViTinh extends javax.swing.JPanel {

    public pn_DonViTinh() {
        initComponents();
        jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
        loadTable();
    }

    public void loadTable() {
        String query = "SELECT * FROM DonViTinh";
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

    public boolean add(String idDonViTinh, int macDinh) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "INSERT INTO DonViTinh(IDDonViTinh,MacDinh)VALUES "
                    + "(?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idDonViTinh);
            ps.setInt(2, macDinh);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(int macDinh,String idDonViTinh) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "UPDATE PhuongThucThanhToan SET "
                    + "TenPTThanhToan = ? WHERE IDPTThanhToan = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, macDinh);
            ps.setString(2, idDonViTinh);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(String idDonViTinh) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "DELETE FROM DonViTinh WHERE "
                    + "IDDonViTinh = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idDonViTinh);
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
        txtIDDonViTinh = new javax.swing.JTextField();
        txtMacDinh = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(java.awt.Color.white);
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đơn Vị Tính", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(682, 200));
        jPanel1.setLayout(null);

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-delete-40.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa);
        btnXoa.setBounds(510, 68, 130, 49);

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-edit-45.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua);
        btnSua.setBounds(510, 140, 130, 53);

        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-add-new-45.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem);
        btnThem.setBounds(510, 0, 130, 50);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("ID Đơn Vị Tính");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 147, 37);

        txtIDDonViTinh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txtIDDonViTinh);
        txtIDDonViTinh.setBounds(170, 10, 300, 50);

        txtMacDinh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txtMacDinh);
        txtMacDinh.setBounds(170, 70, 300, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Mặc Định");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 80, 147, 37);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(170, 130, 300, 50);

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
        if (add(txtIDDonViTinh.getText(), Integer.parseInt(txtMacDinh.getText())) == true) {
            JOptionPane.showMessageDialog(this, "Thêm Thành Công");
        } else {
            JOptionPane.showMessageDialog(this, "Thêm Thất Bại... Vui Lòng Kiểm Tra Lại !!");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (delete(txtIDDonViTinh.getText()) == true) {
            JOptionPane.showMessageDialog(this, "Xóa Thành Công");
        } else {
            JOptionPane.showMessageDialog(this, "Xóa Thất Bại... Vui Lòng Kiểm Tra Lại !!");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (update(Integer.parseInt(txtMacDinh.getText()),txtIDDonViTinh.getText()) == true) {
            JOptionPane.showMessageDialog(this, "Sửa Thành Công");
        } else {
            JOptionPane.showMessageDialog(this, "Sửa Thất Bại... Vui Lòng Kiểm Tra Lại !!");
        }
    }//GEN-LAST:event_btnSuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtIDDonViTinh;
    private javax.swing.JTextField txtMacDinh;
    // End of variables declaration//GEN-END:variables
}
