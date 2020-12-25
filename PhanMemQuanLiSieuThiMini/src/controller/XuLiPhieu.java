package controller;

import java.sql.*;
import model.ConnectDAO;

public class XuLiPhieu {
    public boolean updateTinhTrangHD(int trangThai,String idHoaDon) {
        int kq = 0;
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "UPDATE HoaDon SET TrangThai = ? WHERE IDHoaDon = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, trangThai);
            ps.setString(2, idHoaDon);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean updateSKUSanPham(String sku , String idSanPham) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "UPDATE SanPham SET SKU = ? WHERE IDSanPham = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, sku);
            ps.setString(2, idSanPham);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean xuLiPhieuNhap(int tinhTrang,String idDongHoaDon) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "UPDATE DongHoaDon SET TinhTrang = ? WHERE IDDongHoaDon = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, tinhTrang);
            ps.setString(2, idDongHoaDon);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean insertKho(String sku,String idSanPham,String ngayNhap,String ngayXuat,int soLuongNhap,
                   int soLuongXuat,int tinhTrang,String idKVKho) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "INSERT INTO Kho(SKU,IDSanPham,NgayNhap,NgayXuat,SoLuongNhap,SoLuongXuat,TinhTrang,IDKVKho)VALUES "
                    + "(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, sku);
            ps.setString(2, idSanPham);
            ps.setString(3, ngayNhap);
            ps.setString(4, ngayXuat);
            ps.setInt(5, soLuongNhap);
            ps.setInt(6, soLuongXuat);
            ps.setInt(7, tinhTrang);
            ps.setString(8, idKVKho);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
