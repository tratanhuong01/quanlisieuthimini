package controller;

import java.sql.*;
import model.ConnectDAO;

public class CheckHoaDon {

    public boolean check(String idHoaDon) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT * FROM HoaDon INNER JOIN DongHoaDon ON"
                    + " HoaDon.IDHoaDon = DongHoaDon.IDHoaDon WHERE DongHoaDon.IDHoaDon = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idHoaDon);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return false;
            }
            else {
                return true;
            }
        } catch (Exception e) {
        }
        return true;
    }
}
