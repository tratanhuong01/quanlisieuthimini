package view.quanli.phieu;

import controller.ThemAndCapNhatSanPham;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.NhanVien;
import model.StringUtil;

public class jf_TemplatePhieuXuat extends javax.swing.JFrame {
    List<String[]> list;
    JTextField txtTongTien;
    NhanVien nv;
    JTextField txtLiDos;
    JTable table2;
    String idKVKho;
    public jf_TemplatePhieuXuat(List<String[]> list,String noiNhan,String diaChi,String taiKho,
            JTextField txtTongTien,NhanVien nv,JTextField txtLiDos,JTable table2,String idKVKho) {
        initComponents();
        this.list = list;
        this.txtTongTien = txtTongTien;
        this.nv = nv;
        this.table2 = table2;
        this.idKVKho = idKVKho;
        this.txtLiDos = txtLiDos;
        int top = load(list);
        pn.setSize(1366, top);
        JPanel pnKiTen = new jf_KiTen();
        pnKiTen.setBounds(0, top+400, 1366, 2000);
        pnMain.add(pnKiTen);
        pnMain.setPreferredSize(new Dimension(1366, top + 600));
        pnMain.repaint();
        pnMain.validate();
        lbSoPhieu.setText("Số Phiếu : " + StringUtil.taoID("IDPhieu", "PhieuKho", "PK"));
        txtLiDo.setText(txtLiDos.getText());
        txtTaiKho.setText(taiKho);
        txtNoiNhan.setText(noiNhan);
        txtDiaChi.setText(diaChi);
    }
    public void execute() {
        ThemAndCapNhatSanPham tac = new ThemAndCapNhatSanPham();
        String id = StringUtil.taoID("IDHoaDon", "HoaDon", "HD");
        SimpleDateFormat formatTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        float tongTien = Float.parseFloat(txtTongTien.getText().replace(",", "").replace(" VNĐ", ""));
        String time = formatTime.format(new Date(System.currentTimeMillis()));
        tac.insertPhieuNhap(id, time, null, nv.getIdNhanVien(),
                tongTien, 0, null, 2, 0, txtLiDo.getText());
        for (int i = 0; i < table2.getRowCount(); i++) {
            String idSanPham = table2.getModel().getValueAt(i, 0).toString();
            String iddhd = StringUtil.taoID("IDDongHoaDon", "DongHoaDon", "DHD");
            String idDonViTinh = table2.getModel().getValueAt(i, 3).toString();
            int sl = Integer.parseInt(table2.getModel().getValueAt(i, 10).toString());;
            tac.insertDongHoaDon(iddhd, id, idSanPham, idDonViTinh, sl, 0, (float) 0, 0);
            
        }
        String idPhieu = StringUtil.taoID("IDPhieu", "PhieuKho", "PK");
        tac.insertPhieu(idPhieu, id, null, null, idKVKho);
        tac.updateIDPhieu(idPhieu, id);
        JOptionPane.showMessageDialog(this, "Thành Công");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnMain = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbTenDoanhNghiep1 = new javax.swing.JLabel();
        lbSoPhieu = new javax.swing.JLabel();
        lbDiaChi3 = new javax.swing.JLabel();
        lbDiaChi4 = new javax.swing.JLabel();
        lbSoDienThoai1 = new javax.swing.JLabel();
        lbbr4 = new javax.swing.JLabel();
        lbTenPhieu1 = new javax.swing.JLabel();
        lbNgayThangNam1 = new javax.swing.JLabel();
        lbbr5 = new javax.swing.JLabel();
        txtNoiNhan = new javax.swing.JLabel();
        lbTenNhaCungCap1 = new javax.swing.JLabel();
        lbDiaChi5 = new javax.swing.JLabel();
        txtLiDo = new javax.swing.JLabel();
        lbMaSoThue1 = new javax.swing.JLabel();
        txtTaiKho = new javax.swing.JLabel();
        lbSoDienThoaiNCC1 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JLabel();
        lbbr6 = new javax.swing.JLabel();
        lbTenNhaCungCap2 = new javax.swing.JLabel();
        txtTenNhaCungCap2 = new javax.swing.JLabel();
        pn = new javax.swing.JPanel();
        lbDiaChi7 = new javax.swing.JLabel();
        lbDiaChi8 = new javax.swing.JLabel();
        lbDiaChi10 = new javax.swing.JLabel();
        lbDiaChi11 = new javax.swing.JLabel();
        lbDiaChi12 = new javax.swing.JLabel();
        lbDiaChi13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        xuatFile = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1366, 768));

        pnMain.setBackground(java.awt.Color.white);
        pnMain.setMaximumSize(new java.awt.Dimension(1366, 768));
        pnMain.setMinimumSize(new java.awt.Dimension(1366, 768));
        pnMain.setPreferredSize(new java.awt.Dimension(1366, 768));
        pnMain.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnMain.add(jLabel14);
        jLabel14.setBounds(290, 220, 230, 30);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 380));
        jPanel1.setLayout(null);

        lbTenDoanhNghiep1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbTenDoanhNghiep1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTenDoanhNghiep1.setText("Market Mini Three Members");
        jPanel1.add(lbTenDoanhNghiep1);
        lbTenDoanhNghiep1.setBounds(0, 0, 560, 30);

        lbSoPhieu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbSoPhieu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSoPhieu.setText("Số Phiếu : ");
        jPanel1.add(lbSoPhieu);
        lbSoPhieu.setBounds(800, 10, 560, 30);

        lbDiaChi3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbDiaChi3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDiaChi3.setText("Địa Chỉ : Phường Khuê Mỹ - Quận Ngũ Hành Sơn ");
        jPanel1.add(lbDiaChi3);
        lbDiaChi3.setBounds(0, 30, 560, 30);

        lbDiaChi4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbDiaChi4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDiaChi4.setText("TP. Đà Nẵng");
        jPanel1.add(lbDiaChi4);
        lbDiaChi4.setBounds(0, 60, 560, 30);

        lbSoDienThoai1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbSoDienThoai1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSoDienThoai1.setText("Số Điện Thoại : 0354114665");
        jPanel1.add(lbSoDienThoai1);
        lbSoDienThoai1.setBounds(0, 90, 560, 30);

        lbbr4.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        lbbr4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbbr4.setText("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        jPanel1.add(lbbr4);
        lbbr4.setBounds(0, 120, 1370, 20);

        lbTenPhieu1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbTenPhieu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTenPhieu1.setText("PHIẾU XUẤT HÀNG");
        jPanel1.add(lbTenPhieu1);
        lbTenPhieu1.setBounds(530, 140, 350, 50);

        lbNgayThangNam1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lbNgayThangNam1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNgayThangNam1.setText("Ngày 28 Tháng 12 Năm 2020");
        jPanel1.add(lbNgayThangNam1);
        lbNgayThangNam1.setBounds(520, 190, 370, 30);

        lbbr5.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        lbbr5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbbr5.setText("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        jPanel1.add(lbbr5);
        lbbr5.setBounds(0, 220, 1370, 20);

        txtNoiNhan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtNoiNhan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtNoiNhan.setText("Công Ty TNHH Market Mini Three Members");
        jPanel1.add(txtNoiNhan);
        txtNoiNhan.setBounds(840, 340, 400, 30);

        lbTenNhaCungCap1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbTenNhaCungCap1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTenNhaCungCap1.setText("Nơi Nhận : ");
        jPanel1.add(lbTenNhaCungCap1);
        lbTenNhaCungCap1.setBounds(730, 340, 100, 30);

        lbDiaChi5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbDiaChi5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDiaChi5.setText("Lí Do Xuất Kho :");
        jPanel1.add(lbDiaChi5);
        lbDiaChi5.setBounds(90, 300, 190, 30);

        txtLiDo.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtLiDo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtLiDo.setText("................................................................................................................................................................................................");
        jPanel1.add(txtLiDo);
        txtLiDo.setBounds(290, 300, 950, 30);

        lbMaSoThue1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbMaSoThue1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbMaSoThue1.setText("Tại Kho");
        jPanel1.add(lbMaSoThue1);
        lbMaSoThue1.setBounds(90, 340, 190, 30);

        txtTaiKho.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTaiKho.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTaiKho.setText("...................................................................");
        jPanel1.add(txtTaiKho);
        txtTaiKho.setBounds(290, 340, 350, 30);

        lbSoDienThoaiNCC1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbSoDienThoaiNCC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbSoDienThoaiNCC1.setText("Địa Chỉ :");
        jPanel1.add(lbSoDienThoaiNCC1);
        lbSoDienThoaiNCC1.setBounds(730, 260, 100, 30);

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtDiaChi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDiaChi.setText("Công Ty TNHH Market Mini Three Members");
        jPanel1.add(txtDiaChi);
        txtDiaChi.setBounds(840, 260, 390, 30);

        lbbr6.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        lbbr6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbbr6.setText("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        jPanel1.add(lbbr6);
        lbbr6.setBounds(0, 380, 1370, 20);

        lbTenNhaCungCap2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbTenNhaCungCap2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTenNhaCungCap2.setText("Họ Tên Người Nhận :");
        jPanel1.add(lbTenNhaCungCap2);
        lbTenNhaCungCap2.setBounds(90, 260, 190, 30);

        txtTenNhaCungCap2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTenNhaCungCap2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTenNhaCungCap2.setText("....................................................................................");
        jPanel1.add(txtTenNhaCungCap2);
        txtTenNhaCungCap2.setBounds(290, 260, 400, 30);

        pnMain.add(jPanel1);
        jPanel1.setBounds(0, 0, 1366, 380);

        pn.setBackground(java.awt.Color.white);
        pn.setPreferredSize(new java.awt.Dimension(1366, 390));
        pn.setLayout(null);

        lbDiaChi7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbDiaChi7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDiaChi7.setText("Giá Nhập");
        lbDiaChi7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn.add(lbDiaChi7);
        lbDiaChi7.setBounds(720, 10, 240, 40);

        lbDiaChi8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbDiaChi8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDiaChi8.setText("Số Lượng");
        lbDiaChi8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn.add(lbDiaChi8);
        lbDiaChi8.setBounds(960, 10, 110, 40);

        lbDiaChi10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbDiaChi10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDiaChi10.setText("Mã Sản Phẩm");
        lbDiaChi10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn.add(lbDiaChi10);
        lbDiaChi10.setBounds(160, 10, 180, 40);

        lbDiaChi11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbDiaChi11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDiaChi11.setText("STT");
        lbDiaChi11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn.add(lbDiaChi11);
        lbDiaChi11.setBounds(50, 10, 110, 40);

        lbDiaChi12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbDiaChi12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDiaChi12.setText("Tên Sản Phẩm");
        lbDiaChi12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn.add(lbDiaChi12);
        lbDiaChi12.setBounds(340, 10, 380, 40);

        lbDiaChi13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbDiaChi13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDiaChi13.setText("Thành Tiền");
        lbDiaChi13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn.add(lbDiaChi13);
        lbDiaChi13.setBounds(1070, 10, 250, 40);

        pnMain.add(pn);
        pn.setBounds(0, 380, 1366, 390);

        jScrollPane1.setViewportView(pnMain);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.PAGE_START);

        xuatFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-report-file-45.png"))); // NOI18N
        xuatFile.setText("Xuất File");
        xuatFile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        xuatFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xuatFileMouseClicked(evt);
            }
        });
        xuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xuatFileActionPerformed(evt);
            }
        });
        jMenuBar1.add(xuatFile);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-delete-40.png"))); // NOI18N
        jMenu3.setText("Thoát");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void xuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xuatFileActionPerformed
        
    }//GEN-LAST:event_xuatFileActionPerformed

    private void xuatFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xuatFileMouseClicked
        printPhieu(pnMain);
        execute();
        this.dispose();
    }//GEN-LAST:event_xuatFileMouseClicked
    public void printPhieu(JPanel pnMain) {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setJobName("Print Phiếu Xuất");
        printerJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D g2 = (Graphics2D) graphics;
                g2.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                g2.scale(0.45, 0.45);
                pnMain.paint(g2);
                pnMain.paint(graphics);
                return Printable.PAGE_EXISTS;
            }
        });
        boolean result = printerJob.printDialog();
        if (result) {
            try {
                printerJob.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public JLabel lb(JPanel pn,String s) {
        JLabel lb = new JLabel();
        lb.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText(s);
        lb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn.add(lb);
        return lb;
    }
    public JLabel lb1(JPanel pn,String s) {
        JLabel lb = new JLabel();
        lb.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb.setText(s);
        lb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn.add(lb);
        return lb;
    }
    public JLabel lb2(JPanel pn,String s) {
        JLabel lb = new JLabel();
        lb.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lb.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb.setText(s);
        lb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn.add(lb);
        return lb;
    }
    public int load(List<String[]> list) {
        int tongTien = 0;
        int top = 50;
        for (int i = 0; i < list.size(); i++) {
            int sl = Integer.parseInt(list.get(i)[10]);
            int donGia = Integer.parseInt(list.get(i)[6].replace(" VNĐ", "").replace(",", ""));
            lb(pn,String.valueOf(i+1)).setBounds(50, top, 110, 40);
            lb(pn,list.get(i)[0]).setBounds(160, top, 180, 40);
            lb(pn,list.get(i)[2]).setBounds(340, top, 380, 40);
            lb(pn,list.get(i)[6]).setBounds(720, top, 240, 40);
            lb(pn,list.get(i)[10]).setBounds(960, top, 110, 40);
            lb(pn,new DecimalFormat("###,###,###").format(sl*donGia) + " VNĐ").setBounds(1070, top, 250, 40);
            top+=40;
            tongTien += sl*donGia;
        }
        top +=40;    
        lb1(pn,"Cộng Tiền Hàng : ").setBounds(50, top, 1020, 40);
        lb1(pn,new DecimalFormat("###,###,###").format(tongTien) + " VNĐ").setBounds(1070, top, 250, 40);
        top +=40;
        return top;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel14;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDiaChi10;
    private javax.swing.JLabel lbDiaChi11;
    private javax.swing.JLabel lbDiaChi12;
    private javax.swing.JLabel lbDiaChi13;
    private javax.swing.JLabel lbDiaChi3;
    private javax.swing.JLabel lbDiaChi4;
    private javax.swing.JLabel lbDiaChi5;
    private javax.swing.JLabel lbDiaChi7;
    private javax.swing.JLabel lbDiaChi8;
    private javax.swing.JLabel lbMaSoThue1;
    private javax.swing.JLabel lbNgayThangNam1;
    private javax.swing.JLabel lbSoDienThoai1;
    private javax.swing.JLabel lbSoDienThoaiNCC1;
    private javax.swing.JLabel lbSoPhieu;
    private javax.swing.JLabel lbTenDoanhNghiep1;
    private javax.swing.JLabel lbTenNhaCungCap1;
    private javax.swing.JLabel lbTenNhaCungCap2;
    private javax.swing.JLabel lbTenPhieu1;
    private javax.swing.JLabel lbbr4;
    private javax.swing.JLabel lbbr5;
    private javax.swing.JLabel lbbr6;
    private javax.swing.JPanel pn;
    private javax.swing.JPanel pnMain;
    private javax.swing.JLabel txtDiaChi;
    private javax.swing.JLabel txtLiDo;
    private javax.swing.JLabel txtNoiNhan;
    private javax.swing.JLabel txtTaiKho;
    private javax.swing.JLabel txtTenNhaCungCap2;
    private javax.swing.JMenu xuatFile;
    // End of variables declaration//GEN-END:variables
}
