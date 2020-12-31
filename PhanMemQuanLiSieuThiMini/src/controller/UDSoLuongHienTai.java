package controller;

import java.sql.*;
import model.*;

public class UDSoLuongHienTai {
    public int update(String idSanPham,int soLuong) {
        int count = 0;
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "UPDATE Kho SET SoLuongHienTai = SoLuongHienTai - ? "
                    + "WHERE SKU = (SELECT SKU FROM SanPham WHERE IDSanPham = ? )";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, soLuong);
            ps.setString(2, idSanPham);
            count = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
    public int getSLHienTai(String sku) {
        int count = 0;
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "SELECT SoLuongHienTai FROM Kho WHERE SKU = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, sku);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
}
