package view.quanli.phieu;

import controller.Kho;
import controller.LoadTable;
import controller.ReadFileExel;
import controller.ThemAndCapNhatSanPham;
import controller.ThemKhachHang;
import controller.TimByList;
import controller.TimKiemSanPham;
import controller.XuatFile;
import controller.loadDanhMuc;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import model.ConnectDAO;
import model.KhachHang;
import model.NhanVien;
import model.NhomSanPham;
import model.SanPham;
import model.StringUtil;

public class pn_PhieuXuat extends javax.swing.JPanel {

    List<KhachHang> list = new ThemKhachHang().getAllNhaCungCap();
    List<String[]> listKho = new Kho().getKho();
    NhanVien nv;
    String idNhaCungCap = "";
    String idKVKho = "";
    String idNhomSanPham = "";
    List<String[]> listSP = new ArrayList<>();
    List<NhomSanPham> listnsp;
    List<SanPham> listSPMain;

    public pn_PhieuXuat(NhanVien nv) {
        this.nv = nv;
        initComponents();
        txtTenQuanLi.setText(nv.getHoTen());
        txtTenQuanLi.setEditable(false);
        txtTongTien.setEditable(false);
        new loadDanhMuc().loadNhomSanPham1(cbNhomSanPham);
        listnsp = new loadDanhMuc().loadNhomSanPham2();
        listSPMain = new Kho().getSanPhamBy(""," AND Kho.TinhTrang = 0 ");
        new LoadTable().PhieuNhapLeft(listSPMain, table1);
        loadKho();
    }
     public void loadKho() {
        cbKhuVucKho.removeAllItems();
        for (int i = 0; i < listKho.size(); i++) {
            cbKhuVucKho.addItem(listKho.get(i)[1]);
        }
    }
     public int getAmout(String idsp) {
         int num = 0;
         try (Connection conn = new ConnectDAO().getConnection()) {
             String query = "SELECT SoLuongTonKho FROM Kho WHERE IDSanPham = ? ";
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setString(1, idsp);
             ResultSet rs = ps.executeQuery();
             if (rs.next()) 
                 num = rs.getInt(1);
         } catch (Exception e) {
             e.printStackTrace();
         }
         return num;
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        txtTenQuanLi = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnTao = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        btnImport = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        cbKhuVucKho = new javax.swing.JComboBox<>();
        txtTongTien = new javax.swing.JTextField();
        txtNoiNhan = new javax.swing.JTextField();
        txtLiDo = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        txtInput = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        cbNhomSanPham = new javax.swing.JComboBox<>();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();

        setBackground(java.awt.Color.white);
        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 250));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 330));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.EAST);

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setPreferredSize(new java.awt.Dimension(1366, 330));
        jPanel5.setLayout(new java.awt.GridLayout(1, 2));

        jPanel9.setBackground(java.awt.Color.white);
        jPanel9.setLayout(new java.awt.GridLayout(1, 3));

        jPanel10.setBackground(java.awt.Color.white);
        jPanel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jPanel10.setLayout(new java.awt.GridLayout(4, 0, 10, 10));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Kiểu ");
        jPanel10.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tên Quản Lí");
        jPanel10.add(jLabel3);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Sản Phẩm");
        jPanel10.add(jLabel5);

        jPanel14.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel14);

        jPanel9.add(jPanel10);

        jPanel15.setBackground(java.awt.Color.white);
        jPanel15.setLayout(new java.awt.GridLayout(4, 0, 10, 10));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhập Tay", "Nhập File" }));
        jPanel15.add(jComboBox2);

        txtTenQuanLi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel15.add(txtTenQuanLi);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField5.setEnabled(false);
        jPanel15.add(jTextField5);

        jPanel16.setBackground(java.awt.Color.white);
        jPanel16.setLayout(new java.awt.GridLayout(1, 2));
        jPanel16.add(jLabel13);

        btnTao.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-plus-45.png"))); // NOI18N
        btnTao.setText("Tạo ");
        btnTao.setPreferredSize(new java.awt.Dimension(115, 70));
        btnTao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoActionPerformed(evt);
            }
        });
        jPanel16.add(btnTao);

        jPanel15.add(jPanel16);

        jPanel9.add(jPanel15);

        jPanel5.add(jPanel9);

        jPanel6.setBackground(java.awt.Color.white);
        jPanel6.setLayout(new java.awt.GridLayout(1, 2));

        jPanel7.setBackground(java.awt.Color.white);
        jPanel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 10));
        jPanel7.setLayout(new java.awt.GridLayout(5, 0, 10, 10));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Từ Kho");
        jPanel7.add(jLabel10);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Tổng Tiền");
        jPanel7.add(jLabel6);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Nơi Nhận");
        jPanel7.add(jLabel8);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Ghi Chú");
        jPanel7.add(jLabel9);

        jPanel17.setBackground(java.awt.Color.white);
        jPanel17.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 50));
        jPanel17.setLayout(new java.awt.GridLayout(1, 0));

        btnImport.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnImport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-read-online-45.png"))); // NOI18N
        btnImport.setText("Import File *");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });
        jPanel17.add(btnImport);

        jPanel7.add(jPanel17);

        jPanel6.add(jPanel7);

        jPanel8.setBackground(java.awt.Color.white);
        jPanel8.setLayout(new java.awt.GridLayout(5, 0, 10, 10));

        cbKhuVucKho.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbKhuVucKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKhuVucKhoActionPerformed(evt);
            }
        });
        jPanel8.add(cbKhuVucKho);

        txtTongTien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel8.add(txtTongTien);

        txtNoiNhan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel8.add(txtNoiNhan);

        txtLiDo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel8.add(txtLiDo);

        jPanel12.setBackground(java.awt.Color.white);
        jPanel12.setLayout(new java.awt.GridLayout(1, 2));
        jPanel8.add(jPanel12);

        jPanel6.add(jPanel8);

        jPanel5.add(jPanel6);

        jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel13.setBackground(java.awt.Color.white);
        jPanel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel13.setLayout(new java.awt.GridLayout(1, 2));

        jPanel11.setBackground(java.awt.Color.white);
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel18.setBackground(java.awt.Color.white);
        jPanel18.setPreferredSize(new java.awt.Dimension(663, 50));
        jPanel18.setLayout(null);

        txtInput.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputActionPerformed(evt);
            }
        });
        jPanel18.add(txtInput);
        txtInput.setBounds(0, 0, 240, 40);

        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-xls-import-40.png"))); // NOI18N
        btnThem.setText("Xuất File");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel18.add(btnThem);
        btnThem.setBounds(480, 0, 180, 40);

        cbNhomSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbNhomSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNhomSanPhamActionPerformed(evt);
            }
        });
        jPanel18.add(cbNhomSanPham);
        cbNhomSanPham.setBounds(250, 0, 220, 40);

        jPanel11.add(jPanel18, java.awt.BorderLayout.PAGE_START);

        jPanel19.setBackground(java.awt.Color.white);
        jPanel19.setLayout(new java.awt.GridLayout(1, 0));

        table1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table1.setRowHeight(25);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table1);

        jPanel19.add(jScrollPane3);

        jPanel11.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel11);

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        table2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table2.setRowHeight(25);
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table2);

        jPanel3.add(jScrollPane2);

        jPanel13.add(jPanel3);

        jPanel1.add(jPanel13, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        new ReadFileExel().readNhap(table2);
    }//GEN-LAST:event_btnImportActionPerformed

    private void btnTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoActionPerformed
        new jf_TemplatePhieuXuat(listSP, txtNoiNhan.getText(), cbKhuVucKho.getSelectedItem().toString(),
                cbKhuVucKho.getSelectedItem().toString(),
            txtTongTien,nv,txtLiDo,table2,idKVKho).setVisible(true);
    }//GEN-LAST:event_btnTaoActionPerformed

    private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed
        new LoadTable().PhieuNhapLeft(new TimByList().timByWord(txtInput.getText(), listSPMain), table1);
    }//GEN-LAST:event_txtInputActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        String[] s = new String[11];
        String idss = "";
        int index = table1.getSelectedRow();
        String op = JOptionPane.showInputDialog("Nhập Số Lượng (Có " 
                + getAmout(table1.getModel().getValueAt(index, 0).toString())
                + " " + table1.getModel().getValueAt(index, 2).toString() + " Ở Trong Kho)");
        if (op != null) {
            for (int i = 0; i < table1.getColumnCount(); i++) {
                idss = table1.getModel().getValueAt(index, 0).toString();
                s[i] = table1.getModel().getValueAt(index, i).toString();
            }
            for (int i = 0; i < listSPMain.size(); i++) {
                if (listSPMain.get(i).getIdSanPham().equals(idss)) {
                    listSPMain.remove(i);
                }
            }
            new LoadTable().PhieuNhapLeft(!idNhomSanPham.equals("") ? new TimByList().locByNhom(
                        cbNhomSanPham.getSelectedItem().toString(), listSPMain) : listSPMain, table1);
            s[10] = op;
            listSP.add(s);
            new LoadTable().PhieuNhapRight(listSP, table2);
            int tongTien = 0;
            for (int i = 0; i < table2.getRowCount(); i++) {
                int sl = Integer.parseInt(table2.getModel().getValueAt(i, 10).toString().replace(",", ""));
                float giaVonSP = Float.parseFloat(table2.getModel().getValueAt(i, 8).toString().replace(",", "").
                        replace(" VNĐ", ""));
                tongTien += sl * giaVonSP;
            }
            txtTongTien.setText(new DecimalFormat("###,###,###").format(tongTien) + " VNĐ");
        } else {

        }
    }//GEN-LAST:event_table1MouseClicked

    private void cbNhomSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNhomSanPhamActionPerformed
        if (cbNhomSanPham.isValid()) {
            int index = cbNhomSanPham.getSelectedIndex();
            if (index == 0) {
                idNhomSanPham = "";
                new LoadTable().PhieuNhapLeft(listSPMain, table1);
            } else {
                idNhomSanPham = listnsp.get(index - 1).getIdNhomSanPham();
                new LoadTable().PhieuNhapLeft(new TimByList().locByNhom(
                        cbNhomSanPham.getSelectedItem().toString(), listSPMain), table1);
            }
        }
    }//GEN-LAST:event_cbNhomSanPhamActionPerformed

    private void cbKhuVucKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKhuVucKhoActionPerformed
        int index = cbKhuVucKho.getSelectedIndex();
        idKVKho = listKho.get(index)[0];
    }//GEN-LAST:event_cbKhuVucKhoActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
        int index = table2.getSelectedRow();
        new DialogUpdate(table2.getModel().getValueAt(index, 0).toString(), listSP, table2).setVisible(true);
    }//GEN-LAST:event_table2MouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        new XuatFile().execute(table1, new JProgressBar(), "FormatXuat");
    }//GEN-LAST:event_btnThemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnTao;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cbKhuVucKho;
    private javax.swing.JComboBox<String> cbNhomSanPham;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtLiDo;
    private javax.swing.JTextField txtNoiNhan;
    private javax.swing.JTextField txtTenQuanLi;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
