package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.ConnectDAO;
import model.HoaDon;

public class TimHoaDon {
    public List<HoaDon> loc(String text) {
        List<HoaDon> list = new ArrayList<>();
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT HoaDon.IDHoaDon, HoaDon.NgayTao,NhanVien.IDNhanVien , NhanVien.HoTen,KhachHang.IDKhachHang,\n"
                    + "KhachHang.HoTen,HoaDon.TongTien ,\n"
                    + "CASE \n"
                    + "	WHEN HoaDon.LoaiHoaDon = '1' THEN  N'Hóa Đơn Khách Hàng'\n"
                    + "	WHEN HoaDon.LoaiHoaDon = '2' THEN N'Hóa Đơn Nhập Hàng'\n"
                    + "	ELSE N'Hóa Đơn Xuất Hàng'\n"
                    + "END AS LoaiHoaDon,\n"
                    + "CASE \n"
                    + "	WHEN HoaDon.IDThongTin IS NULL THEN N'Tiền Mặt'\n"
                    + "	ELSE 'ATM'\n"
                    + "END AS 'PhuongThucThanhToan',HoaDon.ThueVAT\n"
                    + "FROM  HoaDon\n"
                    + "LEFT JOIN NhanVien ON HoaDon.IDNhanVien = NhanVien.IDNhanVien\n"
                    + "INNER JOIN KhachHang ON KhachHang.IDKhachHang = HoaDon.IDKhachHang " + text;
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
    public String switchs(String chon,String value) {
        String text = "";
        switch (chon) {
            case "Theo Mã Nhân Viên":
                text = "  WHERE NhanVien.IDNhanVien LIKE N'%" + value + "%' ";
                break;
            case "Theo Mã Hóa Đơn":
                text = " WHERE HoaDon.IDHoaDon LIKE N'%" + value + "%' ";
                break;
            case "Theo Ngày Tạo":
                text = " WHERE HoaDon.NgayTao LIKE N'%" + value + "%'  ";
                break;       
            case "Theo Tên Khách Hàng":
                text = " WHERE KhachHang.HoTen LIKE N'%" + value + "%' ";
                break;   
            case "Theo Tên Nhân Viên":
                text = " WHERE NhanVien.Hoten LIKE N'%" + value + "%' ";
                break;   
        }
        return text;
    }
}
