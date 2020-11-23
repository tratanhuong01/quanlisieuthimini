package view.quanli.khachhang;

import controller.ThemKhachHang;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.ConnectDAO;
import model.KhachHang;
import model.StringUtil;

public class pn_QLKhachHang extends javax.swing.JPanel {

    String s = "";
    int[] state = {0, 0, 0, 0};
    JCheckBox[] listCheckBox;
    JTextField[] listTextField;
    KhachHang kh;
    public pn_QLKhachHang() {
        initComponents();
        loadTable("");
        listCheckBox = listCheckBox();
        listTextField = listTextField();
        for (int i = 0; i < listCheckBox.length; i++) {
            int a = i;
            listCheckBox[i].addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    for (int j = 0; j < listCheckBox.length; j++) {
                        if (e.getStateChange() == 1) {
                            state[a] = 1;
                        } else {
                            state[a] = 0;
                            listTextField[a].setText("");
                        }
                    }

                }
            });
        }
    }

    public JCheckBox[] listCheckBox() {
        JCheckBox[] listCheckBox = {cboxTenKhachHang, cboxMaKhachHang, cboxDiaChi, cboxSoDienThoai};
        return listCheckBox;
    }

    public JTextField[] listTextField() {
        JTextField[] listTextField = {txtTenKhachHang, txtMaKhachHang, txtDiaChi, txtSoDienThoai};
        return listTextField;
    }

    public String addQuery(int num, String text) {
        String s = "";
        switch (num) {
            case 0:
                s = " KhachHang.HoTen LIKE N'%" + text + "%' ";
                break;
            case 1:
                s = " KhachHang.IDKhachHang LIKE N'%" + text + "%' ";
                break;
            case 2:
                s = " KhachHang.DiaChi LIKE N'%" + text + "%' ";
                break;
            case 3:
                s = " KhachHang.SoDienThoai LIKE N'%" + text + "%' ";
                break;
        }
        return s;
    }

    public void loadTable(String querys) {
            String query = "SELECT KhachHang.IDKhachHang ,NhomKhachHang.TenNhom,KhachHang.HoTen,KhachHang.GioiTinh,\n"
                    + "KhachHang.SoDienThoai,KhachHang.DiaChi,NhomKhachHang.TenNhom,KhachHang.MaSoThue,\n"
                    + "KhachHang.TraDK,KhachHang.ThuDK,TichDiem.SoDiem\n"
                    + "FROM KhachHang INNER JOIN NhomKhachHang ON KhachHang.IDNhomKH = NhomKhachHang.IDNhomKH \n"
                    + "INNER JOIN TichDiem ON KhachHang.IDKhachHang = TichDiem.IDKhachHang " + querys;
        System.out.print(query);
        try (Connection conn = new ConnectDAO().getConnection()) {
            Vector vTitle = null;
            Vector vData = null;
            DefaultTableModel tableMode;
            listKhachHang.getTableHeader().setPreferredSize(new Dimension(WIDTH, 30));
            listKhachHang.getTableHeader().setFont(new Font("Time New Roman", 1, 14));
            listKhachHang.getTableHeader().setBackground(Color.WHITE);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int soCot = rsm.getColumnCount();
            vTitle = new Vector(soCot);
            for (int i = 1; i <= soCot; i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }
            tableMode = new DefaultTableModel(vTitle, 0);
            listKhachHang.removeAll();
            while (rs.next()) {
                vData = new Vector();
                vData.add(rs.getString(1));
                vData.add(rs.getString(2));
                vData.add(rs.getString(3));
                vData.add(rs.getString(4));
                vData.add(rs.getString(5));
                vData.add(rs.getString(6));
                vData.add(rs.getString(7));
                vData.add(rs.getString(8));
                vData.add(rs.getString(9));
                vData.add(rs.getString(10));
                vData.add(rs.getString(11));
                tableMode.addRow(vData);
            }
            listKhachHang.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        cboxTenKhachHang = new javax.swing.JCheckBox();
        txtTenKhachHang = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        cboxDiaChi = new javax.swing.JCheckBox();
        txtDiaChi = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cboxMaKhachHang = new javax.swing.JCheckBox();
        txtMaKhachHang = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        cboxSoDienThoai = new javax.swing.JCheckBox();
        txtSoDienThoai = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listKhachHang = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        btnQuanLiDiem = new javax.swing.JButton();
        btnSuaKhachHang = new javax.swing.JButton();
        btnXoaKhachHang = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btnXuatFile = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản Lí Khách Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 150));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        jPanel3.setPreferredSize(new java.awt.Dimension(230, 119));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btnTimKiem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        jPanel3.add(btnTimKiem);

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel13.setBackground(java.awt.Color.white);

        cboxTenKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cboxTenKhachHang.setText("Tên Khách Hàng");
        cboxTenKhachHang.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel13.add(cboxTenKhachHang);

        txtTenKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtTenKhachHang.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel13.add(txtTenKhachHang);

        cboxDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cboxDiaChi.setText("Địa Chỉ");
        cboxDiaChi.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel17.add(cboxDiaChi);

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDiaChi.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel17.add(txtDiaChi);

        jPanel13.add(jPanel17);

        jPanel2.add(jPanel13);

        jPanel4.setBackground(java.awt.Color.white);

        cboxMaKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cboxMaKhachHang.setText("Mã Khách Hàng");
        cboxMaKhachHang.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel4.add(cboxMaKhachHang);

        txtMaKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtMaKhachHang.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel4.add(txtMaKhachHang);

        cboxSoDienThoai.setBackground(java.awt.Color.white);
        cboxSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cboxSoDienThoai.setText("Số Điện Thoại");
        cboxSoDienThoai.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel9.add(cboxSoDienThoai);

        txtSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtSoDienThoai.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel9.add(txtSoDienThoai);

        jPanel4.add(jPanel9);

        jPanel2.add(jPanel4);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel5.setPreferredSize(new java.awt.Dimension(1050, 535));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        listKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        listKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        listKhachHang.setRowHeight(40);
        listKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listKhachHang);

        jPanel5.add(jScrollPane1);

        add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel21.setBackground(java.awt.Color.white);
        jPanel21.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel21.setMaximumSize(new java.awt.Dimension(315, 32767));
        jPanel21.setMinimumSize(new java.awt.Dimension(315, 255));
        jPanel21.setPreferredSize(new java.awt.Dimension(315, 535));
        jPanel21.setRequestFocusEnabled(false);
        jPanel21.setLayout(new java.awt.GridLayout(5, 0, 10, 10));

        btnQuanLiDiem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnQuanLiDiem.setText("Quản Lí Điểm");
        btnQuanLiDiem.setPreferredSize(new java.awt.Dimension(285, 75));
        btnQuanLiDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLiDiemActionPerformed(evt);
            }
        });
        jPanel21.add(btnQuanLiDiem);

        btnSuaKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSuaKhachHang.setText("Sửa Khách Hàng");
        btnSuaKhachHang.setPreferredSize(new java.awt.Dimension(285, 75));
        btnSuaKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaKhachHangActionPerformed(evt);
            }
        });
        jPanel21.add(btnSuaKhachHang);

        btnXoaKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoaKhachHang.setText("Xóa Khách Hàng");
        btnXoaKhachHang.setPreferredSize(new java.awt.Dimension(285, 75));
        jPanel21.add(btnXoaKhachHang);

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton10.setPreferredSize(new java.awt.Dimension(285, 75));
        jPanel21.add(jButton10);

        btnXuatFile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXuatFile.setText("Xuất File");
        btnXuatFile.setPreferredSize(new java.awt.Dimension(285, 75));
        jPanel21.add(btnXuatFile);

        add(jPanel21, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    private void listKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listKhachHangMouseClicked
        int row = listKhachHang.getSelectedRow();
        txtTenKhachHang.setText(listKhachHang.getModel().getValueAt(row, 2).toString());
        txtMaKhachHang.setText(listKhachHang.getModel().getValueAt(row, 0).toString());
        txtDiaChi.setText(listKhachHang.getModel().getValueAt(row, 5).toString());
        txtSoDienThoai.setText(listKhachHang.getModel().getValueAt(row, 4).toString());
    }//GEN-LAST:event_listKhachHangMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String query = "";
        for (int i = 0; i < state.length; i++) {
            if (state[i] == 1) {
                query += "AND" + addQuery(i, listTextField[i].getText());
            }
        }
        System.out.println(query);
        loadTable(query);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnQuanLiDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLiDiemActionPerformed
        pn_QuanLiDiem qld = new pn_QuanLiDiem();
        qld.setVisible(true);
    }//GEN-LAST:event_btnQuanLiDiemActionPerformed

    private void btnSuaKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaKhachHangActionPerformed
        kh = new ThemKhachHang().getKhachHang(txtMaKhachHang.getText());
        pn_SuaKhachHang skh = new pn_SuaKhachHang(kh);
        skh.setVisible(true);
    }//GEN-LAST:event_btnSuaKhachHangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuanLiDiem;
    private javax.swing.JButton btnSuaKhachHang;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoaKhachHang;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JCheckBox cboxDiaChi;
    private javax.swing.JCheckBox cboxMaKhachHang;
    private javax.swing.JCheckBox cboxSoDienThoai;
    private javax.swing.JCheckBox cboxTenKhachHang;
    private javax.swing.JButton jButton10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listKhachHang;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenKhachHang;
    // End of variables declaration//GEN-END:variables
}
