package controller;

import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.*;

public class LoadHoaDon {

    public void load(JTable listHoaDon, List<HoaDon> list) {
        Vector vTitle = addHeader();
        Vector vData = null;
        DefaultTableModel tableMode;
        tableMode = new DefaultTableModel(vTitle, 0);

        for (HoaDon hd : list) {
            vData = new Vector();
            vData.add(hd.getIdHoaDon());
            vData.add(new SimpleDateFormat("dd/MM/yyyy").format(hd.getNgayTao()));
            vData.add(hd.getIdNhanVien());
            vData.add(hd.getTenNhanVien());
            vData.add(hd.getIdKhachHang());
            vData.add(hd.getTenKhachHang());
            vData.add(new DecimalFormat("###,###,###").format(hd.getTongTien()) + " VNĐ");
            vData.add(hd.getLoaiHoaDon());
            vData.add(hd.getPtThanhToan());
            vData.add(hd.getThueVAT());
            tableMode.addRow(vData);
        }
        listHoaDon.removeAll();
        listHoaDon.setModel(tableMode);
    }

    public Vector addHeader() {
        Vector vTitle = null;
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT HoaDon.IDHoaDon, HoaDon.NgayTao,NhanVien.IDNhanVien , NhanVien.HoTen,KhachHang.IDKhachHang,\n"
                    + "KhachHang.HoTen,HoaDon.TongTien ,\n"
                    + "CASE \n"
                    + "	WHEN HoaDon.LoaiHoaDon = '0' THEN  N'Hóa Đơn Khách Hàng'\n"
                    + "	WHEN HoaDon.LoaiHoaDon = '1' THEN N'Hóa Đơn Nhập Hàng'\n"
                    + "	ELSE N'Hóa Đơn Xuất Hàng'\n"
                    + "END AS LoaiHoaDon,\n"
                    + "CASE \n"
                    + "	WHEN HoaDon.IDThongTin IS NULL THEN N'Tiền Mặt'\n"
                    + "	ELSE 'ATM'\n"
                    + "END AS 'PhuongThucThanhToan',HoaDon.ThueVAT\n"
                    + "FROM  HoaDon\n"
                    + "LEFT JOIN NhanVien ON HoaDon.IDNhanVien = NhanVien.IDNhanVien\n"
                    + "LEFT JOIN KhachHang ON KhachHang.IDKhachHang = HoaDon.IDKhachHang";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rms = rs.getMetaData();
            if (rs.next()) {
                vTitle = new Vector(rms.getColumnCount());
                for (int i = 1; i <= rms.getColumnCount(); i++) {
                    vTitle.add(rms.getColumnLabel(i));
                }
            }
            return vTitle;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vTitle;
    }

    public List<HoaDon> getAll() {
        List<HoaDon> list = new ArrayList<>();
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT HoaDon.IDHoaDon, HoaDon.NgayTao,NhanVien.IDNhanVien , NhanVien.HoTen,KhachHang.IDKhachHang,\n"
                    + "KhachHang.HoTen,HoaDon.TongTien ,\n"
                    + "CASE \n"
                    + "	WHEN HoaDon.LoaiHoaDon = '0' THEN  N'Hóa Đơn Khách Hàng'\n"
                    + "	WHEN HoaDon.LoaiHoaDon = '1' THEN N'Hóa Đơn Nhập Hàng'\n"
                    + "	ELSE N'Hóa Đơn Xuất Hàng'\n"
                    + "END AS LoaiHoaDon,\n"
                    + "CASE \n"
                    + "	WHEN HoaDon.IDThongTin IS NULL THEN N'Tiền Mặt'\n"
                    + "	ELSE 'ATM'\n"
                    + "END AS 'PhuongThucThanhToan',HoaDon.ThueVAT\n"
                    + "FROM  HoaDon\n"
                    + "LEFT JOIN NhanVien ON HoaDon.IDNhanVien = NhanVien.IDNhanVien\n"
                    + "LEFT JOIN KhachHang ON KhachHang.IDKhachHang = HoaDon.IDKhachHang";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon(rs.getString(1), rs.getDate(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getFloat(7), rs.getString(8), rs.getString(9), rs.getFloat(10));
                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
