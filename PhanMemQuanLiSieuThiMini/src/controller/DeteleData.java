package controller;

import java.sql.*;
import model.ConnectDAO;

public class DeteleData {
    public int deleteKhachHang(int tinhTrang,String idKhachHang) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "UPDATE KhachHang SET TinhTrang = ? WHERE IDKhachHang = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, tinhTrang);
            ps.setString(2, idKhachHang);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  0;
    }
    public int deleteHoaDon(int tinhTrang,String idHoaDon) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "UPDATE HoaDon SET TinhTrang = ? WHERE IDHoaDon = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, tinhTrang);
            ps.setString(2, idHoaDon);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  0;
    }
}
