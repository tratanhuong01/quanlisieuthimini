package controller;

import java.sql.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ConnectDAO;

public class ThongKe {

    DecimalFormat format = new DecimalFormat("###,###,###");
    public String NGAY = "WHERE NgayTao >= CONCAT(FORMAT(GETDATE(),'yyyy-MM-dd'),' 00:00:00.000') \n"
            + "AND NgayTao <= GETDATE() AND HoaDon.LoaiHoaDon = 0";
    public String NGAY_TRUOC = "WHERE NgayTao < CONCAT(FORMAT(GETDATE(),'yyyy-MM-dd'),' 00:00:00.000') \n"
            + "AND NgayTao >= CONCAT(FORMAT(GETDATE() - 1,'yyyy-MM-dd'),' 00:00:00.000') AND HoaDon.LoaiHoaDon = 0";
    public String TUAN = "WHERE NgayTao >= CONCAT(FORMAT(GETDATE() - \n"
            + "(SELECT CASE \n"
            + "When (SELECT DATEPART(WEEKDAY, GETDATE()) - 2) < 0 THEN 6\n"
            + "	ELSE (SELECT DATEPART(WEEKDAY, GETDATE()) - 2) \n"
            + "END AS RS)\n"
            + ",'yyyy-MM-dd'),' 00:00:00.000')\n"
            + "AND NgayTao <= GETDATE() AND HoaDon.LoaiHoaDon = 0";
    public String TUAN_TRUOC = "WHERE NgayTao < CONCAT(FORMAT(GETDATE() - (SELECT DATEPART(WEEKDAY, GETDATE()) + \n"
            + "(SELECT CASE \n"
            + "When (SELECT DATEPART(WEEKDAY, GETDATE()) - 2) < 0 THEN 6\n"
            + "	ELSE (SELECT DATEPART(WEEKDAY, GETDATE()) - 2) \n"
            + "END AS RS)),'yyyy-MM-dd'),' 00:00:00.000') \n"
            + "AND NgayTao >= CONVERT(datetime,CONCAT(FORMAT(GETDATE() - (SELECT DATEPART(WEEKDAY, GETDATE()) + \n"
            + "(SELECT CASE \n"
            + "When (SELECT DATEPART(WEEKDAY, GETDATE()) - 2) < 0 THEN 6\n"
            + "	ELSE (SELECT DATEPART(WEEKDAY, GETDATE()) - 2) \n"
            + "END AS RS)),'yyyy-MM-dd'),' 00:00:00.000')) - 7\n"
            + "AND HoaDon.LoaiHoaDon = 0";
    public String THANG = "WHERE NgayTao >= CONCAT(FORMAT(GETDATE() - DAY(GETDATE() - 1),'yyyy-MM-dd'),' 00:00:00.000')\n"
            + "AND NgayTao <= GETDATE() AND HoaDon.LoaiHoaDon = 0";
    public String THANG_TRUOC = "WHERE NgayTao < CONCAT(FORMAT(GETDATE() - DAY(GETDATE() - 1),'yyyy-MM-dd'),' 00:00:00.000')\n"
            + "AND NgayTao >= CONVERT(Datetime,CONCAT(FORMAT(GETDATE() - DAY(GETDATE()) - DAY(EOMONTH(GETDATE() - DAY(GETDATE())))"
            + " + 1,'yyyy-MM-dd'),' 00:00:00')) AND HoaDon.LoaiHoaDon = 0";
    public String NAM = "";
    public String NAM_TRUOC = "";

    public int LocHoaDon(String query) {
        int count = 0;
        try {
            Connection conn = new ConnectDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
            return count;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public int LocSanPham(String query) {
        int count = 0;
        try {
            Connection conn = new ConnectDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
            return count;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public int LocTien(String query) {
        int count = 0;
        try {
            Connection conn = new ConnectDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
            return count;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public int switchTien(int i) {
        int count = 0;
        switch (i) {
            case 1:
                String q1 = "SELECT  SUM(TongTien) FROM HoaDon \n"
                        + NGAY;
                count = LocTien(q1);
                break;
            case 2:
                String q2 = "SELECT  SUM(TongTien) FROM HoaDon \n"
                        + NGAY_TRUOC;
                count = LocTien(q2);
                break;
            case 3:
                String q3 = "SELECT  SUM(TongTien) FROM HoaDon \n"
                        + TUAN;
                count = LocTien(q3);
                break;
            case 4:
                String q4 = "SELECT  SUM(TongTien) FROM HoaDon \n"
                        + TUAN_TRUOC;
                count = LocTien(q4);
                break;
            case 5:
                String q5 = "SELECT  SUM(TongTien) FROM HoaDon \n"
                        + THANG;
                count = LocTien(q5);
                break;
            case 6:
                String q6 = "SELECT  SUM(TongTien) FROM HoaDon \n"
                        + THANG_TRUOC;
                count = LocTien(q6);
                break;
        }
        return count;
    }

    public int switchSanPham(int i) {
        int count = 0;
        switch (i) {
            case 1:
                String q1 = "SELECT  SUM(SoLuong) FROM DongHoaDon \n"
                        + "INNER JOIN HoaDon ON HoaDon.IDHoaDon = DongHoaDon.IDHoaDon\n"
                        + NGAY;
                count = LocSanPham(q1);
                break;
            case 2:
                String q2 = "SELECT  SUM(SoLuong) FROM DongHoaDon \n"
                        + "INNER JOIN HoaDon ON HoaDon.IDHoaDon = DongHoaDon.IDHoaDon\n"
                        + NGAY_TRUOC;
                count = LocSanPham(q2);
                break;
            case 3:
                String q3 = "SELECT  SUM(SoLuong) FROM DongHoaDon \n"
                        + "INNER JOIN HoaDon ON HoaDon.IDHoaDon = DongHoaDon.IDHoaDon\n"
                        + TUAN;
                count = LocSanPham(q3);
                break;
            case 4:
                String q4 = "SELECT  SUM(SoLuong) FROM DongHoaDon \n"
                        + "INNER JOIN HoaDon ON HoaDon.IDHoaDon = DongHoaDon.IDHoaDon\n"
                        + TUAN_TRUOC;
                count = LocSanPham(q4);
                break;
            case 5:
                String q5 = "SELECT  SUM(SoLuong) FROM DongHoaDon \n"
                        + "INNER JOIN HoaDon ON HoaDon.IDHoaDon = DongHoaDon.IDHoaDon \n"
                        + THANG;
                count = LocSanPham(q5);
                break;
            case 6:
                String q6 = "SELECT  SUM(SoLuong) FROM DongHoaDon \n"
                        + "INNER JOIN HoaDon ON HoaDon.IDHoaDon = DongHoaDon.IDHoaDon \n"
                        + THANG_TRUOC;
                count = LocSanPham(q6);
                break;
        }
        return count;
    }

    public int switchHoaDon(int i) {
        int count = 0;
        switch (i) {
            case 1:
                String q1 = "SELECT  COUNT(*) FROM HoaDon " + NGAY;
                count = LocHoaDon(q1);
                break;
            case 2:
                String q2 = "SELECT COUNT(*) FROM HoaDon " + NGAY_TRUOC;
                count = LocHoaDon(q2);
                break;
            case 3:
                String q3 = "SELECT  COUNT(*) FROM HoaDon " + TUAN;
                count = LocHoaDon(q3);
                break;
            case 4:
                String q4 = "SELECT  COUNT(*) FROM HoaDon " + TUAN_TRUOC;
                count = LocHoaDon(q4);
                break;
            case 5:
                String q5 = "SELECT  COUNT(*) FROM HoaDon " + THANG;
                count = LocHoaDon(q5);
                break;
            case 6:
                String q6 = "SELECT  COUNT(*) FROM HoaDon " + THANG_TRUOC;
                count = LocHoaDon(q6);
                break;
        }
        return count;
    }

    public int[]  load(String subQuery, JPanel pn) {
        int[] arr = new int[4];
        int soHoaDon = 0;
        int tienLai = 0;
        int tongSanPham = 0;
        int top = 0;
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT HoaDon.IDHoaDon , SanPham.TenSanPham,DongHoaDon.SoLuong,\n"
                    + "BangGia.GiaVonSP * DongHoaDon.SoLuong AS 'Đơn Giá',\n"
                    + "BangGia.DonGia * DongHoaDon.SoLuong - ((BangGia.DonGia * DongHoaDon.SoLuong)*((100-BangGia.Giam)/100)) AS 'Giảm',\n"
                    + "BangGia.DonGia * DongHoaDon.SoLuong - (BangGia.GiaVonSP * DongHoaDon.SoLuong+ \n"
                    + "BangGia.DonGia * DongHoaDon.SoLuong - ((BangGia.DonGia * DongHoaDon.SoLuong)*((100-BangGia.Giam)/100))) AS ' Tiền Lãi',\n"
                    + "TongHD = (SELECT COUNT(IDDongHoaDon) FROM DongHoaDon WHERE DongHoaDon.IDHoaDon = HoaDon.IDHoaDon)\n"
                    + "FROM HoaDon \n"
                    + "INNER JOIN DongHoaDon ON HoaDon.IDHoaDon = DongHoaDon.IDHoaDon\n"
                    + "INNER JOIN SanPham ON DongHoaDon.IDSanPham = SanPham.IDSanPham\n"
                    + "INNER JOIN BangGia ON SanPham.IDBangGia = BangGia.IDBangGia\n"
                    + "INNER JOIN Kho ON Kho.IDSanPham = SanPham.IDSanPham " + subQuery + " AND HoaDon.LoaiHoaDon = 0 ORDER BY HoaDon.IDHoaDon DESC";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            lb(pn, "IDHoaDon").setBounds(0, 0, 200, 40);
            lb(pn, "Tên Sản Phẩm").setBounds(200, 0, 450, 40);
            lb(pn, "Số Lượng").setBounds(650, 0, 150, 40);
            lb(pn, "Đơn Giá").setBounds(800, 0, 200, 40);
            lb(pn, "Giảm").setBounds(1000, 0, 150, 40);
            lb(pn, "Tiền Lãi").setBounds(1150, 0, 200, 40);
            int i = 0;
            int height = 40;
            while (rs.next()) {
                i++;
                top += 40;
                if (i == rs.getInt(7) - 1) {
                    lb(pn, rs.getString(1)).setBounds(0, height, 200, 40 * rs.getInt(7));
                    height += 40*rs.getInt(7);
                    i = 0;
                }
                else if (rs.getInt(7) == 1) {
                    lb(pn, rs.getString(1)).setBounds(0, height, 200, 40 * rs.getInt(7));
                    height += 40*rs.getInt(7);
                    i = 0;
                }
                lb(pn, rs.getString(2)).setBounds(200, top, 450, 40);
                lb(pn, format.format(rs.getInt(3))).setBounds(650, top, 150, 40);
                lb(pn, format.format(rs.getInt(4)) + " VNĐ").setBounds(800, top, 200, 40);
                lb(pn, format.format(rs.getInt(5)) + " VNĐ").setBounds(1000, top, 150, 40);
                lb(pn, format.format(rs.getInt(6)) + " VNĐ").setBounds(1150, top, 200, 40);

                tienLai += rs.getInt(6);
                tongSanPham += rs.getInt(3);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT DISTINCT COUNT(*) \n"
                    + " FROM HoaDon " + subQuery;
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                soHoaDon = rs1.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        arr[0] = tongSanPham;
        arr[1] = soHoaDon;
        arr[2] = tienLai;
        arr[3] = top;
        return arr;
    }

    public JLabel lb(JPanel pn, String s) {
        JLabel lb = new JLabel();
        lb.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText(s);
        lb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn.add(lb);
        return lb;
    }

    public JLabel lb1(JPanel pn, String s) {
        JLabel lb = new JLabel();
        lb.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb.setText(s);
        lb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn.add(lb);
        return lb;
    }

    public JLabel lb2(JPanel pn, String s) {
        JLabel lb = new JLabel();
        lb.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lb.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb.setText(s);
        lb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn.add(lb);
        return lb;
    }
}
