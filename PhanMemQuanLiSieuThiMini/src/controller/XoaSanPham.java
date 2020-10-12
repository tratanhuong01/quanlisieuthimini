package controller;

import java.sql.*;
import modal.ConnectDAO;

public class XoaSanPham {
    public boolean xoa(String idDongHoaDon) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "DELETE FROM DongHoaDon WHERE IDDongHoaDon = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idDongHoaDon);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
