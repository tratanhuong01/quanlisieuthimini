package controller;

import java.sql.*;
import model.ConnectDAO;

public class LocSanPham {
    public void sanPhamTonKho() {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "";
            PreparedStatement ps = conn.prepareStatement(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void sanPhamChuaNhap() {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "";
            PreparedStatement ps = conn.prepareStatement(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int capNhatSoLuongHienTai(int soLuong,String sku) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "UPDATE Kho SET SoLuongHienTai = ? WHERE SKU = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, soLuong);
            ps.setString(2, sku);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public int capNhatSoLuongTonKho(int soLuong,String sku) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "UPDATE Kho SET SoLuongTonKho = ? WHERE SKU = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, soLuong);
            ps.setString(2, sku);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
}
