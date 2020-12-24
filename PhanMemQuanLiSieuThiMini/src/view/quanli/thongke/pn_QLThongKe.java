package view.quanli.thongke;

import controller.ThongKe;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.ConnectDAO;

public class pn_QLThongKe extends javax.swing.JPanel {

    public pn_QLThongKe() {
        initComponents();
        JPanel[] pn = {pnNgay, pnNgayTruoc, pnTuan, pnTuanTruoc, pnThang, pnThangTruoc};
        JButton[] btn = {btnNgay, btnNgayTruoc, btnTuan, btnTuanTruoc, btnThang, btnThangTruoc};
        for (int i = 0; i < pn.length; i++) {
            try {
                addLabel("Hóa Đơn : " + String.valueOf(new DecimalFormat("###,###,###").format(new ThongKe().switchHoaDon(i + 1))
                        + " Cái"), pn[i]);
                addLabel("Sản Phẩm : " + String.valueOf(new DecimalFormat("###,###,###").format(new ThongKe().switchSanPham(i + 1))
                        + " SP"), pn[i]);
                addLabel("Doanh Thu : " + String.valueOf(new DecimalFormat("###,###,###").format(new ThongKe().switchTien(i + 1))
                        + "  VNĐ"), pn[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            btn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    new jf_ThongKeChiTiet().setVisible(true);
                }
            });
        }
    }

    public void addLabel(String text, JPanel pn) {
        JLabel lb = new JLabel(text);
        lb.setFont(new java.awt.Font("Times New Roman", 2, 19)); // NOI18N
        pn.add(lb);
    }

    public List<JLabel> tim(JPanel pn) {
        List<JLabel> listLb = new ArrayList<>();
        for (Component comp : pn.getComponents()) {
            JLabel lb = (JLabel) comp;
            listLb.add(lb);
        }
        return listLb;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pnDoanhThuTrongNgay = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnNgay = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnNgay = new javax.swing.JPanel();
        pnDoanhThuTrongTuan = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnNgayTruoc = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnNgayTruoc = new javax.swing.JPanel();
        pnDoanhThuNgayTruoc = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btnTuan = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pnTuan = new javax.swing.JPanel();
        pnDoanhThuTuanTruoc = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        btnTuanTruoc = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pnTuanTruoc = new javax.swing.JPanel();
        pnDoanhThuTrongThang = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        btnThang = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        pnThang = new javax.swing.JPanel();
        pnDoanhThuThangTruoc = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        btnThangTruoc = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        pnThangTruoc = new javax.swing.JPanel();
        pnDoanhThuTrongNam = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        btnNam = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        pnDoanhThuNamTruoc = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        btnNamTruoc = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        pnDoanhThuNamTruoc1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        btnXemChiTiet = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1366, 600));
        setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel2.setMinimumSize(new java.awt.Dimension(1366, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 600));
        jPanel2.setLayout(new java.awt.GridLayout(3, 3, 20, 20));

        pnDoanhThuTrongNgay.setBackground(new java.awt.Color(204, 255, 204));
        pnDoanhThuTrongNgay.setBorder(new javax.swing.border.MatteBorder(null));
        pnDoanhThuTrongNgay.setMaximumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTrongNgay.setMinimumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTrongNgay.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 35));
        jPanel3.setPreferredSize(new java.awt.Dimension(440, 35));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setBackground(new java.awt.Color(77, 177, 81));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thống Kê Trong Ngày");
        jPanel3.add(jLabel1);

        pnDoanhThuTrongNgay.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel4.setPreferredSize(new java.awt.Dimension(440, 60));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        btnNgay.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNgay.setText("Thông Tin Chi Tiết");
        jPanel4.add(btnNgay);

        pnDoanhThuTrongNgay.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setBackground(new java.awt.Color(77, 177, 81));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/438526.png"))); // NOI18N
        jLabel2.setToolTipText("");
        jPanel6.add(jLabel2);

        pnDoanhThuTrongNgay.add(jPanel6, java.awt.BorderLayout.LINE_START);

        pnNgay.setBackground(new java.awt.Color(204, 255, 204));
        pnNgay.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        pnNgay.setLayout(new java.awt.GridLayout(3, 0));
        pnDoanhThuTrongNgay.add(pnNgay, java.awt.BorderLayout.CENTER);

        jPanel2.add(pnDoanhThuTrongNgay);

        pnDoanhThuTrongTuan.setBackground(new java.awt.Color(204, 204, 204));
        pnDoanhThuTrongTuan.setBorder(new javax.swing.border.MatteBorder(null));
        pnDoanhThuTrongTuan.setMaximumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTrongTuan.setMinimumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTrongTuan.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setMinimumSize(new java.awt.Dimension(100, 35));
        jPanel7.setPreferredSize(new java.awt.Dimension(440, 35));
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Thống Kê Ngày Trước");
        jPanel7.add(jLabel4);

        pnDoanhThuTrongTuan.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel8.setPreferredSize(new java.awt.Dimension(440, 60));
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        btnNgayTruoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNgayTruoc.setText("Thông Tin Chi Tiết");
        jPanel8.add(btnNgayTruoc);

        pnDoanhThuTrongTuan.add(jPanel8, java.awt.BorderLayout.PAGE_END);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/438526.png"))); // NOI18N
        jLabel5.setToolTipText("");
        jPanel9.add(jLabel5);

        pnDoanhThuTrongTuan.add(jPanel9, java.awt.BorderLayout.LINE_START);

        pnNgayTruoc.setBackground(new java.awt.Color(204, 204, 204));
        pnNgayTruoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        pnNgayTruoc.setLayout(new java.awt.GridLayout(3, 0));
        pnDoanhThuTrongTuan.add(pnNgayTruoc, java.awt.BorderLayout.CENTER);

        jPanel2.add(pnDoanhThuTrongTuan);

        pnDoanhThuNgayTruoc.setBackground(new java.awt.Color(255, 255, 102));
        pnDoanhThuNgayTruoc.setBorder(new javax.swing.border.MatteBorder(null));
        pnDoanhThuNgayTruoc.setMaximumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuNgayTruoc.setMinimumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuNgayTruoc.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 102));
        jPanel11.setMinimumSize(new java.awt.Dimension(100, 35));
        jPanel11.setPreferredSize(new java.awt.Dimension(440, 35));
        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Thống Kê Trong Tuần");
        jPanel11.add(jLabel7);

        pnDoanhThuNgayTruoc.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel12.setBackground(new java.awt.Color(255, 255, 102));
        jPanel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel12.setPreferredSize(new java.awt.Dimension(440, 60));
        jPanel12.setLayout(new java.awt.GridLayout(1, 0));

        btnTuan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTuan.setText("Thông Tin Chi Tiết");
        jPanel12.add(btnTuan);

        pnDoanhThuNgayTruoc.add(jPanel12, java.awt.BorderLayout.PAGE_END);

        jPanel13.setBackground(new java.awt.Color(255, 255, 102));
        jPanel13.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel13.setLayout(new java.awt.GridLayout(1, 0));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/438526.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jPanel13.add(jLabel8);

        pnDoanhThuNgayTruoc.add(jPanel13, java.awt.BorderLayout.LINE_START);

        pnTuan.setBackground(new java.awt.Color(255, 255, 102));
        pnTuan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        pnTuan.setLayout(new java.awt.GridLayout(3, 0));
        pnDoanhThuNgayTruoc.add(pnTuan, java.awt.BorderLayout.CENTER);

        jPanel2.add(pnDoanhThuNgayTruoc);

        pnDoanhThuTuanTruoc.setBackground(new java.awt.Color(102, 204, 255));
        pnDoanhThuTuanTruoc.setBorder(new javax.swing.border.MatteBorder(null));
        pnDoanhThuTuanTruoc.setMaximumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTuanTruoc.setMinimumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTuanTruoc.setLayout(new java.awt.BorderLayout());

        jPanel15.setBackground(new java.awt.Color(102, 204, 255));
        jPanel15.setMinimumSize(new java.awt.Dimension(100, 35));
        jPanel15.setPreferredSize(new java.awt.Dimension(440, 35));
        jPanel15.setLayout(new java.awt.GridLayout(1, 0));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Thống Kê Tuần Trước");
        jPanel15.add(jLabel10);

        pnDoanhThuTuanTruoc.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        jPanel16.setBackground(new java.awt.Color(102, 204, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel16.setPreferredSize(new java.awt.Dimension(440, 60));
        jPanel16.setLayout(new java.awt.GridLayout(1, 0));

        btnTuanTruoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTuanTruoc.setText("Thông Tin Chi Tiết");
        jPanel16.add(btnTuanTruoc);

        pnDoanhThuTuanTruoc.add(jPanel16, java.awt.BorderLayout.PAGE_END);

        jPanel17.setBackground(new java.awt.Color(102, 204, 255));
        jPanel17.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel17.setLayout(new java.awt.GridLayout(1, 0));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/438526.png"))); // NOI18N
        jLabel11.setToolTipText("");
        jPanel17.add(jLabel11);

        pnDoanhThuTuanTruoc.add(jPanel17, java.awt.BorderLayout.LINE_START);

        pnTuanTruoc.setBackground(new java.awt.Color(102, 204, 255));
        pnTuanTruoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        pnTuanTruoc.setLayout(new java.awt.GridLayout(3, 0));
        pnDoanhThuTuanTruoc.add(pnTuanTruoc, java.awt.BorderLayout.CENTER);

        jPanel2.add(pnDoanhThuTuanTruoc);

        pnDoanhThuTrongThang.setBackground(new java.awt.Color(153, 153, 255));
        pnDoanhThuTrongThang.setBorder(new javax.swing.border.MatteBorder(null));
        pnDoanhThuTrongThang.setMaximumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTrongThang.setMinimumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTrongThang.setLayout(new java.awt.BorderLayout());

        jPanel19.setBackground(new java.awt.Color(153, 153, 255));
        jPanel19.setMinimumSize(new java.awt.Dimension(100, 35));
        jPanel19.setPreferredSize(new java.awt.Dimension(440, 35));
        jPanel19.setLayout(new java.awt.GridLayout(1, 0));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Thống Kê Trong Tháng");
        jPanel19.add(jLabel13);

        pnDoanhThuTrongThang.add(jPanel19, java.awt.BorderLayout.PAGE_START);

        jPanel20.setBackground(new java.awt.Color(153, 153, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel20.setPreferredSize(new java.awt.Dimension(440, 60));
        jPanel20.setLayout(new java.awt.GridLayout(1, 0));

        btnThang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThang.setText("Thông Tin Chi Tiết");
        jPanel20.add(btnThang);

        pnDoanhThuTrongThang.add(jPanel20, java.awt.BorderLayout.PAGE_END);

        jPanel21.setBackground(new java.awt.Color(153, 153, 255));
        jPanel21.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel21.setLayout(new java.awt.GridLayout(1, 0));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/438526.png"))); // NOI18N
        jLabel14.setToolTipText("");
        jPanel21.add(jLabel14);

        pnDoanhThuTrongThang.add(jPanel21, java.awt.BorderLayout.LINE_START);

        pnThang.setBackground(new java.awt.Color(153, 153, 255));
        pnThang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        pnThang.setLayout(new java.awt.GridLayout(3, 0));
        pnDoanhThuTrongThang.add(pnThang, java.awt.BorderLayout.CENTER);

        jPanel2.add(pnDoanhThuTrongThang);

        pnDoanhThuThangTruoc.setBackground(new java.awt.Color(204, 204, 255));
        pnDoanhThuThangTruoc.setBorder(new javax.swing.border.MatteBorder(null));
        pnDoanhThuThangTruoc.setMaximumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuThangTruoc.setMinimumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuThangTruoc.setLayout(new java.awt.BorderLayout());

        jPanel23.setBackground(new java.awt.Color(204, 204, 255));
        jPanel23.setMinimumSize(new java.awt.Dimension(100, 35));
        jPanel23.setPreferredSize(new java.awt.Dimension(440, 35));
        jPanel23.setLayout(new java.awt.GridLayout(1, 0));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Thống Kê Tháng Trước");
        jPanel23.add(jLabel16);

        pnDoanhThuThangTruoc.add(jPanel23, java.awt.BorderLayout.PAGE_START);

        jPanel24.setBackground(new java.awt.Color(204, 204, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel24.setPreferredSize(new java.awt.Dimension(440, 60));
        jPanel24.setLayout(new java.awt.GridLayout(1, 0));

        btnThangTruoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThangTruoc.setText("Thông Tin Chi Tiết");
        jPanel24.add(btnThangTruoc);

        pnDoanhThuThangTruoc.add(jPanel24, java.awt.BorderLayout.PAGE_END);

        jPanel25.setBackground(new java.awt.Color(204, 204, 255));
        jPanel25.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel25.setLayout(new java.awt.GridLayout(1, 0));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/438526.png"))); // NOI18N
        jLabel17.setToolTipText("");
        jPanel25.add(jLabel17);

        pnDoanhThuThangTruoc.add(jPanel25, java.awt.BorderLayout.LINE_START);

        pnThangTruoc.setBackground(new java.awt.Color(204, 204, 255));
        pnThangTruoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        pnThangTruoc.setLayout(new java.awt.GridLayout(3, 0));
        pnDoanhThuThangTruoc.add(pnThangTruoc, java.awt.BorderLayout.CENTER);

        jPanel2.add(pnDoanhThuThangTruoc);

        pnDoanhThuTrongNam.setBackground(new java.awt.Color(255, 204, 204));
        pnDoanhThuTrongNam.setBorder(new javax.swing.border.MatteBorder(null));
        pnDoanhThuTrongNam.setMaximumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTrongNam.setMinimumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuTrongNam.setLayout(new java.awt.BorderLayout());

        jPanel27.setBackground(new java.awt.Color(255, 204, 204));
        jPanel27.setMinimumSize(new java.awt.Dimension(100, 35));
        jPanel27.setPreferredSize(new java.awt.Dimension(440, 35));
        jPanel27.setLayout(new java.awt.GridLayout(1, 0));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel27.add(jLabel19);

        pnDoanhThuTrongNam.add(jPanel27, java.awt.BorderLayout.PAGE_START);

        jPanel28.setBackground(new java.awt.Color(255, 204, 204));
        jPanel28.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel28.setPreferredSize(new java.awt.Dimension(440, 60));
        jPanel28.setLayout(new java.awt.GridLayout(1, 0));

        btnNam.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNam.setText("Thông Tin Chi Tiết");
        jPanel28.add(btnNam);

        pnDoanhThuTrongNam.add(jPanel28, java.awt.BorderLayout.PAGE_END);

        jPanel29.setBackground(new java.awt.Color(255, 204, 204));
        jPanel29.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel29.setLayout(new java.awt.GridLayout(1, 0));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/438526.png"))); // NOI18N
        jLabel20.setToolTipText("");
        jPanel29.add(jLabel20);

        pnDoanhThuTrongNam.add(jPanel29, java.awt.BorderLayout.LINE_START);

        jPanel30.setBackground(new java.awt.Color(255, 204, 204));
        jPanel30.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jPanel30.setLayout(new java.awt.GridLayout(3, 0));
        pnDoanhThuTrongNam.add(jPanel30, java.awt.BorderLayout.CENTER);

        jPanel2.add(pnDoanhThuTrongNam);

        pnDoanhThuNamTruoc.setBackground(new java.awt.Color(153, 255, 204));
        pnDoanhThuNamTruoc.setBorder(new javax.swing.border.MatteBorder(null));
        pnDoanhThuNamTruoc.setMaximumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuNamTruoc.setMinimumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuNamTruoc.setLayout(new java.awt.BorderLayout());

        jPanel31.setBackground(new java.awt.Color(153, 255, 204));
        jPanel31.setMinimumSize(new java.awt.Dimension(100, 35));
        jPanel31.setPreferredSize(new java.awt.Dimension(440, 35));
        jPanel31.setLayout(new java.awt.GridLayout(1, 0));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel31.add(jLabel22);

        pnDoanhThuNamTruoc.add(jPanel31, java.awt.BorderLayout.PAGE_START);

        jPanel32.setBackground(new java.awt.Color(153, 255, 204));
        jPanel32.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel32.setPreferredSize(new java.awt.Dimension(440, 60));
        jPanel32.setLayout(new java.awt.GridLayout(1, 0));

        btnNamTruoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNamTruoc.setText("Thông Tin Chi Tiết");
        jPanel32.add(btnNamTruoc);

        pnDoanhThuNamTruoc.add(jPanel32, java.awt.BorderLayout.PAGE_END);

        jPanel33.setBackground(new java.awt.Color(153, 255, 204));
        jPanel33.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel33.setLayout(new java.awt.GridLayout(1, 0));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/438526.png"))); // NOI18N
        jLabel23.setToolTipText("");
        jPanel33.add(jLabel23);

        pnDoanhThuNamTruoc.add(jPanel33, java.awt.BorderLayout.LINE_START);

        jPanel34.setBackground(new java.awt.Color(153, 255, 204));
        jPanel34.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jPanel34.setLayout(new java.awt.GridLayout(3, 0));
        pnDoanhThuNamTruoc.add(jPanel34, java.awt.BorderLayout.CENTER);

        jPanel2.add(pnDoanhThuNamTruoc);

        pnDoanhThuNamTruoc1.setBackground(new java.awt.Color(122, 66, 65));
        pnDoanhThuNamTruoc1.setBorder(new javax.swing.border.MatteBorder(null));
        pnDoanhThuNamTruoc1.setMaximumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuNamTruoc1.setMinimumSize(new java.awt.Dimension(420, 220));
        pnDoanhThuNamTruoc1.setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(100, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(430, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pnDoanhThuNamTruoc1.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel35.setPreferredSize(new java.awt.Dimension(100, 135));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );

        pnDoanhThuNamTruoc1.add(jPanel35, java.awt.BorderLayout.LINE_START);

        jPanel36.setPreferredSize(new java.awt.Dimension(100, 130));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );

        pnDoanhThuNamTruoc1.add(jPanel36, java.awt.BorderLayout.LINE_END);

        jPanel37.setPreferredSize(new java.awt.Dimension(430, 50));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pnDoanhThuNamTruoc1.add(jPanel37, java.awt.BorderLayout.PAGE_END);

        btnXemChiTiet.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXemChiTiet.setText("Xem Chi Tiết");
        btnXemChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietActionPerformed(evt);
            }
        });
        pnDoanhThuNamTruoc1.add(btnXemChiTiet, java.awt.BorderLayout.CENTER);

        jPanel2.add(pnDoanhThuNamTruoc1);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnXemChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietActionPerformed
        new jf_ThongKeChiTiet().setVisible(true);
    }//GEN-LAST:event_btnXemChiTietActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNam;
    private javax.swing.JButton btnNamTruoc;
    private javax.swing.JButton btnNgay;
    private javax.swing.JButton btnNgayTruoc;
    private javax.swing.JButton btnThang;
    private javax.swing.JButton btnThangTruoc;
    private javax.swing.JButton btnTuan;
    private javax.swing.JButton btnTuanTruoc;
    private javax.swing.JButton btnXemChiTiet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel pnDoanhThuNamTruoc;
    private javax.swing.JPanel pnDoanhThuNamTruoc1;
    private javax.swing.JPanel pnDoanhThuNgayTruoc;
    private javax.swing.JPanel pnDoanhThuThangTruoc;
    private javax.swing.JPanel pnDoanhThuTrongNam;
    private javax.swing.JPanel pnDoanhThuTrongNgay;
    private javax.swing.JPanel pnDoanhThuTrongThang;
    private javax.swing.JPanel pnDoanhThuTrongTuan;
    private javax.swing.JPanel pnDoanhThuTuanTruoc;
    private javax.swing.JPanel pnNgay;
    private javax.swing.JPanel pnNgayTruoc;
    private javax.swing.JPanel pnThang;
    private javax.swing.JPanel pnThangTruoc;
    private javax.swing.JPanel pnTuan;
    private javax.swing.JPanel pnTuanTruoc;
    // End of variables declaration//GEN-END:variables
}
