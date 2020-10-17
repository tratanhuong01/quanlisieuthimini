package controller;

import java.sql.*;
import modal.ConnectDAO;

public class CapNhatTienHoaDon {
    public boolean CapNhat(float tongTien,String idHoaDon) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "UPDATE HoaDon SET TongTien = ? WHERE IDHoaDon = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setFloat(1, tongTien);
            ps.setString(2, idHoaDon);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
