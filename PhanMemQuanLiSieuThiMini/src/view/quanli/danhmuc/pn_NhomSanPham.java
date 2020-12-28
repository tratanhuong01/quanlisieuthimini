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

public class pn_NhomSanPham extends javax.swing.JPanel {

    public pn_NhomSanPham() {
        initComponents();
        jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
        loadTable();
    }

    public void loadTable() {
        String query = "SELECT IDNhomSanPham,TenNhom,LoaiNhom FROM NhomSanPham";
        try (Connection conn = new ConnectDAO().getConnection()) {
            Vector vTitle = null;
            Vector vData = null;
            DefaultTableModel tableMode;
            table.getTableHeader().setPreferredSize(new Dimension(WIDTH, 30));
            table.getTableHeader().setFont(new Font("Time New Roman", 1, 14));
            table.getTableHeader().setBackground(Color.WHITE);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int soCot = rsm.getColumnCount();
            vTitle = new Vector(soCot);
            for (int i = 1; i <= soCot; i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }
            tableMode = new DefaultTableModel(vTitle, 0);
            table.removeAll();
            while (rs.next()) {
                vData = new Vector();
                vData.add(rs.getString(1));
                vData.add(rs.getString(2));
                vData.add(rs.getString(3));
                tableMode.addRow(vData);
            }
            table.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean add(String idNhomSP, String tenNhom,int loaiNhom) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "INSERT INTO NhomSanPham(IDNhomSanPham,TenNhom,LoaiNhom)VALUES "
                    + "(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idNhomSP);
            ps.setString(2, tenNhom);
            ps.setInt(3, loaiNhom);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(String tenNhom,int loaiNhom,String idNhomSP) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "UPDATE NhomKhachHang SET TenNhom = ? , LoaiNhom = ? WHERE IDNhomSanPham = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, tenNhom);
            ps.setInt(2, loaiNhom);
            ps.setString(3, idNhomSP);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(String idNhomSP) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "DELETE FROM NhomSanPham WHERE "
                    + "IDNhomSanPham = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idNhomSP);
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
        txtIDNhomSanPham = new javax.swing.JTextField();
        txtTenNhomSanPham = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLoai = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setBackground(java.awt.Color.white);
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhóm Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N
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
        btnXoa.setBounds(500, 60, 130, 50);

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-edit-45.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua);
        btnSua.setBounds(500, 130, 130, 50);

        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-add-new-45.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem);
        btnThem.setBounds(500, 0, 130, 50);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("ID Nhóm Sản Phẩm");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 180, 37);

        txtIDNhomSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txtIDNhomSanPham);
        txtIDNhomSanPham.setBounds(210, 10, 260, 50);

        txtTenNhomSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txtTenNhomSanPham);
        txtTenNhomSanPham.setBounds(210, 70, 260, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Tên Nhóm Sản Phẩm");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 80, 180, 37);

        txtLoai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txtLoai);
        txtLoai.setBounds(210, 130, 260, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Loại");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 140, 180, 37);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        table.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
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
        ));
        table.setRowHeight(40);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel2.add(jScrollPane1);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (add(txtIDNhomSanPham.getText(),  txtTenNhomSanPham.getText(),
                Integer.parseInt(txtLoai.getText())))
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        else 
            JOptionPane.showMessageDialog(this, "Thêm thất bại ... vui lòng kiểm tra lại !!");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (delete(txtIDNhomSanPham.getText()) == true)
            JOptionPane.showMessageDialog(this, "Xóa thành công");
        else 
            JOptionPane.showMessageDialog(this, "Xóa thất bại ... vui lòng kiểm tra lại !!");
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (update(txtTenNhomSanPham.getText(),Integer.parseInt(txtLoai.getText()),txtIDNhomSanPham.getText()))
            JOptionPane.showMessageDialog(this, "Sửa thành công");
        else 
            JOptionPane.showMessageDialog(this, "Sửa thất bại ... vui lòng kiểm tra lại !!");
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int index = table.getSelectedRow();
        txtIDNhomSanPham.setText(table.getModel().getValueAt(index, 0).toString());
        txtTenNhomSanPham.setText(table.getModel().getValueAt(index, 1).toString());
        txtLoai.setText(table.getModel().getValueAt(index, 2).toString());
    }//GEN-LAST:event_tableMouseClicked


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
    private javax.swing.JTable table;
    private javax.swing.JTextField txtIDNhomSanPham;
    private javax.swing.JTextField txtLoai;
    private javax.swing.JTextField txtTenNhomSanPham;
    // End of variables declaration//GEN-END:variables
}
