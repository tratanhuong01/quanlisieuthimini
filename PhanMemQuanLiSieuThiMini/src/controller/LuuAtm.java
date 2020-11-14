package controller;

import java.sql.*;
import model.ConnectDAO;
import model.StringUtil;

public class LuuAtm {
    String idThongTin;

    public boolean updateIDTTThanhToan(String idThongTin,String idHoaDon) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "UPDATE HoaDon SET IDThongTin = ? WHERE IDHoaDon = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idThongTin);
            ps.setString(2, idHoaDon);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public String getIDByTen(String ten) {
        String string = "";
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "SELECT IDPTThanhToan FROM PhuongThucThanhToan WHERE"
                    + " TenPTThanhToan = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, ten);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                string = rs.getString(1);
            }
            return string;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return string;
    }
    public boolean luu(String idThongTin,String idPTThanhToan,String loaiThe,
                    String soTaiKhoan,String tenTaiKhoan,String chiNhanh,String tenNganHang) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "INSERT INTO ThongTinThanhToan(IDThongTin,IDPTThanhToan,LoaiThe,"
                    + "SoTaiKhoan,TenTaiKhoan,ChiNhanh,TenNganHang)VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idThongTin);
            ps.setString(2, idPTThanhToan);
            ps.setString(3, loaiThe);
            ps.setString(4, soTaiKhoan);
            ps.setString(5, tenTaiKhoan);
            ps.setString(6, chiNhanh);
            ps.setString(7, tenNganHang);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
