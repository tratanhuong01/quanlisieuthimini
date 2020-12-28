package view.quanli.phieu;

import controller.Kho;
import controller.LoadSanPham;
import controller.LoadTable;
import controller.ReadFileExel;
import controller.ThemAndCapNhatSanPham;
import controller.ThemKhachHang;
import controller.TimByList;
import controller.TimKiemSanPham;
import controller.loadDanhMuc;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ConnectDAO;
import model.KhachHang;
import model.NhanVien;
import model.NhomSanPham;
import model.SanPham;
import model.StringUtil;

public class pn_PhieuNhap extends javax.swing.JPanel {

    List<KhachHang> list = new ThemKhachHang().getAllNhaCungCap();
    List<String[]> listKho = new Kho().getKho();
    NhanVien nv;
    String idNhaCungCap = "";
    String idKVKho = "";
    String idNhomSanPham = "";
    List<String[]> listSP = new ArrayList<>();
    List<NhomSanPham> listnsp;
    List<SanPham> listSPMain;

    public pn_PhieuNhap(NhanVien nv) {
        this.nv = nv;
        initComponents();
        txtTenQuanLi.setText(nv.getHoTen());
        loadNhaCungCap();
        txtTenQuanLi.setEditable(false);
        txtTongTien.setEditable(false);
        btnImport.setEnabled(false);
        btnThemMoi.setEnabled(true);
        new loadDanhMuc().loadNhomSanPham1(cbNhomSanPham);
        listnsp = new loadDanhMuc().loadNhomSanPham2();
        listSPMain = new Kho().getSanPhamBy("", "");
        new LoadTable().PhieuNhapLeft(listSPMain, table3);
    }

    public void loadNhaCungCap() {
        cbNhaCungCap.removeAllItems();
        for (int i = 0; i < list.size(); i++) {
            cbNhaCungCap.addItem(list.get(i).getHoTen());
        }
        cbKhoNhan.removeAllItems();
        for (int i = 0; i < listKho.size(); i++) {
            cbKhoNhan.addItem(listKho.get(i)[1]);
        }
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
        cbKieu = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        cbNhaCungCap = new javax.swing.JComboBox<>();
        txtTenQuanLi = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnTao = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        btnImport = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        txtTongTien = new javax.swing.JTextField();
        ptThanhToan = new javax.swing.JComboBox<>();
        cbKhoNhan = new javax.swing.JComboBox<>();
        txtGhiChu = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtVAT = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        left = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        txtInput = new javax.swing.JTextField();
        btnThemMoi = new javax.swing.JButton();
        cbNhomSanPham = new javax.swing.JComboBox<>();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        right = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listSPAdd = new javax.swing.JTable();

        setBackground(java.awt.Color.white);
        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 300));
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
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.EAST);

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setPreferredSize(new java.awt.Dimension(1366, 330));
        jPanel5.setLayout(new java.awt.GridLayout(1, 2));

        jPanel9.setBackground(java.awt.Color.white);
        jPanel9.setLayout(new java.awt.GridLayout(1, 3));

        jPanel10.setBackground(java.awt.Color.white);
        jPanel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jPanel10.setLayout(new java.awt.GridLayout(5, 0, 10, 10));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nhà Cung Cấp");
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
        jPanel14.setLayout(new java.awt.GridLayout(1, 0));

        cbKieu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbKieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhập Tay", "Nhập File" }));
        cbKieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKieuActionPerformed(evt);
            }
        });
        jPanel14.add(cbKieu);

        jPanel10.add(jPanel14);

        jPanel9.add(jPanel10);

        jPanel15.setBackground(java.awt.Color.white);
        jPanel15.setLayout(new java.awt.GridLayout(5, 0, 10, 10));

        cbNhaCungCap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbNhaCungCap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNhaCungCapActionPerformed(evt);
            }
        });
        jPanel15.add(cbNhaCungCap);

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

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Tổng Tiền");
        jPanel7.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Phương Thức Thanh Toán");
        jPanel7.add(jLabel7);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Kho Nhận");
        jPanel7.add(jLabel8);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Ghi Chú");
        jPanel7.add(jLabel9);

        jPanel17.setBackground(java.awt.Color.white);
        jPanel17.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 50));
        jPanel17.setLayout(new java.awt.GridLayout(1, 2));

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

        txtTongTien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel8.add(txtTongTien);

        ptThanhToan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ptThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền Mặt", "ATM" }));
        jPanel8.add(ptThanhToan);

        cbKhoNhan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbKhoNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKhoNhanActionPerformed(evt);
            }
        });
        jPanel8.add(cbKhoNhan);

        txtGhiChu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel8.add(txtGhiChu);

        jPanel12.setBackground(java.awt.Color.white);
        jPanel12.setLayout(new java.awt.GridLayout(1, 2));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("VAT   ");
        jPanel12.add(jLabel10);

        txtVAT.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel12.add(txtVAT);

        jPanel8.add(jPanel12);

        jPanel6.add(jPanel8);

        jPanel5.add(jPanel6);

        jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel13.setLayout(new java.awt.GridLayout(1, 2));

        left.setLayout(new java.awt.BorderLayout());

        jPanel18.setPreferredSize(new java.awt.Dimension(663, 50));
        jPanel18.setLayout(null);

        txtInput.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInputKeyPressed(evt);
            }
        });
        jPanel18.add(txtInput);
        txtInput.setBounds(0, 0, 240, 40);

        btnThemMoi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-add-new-45.png"))); // NOI18N
        btnThemMoi.setText("Thêm Mới");
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });
        jPanel18.add(btnThemMoi);
        btnThemMoi.setBounds(490, 0, 170, 40);

        cbNhomSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbNhomSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNhomSanPhamActionPerformed(evt);
            }
        });
        jPanel18.add(cbNhomSanPham);
        cbNhomSanPham.setBounds(260, 0, 220, 40);

        left.add(jPanel18, java.awt.BorderLayout.PAGE_START);

        jPanel19.setLayout(new java.awt.GridLayout(1, 0));

        table3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table3.setRowHeight(25);
        table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table3);

        jPanel19.add(jScrollPane3);

        left.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel13.add(left);

        right.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        right.setLayout(new java.awt.GridLayout(1, 0));

        listSPAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listSPAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        listSPAdd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        listSPAdd.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        listSPAdd.setRowHeight(25);
        jScrollPane2.setViewportView(listSPAdd);

        right.add(jScrollPane2);

        jPanel13.add(right);

        jPanel1.add(jPanel13, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        new ReadFileExel().readNhap(listSPAdd);
        int tongTien = 0;
        for (int i = 0; i < listSPAdd.getRowCount(); i++) {
            int sl = Integer.parseInt(listSPAdd.getModel().getValueAt(i, 10).toString().replace(",", ""));
            float giaVonSP = Float.parseFloat(listSPAdd.getModel().getValueAt(i, 8).toString().replace(",", "").
                    replace(" VNĐ", ""));
            tongTien += sl * giaVonSP;
        }
        txtTongTien.setText(new DecimalFormat("###,###,###").format(tongTien) + " VNĐ");
    }//GEN-LAST:event_btnImportActionPerformed

    private void btnTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoActionPerformed
        new jf_TemplatePhieuNhap(listSP,cbNhaCungCap.getSelectedItem().toString(),"Đà Nẵng",
        "2730382","029226353",ptThanhToan.getSelectedItem().toString(),"VNĐ").setVisible(true);
//        ThemAndCapNhatSanPham tac = new ThemAndCapNhatSanPham();
//        String id = StringUtil.taoID("IDHoaDon", "HoaDon", "HD");
//        SimpleDateFormat formatTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        String time = formatTime.format(new Date(System.currentTimeMillis()));
//        float tongTien = Float.parseFloat(txtTongTien.getText().replace(",", "").replace(" VNĐ", ""));
//        tac.insertPhieuNhap(id, time, idNhaCungCap, nv.getIdNhanVien(),
//                tongTien, 0, null, 1, Float.parseFloat(txtVAT.getText()), txtGhiChu.getText());
//        int num = listSPAdd.getRowCount();
//        for (int i = 0; i < num; i++) {
//            String iddhd = StringUtil.taoID("IDDongHoaDon", "DongHoaDon", "DHD");
//            String idDonViTinh = listSPAdd.getModel().getValueAt(i, 3).toString();
//            String idSanPham = listSPAdd.getModel().getValueAt(i, 0).toString();
//            int sl = Integer.parseInt(listSPAdd.getModel().getValueAt(i, 10).toString().replace(",", ""));
//            new LoadSanPham().updateNhaCungCap(idNhaCungCap, idSanPham);
//            tac.insertDongHoaDon(iddhd, id, listSPAdd.getModel().getValueAt(i, 0).toString(), idDonViTinh, sl, 0, 0, 0);
//        }
//        String idPhieu = StringUtil.taoID("IDPhieu", "PhieuKho", "PK");
//        tac.insertPhieu(idPhieu, id, null, null, idKVKho);
//        tac.updateIDPhieu(idPhieu, id);
//        JOptionPane.showMessageDialog(this, "Thành Công");
//            for (int i = 0; i < num; i++) {
//                String idSanPham = StringUtil.taoID("IDSanPham", "SanPham", "SP");
//                String iddhd = StringUtil.taoID("IDDongHoaDon", "DongHoaDon", "DHD");
//                String idBangGia = StringUtil.taoID("IDBangGia", "BangGia", "BG");
//                String idDonViTinh = listSPAdd.getModel().getValueAt(i, 3).toString();
//                int sl = Integer.parseInt(listSPAdd.getModel().getValueAt(i, 10).toString().replace(",", ""));
//                float giam = Float.parseFloat(listSPAdd.getModel().getValueAt(i, 7).toString().replace(",", ""));
//                float donGia = Float.parseFloat(listSPAdd.getModel().getValueAt(i, 6).toString().replace(" VNĐ", "").replace(",", ""));
//                float giaVonSP = Float.parseFloat(listSPAdd.getModel().getValueAt(i, 8).toString().replace(" VNĐ", "").replace(",", ""));
//                String idNhomSP = new TimKiemSanPham().getAllNhomSanPham(listSPAdd.getModel().getValueAt(i, 1).toString());
//                String tenSP = listSPAdd.getModel().getValueAt(i, 2).toString();
//                String ngaySanXuat = listSPAdd.getModel().getValueAt(i, 4).toString();
//                String hanSuDung = listSPAdd.getModel().getValueAt(i, 5).toString();
//                tac.insertBangGia(idBangGia, donGia, giam, giaVonSP);
//                tac.them(idSanPham, idNhomSP, tenSP, idDonViTinh, ngaySanXuat, hanSuDung,
//                        "BANKEO1.png", idBangGia, idNhaCungCap, 0);
//                tac.insertDongHoaDon(iddhd, id, idSanPham, idDonViTinh, sl, giam, (float) 0, 0);
//            }
//            String idPhieu = StringUtil.taoID("IDPhieu", "PhieuKho", "PK");
//            tac.insertPhieu(idPhieu, id, null, null, idKVKho);
//            tac.updateIDPhieu(idPhieu, id);
//            JOptionPane.showMessageDialog(this, "Thành Công");
    }//GEN-LAST:event_btnTaoActionPerformed

    private void cbNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNhaCungCapActionPerformed
        for (int i = 0; i < list.size(); i++) {
            if (cbNhaCungCap.getSelectedIndex() == i) {
                idNhaCungCap = list.get(i).getIdKhachHang();
            }
        }
    }//GEN-LAST:event_cbNhaCungCapActionPerformed

    private void cbKieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKieuActionPerformed
        if (cbKieu.getSelectedIndex() == 0) {
            btnImport.setEnabled(false);
            btnThemMoi.setEnabled(true);
            txtInput.setEnabled(true);
            listSPAdd.removeAll();
            listSPAdd.updateUI();
        } else {
            btnImport.setEnabled(true);
            btnThemMoi.setEnabled(false);
            txtInput.setEnabled(false);
            listSPAdd.removeAll();
            listSPAdd.updateUI();
        }
    }//GEN-LAST:event_cbKieuActionPerformed

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        new jf_SanPham().setVisible(true);
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void txtInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputKeyPressed
        new LoadTable().PhieuNhapLeft(new TimByList().timByWord(txtInput.getText(), listSPMain), table3);
    }//GEN-LAST:event_txtInputKeyPressed

    private void table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MouseClicked
        String[] s = new String[11];
        String idss = "";
        String op = JOptionPane.showInputDialog("Nhập Số Lượng");
        if (!op.equals("")) {
            int index = table3.getSelectedRow();
            idss = table3.getModel().getValueAt(index, 0).toString();
            for (int i = 0; i < table3.getColumnCount(); i++) {
                s[i] = table3.getModel().getValueAt(index, i).toString();
            }
            for (int i = 0; i < listSPMain.size(); i++) {
                if (listSPMain.get(i).getIdSanPham().equals(idss)) {
                    listSPMain.remove(i);
                }
            }
            new LoadTable().PhieuNhapLeft(listSPMain, table3);
            listSP.add(s);
            s[10] = op;
            new LoadTable().PhieuNhapRight(listSP, listSPAdd);
            int tongTien = 0;
            for (int i = 0; i < listSPAdd.getRowCount(); i++) {
                int sl = Integer.parseInt(listSPAdd.getModel().getValueAt(i, 10).toString().replace(",", ""));
                float giaVonSP = Float.parseFloat(listSPAdd.getModel().getValueAt(i, 8).toString().replace(",", "").
                        replace(" VNĐ", ""));
                tongTien += sl * giaVonSP;
            }
            txtTongTien.setText(new DecimalFormat("###,###,###").format(tongTien) + " VNĐ");

        } else {

        }
    }//GEN-LAST:event_table3MouseClicked

    private void cbKhoNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKhoNhanActionPerformed
        int index = cbKhoNhan.getSelectedIndex();
        idKVKho = listKho.get(index)[0];
    }//GEN-LAST:event_cbKhoNhanActionPerformed

    private void cbNhomSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNhomSanPhamActionPerformed
        if (cbNhomSanPham.isValid()) {
            int index = cbNhomSanPham.getSelectedIndex();
            if (index == 0) {
                idNhomSanPham = "";
                new LoadTable().PhieuNhapLeft(listSPMain, table3);
            } else {
                idNhomSanPham = listnsp.get(index - 1).getIdNhomSanPham();
                new LoadTable().PhieuNhapLeft(new TimByList().locByNhom(
                        cbNhomSanPham.getSelectedItem().toString(), listSPMain), table3);
            }
        }
    }//GEN-LAST:event_cbNhomSanPhamActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnTao;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JComboBox<String> cbKhoNhan;
    private javax.swing.JComboBox<String> cbKieu;
    private javax.swing.JComboBox<String> cbNhaCungCap;
    private javax.swing.JComboBox<String> cbNhomSanPham;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel left;
    private javax.swing.JTable listSPAdd;
    private javax.swing.JComboBox<String> ptThanhToan;
    private javax.swing.JPanel right;
    private javax.swing.JTable table3;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtTenQuanLi;
    private javax.swing.JTextField txtTongTien;
    private javax.swing.JTextField txtVAT;
    // End of variables declaration//GEN-END:variables
}
