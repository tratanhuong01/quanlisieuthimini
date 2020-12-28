package controller;

import java.sql.*;
import model.ConnectDAO;

public class UpdateDB {

    public int updateNhaCungCap(String idKhachHang, String idSanPham) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "UPDATE SanPham SET IDKhachHang = ? WHERE IDSanPham = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idKhachHang);
            ps.setString(2, idSanPham);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public boolean xuLiSKU(int soLuongXuat, String sku) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "UPDATE Kho SET SoLuongXuat = ? WHERE SKU = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, soLuongXuat);
            ps.setString(2, sku);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public int updateNgayNhap(String ngayNhap, String sku) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "UPDATE Kho SET NgayNhap = ? WHERE SKU = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, ngayNhap);
            ps.setString(2, sku);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int updateNgayXuat(String ngayNhap, String sku) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "UPDATE Kho SET NgayXuat = ? WHERE SKU = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, ngayNhap);
            ps.setString(2, sku);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
