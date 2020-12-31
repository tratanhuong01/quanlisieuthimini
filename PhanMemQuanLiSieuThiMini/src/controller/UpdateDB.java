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
            String query = "UPDATE Kho SET SoLuongXuat = ? , SoLuongHienTai = SoLuongNhap - ? , "
                    + "SoLuongTonKho = SoLuongNhap - ? WHERE SKU = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, soLuongXuat);
            ps.setInt(2, soLuongXuat);
            ps.setInt(3, soLuongXuat);
            ps.setString(4, sku);
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

    public int updateSanPham(String tenSanPhan, String idDonViTinh,String idSanPham,float donGia,int giam) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query1 = "UPDATE SanPham SET TenSanPham = ? , IDDonViTinh = ? \n"
                    + " WHERE  IDsanPham = ? ";
            String query2 = "UPDATE BangGia SET DonGia = ? , Giam = ? \n"
                    + " WHERE IDBangGia = (SELECT IDBangGia FROM  SanPham WHERE IDSanPham = ? ) ";
            PreparedStatement ps1 = conn.prepareStatement(query1);
            ps1.setString(1, tenSanPhan);
            ps1.setString(2, idDonViTinh);
            ps1.setString(3, idSanPham);
            
            PreparedStatement ps2 = conn.prepareStatement(query2);
            ps2.setFloat(1, donGia);
            ps2.setInt(2, giam);
            ps2.setString(3, idSanPham);
            
            return ps1.executeUpdate() + ps2.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

}
