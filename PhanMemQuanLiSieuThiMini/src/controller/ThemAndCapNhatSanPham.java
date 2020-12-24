package controller;

import java.sql.*;
import model.ConnectDAO;

public class ThemAndCapNhatSanPham {
    public boolean updateIDPhieu(String idPhieu,String idHoaDon) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query  = "UPDATE HoaDon SET IDPhieu = ? WHERE IDHoaDon = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idPhieu);
            ps.setString(2, idHoaDon);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean insertPhieu(String idPhieu,String idHoaDon,String ngayNhap,
            String ngayXuat,String idKVKho) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query  = "INSERT INTO PhieuKho(IDPhieu,IDHoaDon,NgayNhap,NgayXuat,IDKVKho)VALUES "
                    + "(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idPhieu);
            ps.setString(2, idHoaDon);
            ps.setString(3, ngayNhap);
            ps.setString(4, ngayXuat);
            ps.setString(5, idKVKho);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean capNhat(float tongTien,String idHoaDon) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "UPDATE HoaDon SET TongTien = ? WHERE IDHoaDon = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setFloat(1, tongTien);
            ps.setString(2, idHoaDon);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean them(String idSanPham,String idNhomSP,String tenSanPham,String idDonViTinh,String ngaySanXuat
                    ,String hanSuDung,String urlImage,String idBangGia,String idKhachHang,int tinhTrang) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "INSERT INTO [dbo].[SanPham]([IDSanPham],[IDNhomSanPham],[TenSanPham],[IDDonViTinh],[NgaySanXuat],[HanSuDung]\n" +
"		,[UrlImage],[IDBangGia],[IDKhachHang],[TinhTrang])VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idSanPham);
            ps.setString(2, idNhomSP);
            ps.setString(3, tenSanPham);
            ps.setString(4, idDonViTinh);
            ps.setString(5, ngaySanXuat);
            ps.setString(6, hanSuDung);
            ps.setString(7, urlImage);
            ps.setString(8, idBangGia);
            ps.setString(9, idKhachHang);
            ps.setInt(10, tinhTrang);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean insertKho(String sku,String idSanPham,String ngayNhap,String ngayXuat,int soLuongNhap,
            int soLuongXuat) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "INSERT INTO [dbo].[Kho]([SKU],[IDSanPham],[NgayNhap],[NgayXuat],[SoLuongNhap],[SoLuongXuat])VALUES "
                    + "(?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, sku);
            ps.setString(2, idSanPham);
            ps.setString(3, ngayNhap);
            ps.setString(4, ngayXuat);
            ps.setInt(5, soLuongNhap);
            ps.setInt(6, soLuongXuat);
            ps.executeQuery();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean insertBangGia(String idBangGia,float donGia,float giam , float giaVonSP) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "INSERT INTO BangGia(IDBangGia,DonGia,Giam,GiaVonSP)VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idBangGia);
            ps.setFloat(2, donGia);
            ps.setFloat(3, giam);
            ps.setFloat(4, giaVonSP);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean insertPhieuNhap(String idHoaDon,String ngayTao,String idNhaCungCap,String idNhanVien,
            float tongTien,int trangThai,String idThongTin,int loaiHoaDon,float ThueVAT,String noiDung) {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "INSERT INTO HoaDon(IDHoaDon,NgayTao,IDKhachHang,IDNhanVien,TongTien,"
                    + "TrangThai,IDThongTin,LoaiHoaDon,ThueVAT,NoiDung)VALUES\n" +
                    " (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idHoaDon);
            ps.setString(2, ngayTao);
            ps.setString(3, idNhaCungCap);
            ps.setString(4, idNhanVien);
            ps.setFloat(5, tongTien);
            ps.setInt(6, trangThai);
            ps.setString(7, idThongTin);
            ps.setInt(8, loaiHoaDon);
            ps.setFloat(9, ThueVAT);
            ps.setString(10, noiDung);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean insertDongHoaDon(String idDongHoaDon,String idHoaDon, String idSanPham, String idDonViTinh,
            int soLuong,float giam,float traLai,int tinhTrang) {
        try (Connection conn = new ConnectDAO().getConnection()) {
            
            String query = "INSERT INTO DongHoaDon(IDDongHoaDon,IDHoaDon,IDSanPham,IDDonViTinh,"
                    + "SoLuong,Giam,TraLai,TinhTrang)VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idDongHoaDon);
            ps.setString(2, idHoaDon);
            ps.setString(3, idSanPham);
            ps.setString(4, idDonViTinh);
            ps.setInt(5, soLuong);
            ps.setFloat(6, giam);
            ps.setFloat(7, traLai);
            ps.setInt(8, tinhTrang);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean insertPhieuXuat() {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean updateSanPham() {
        try (Connection conn = new ConnectDAO().getConnection()){
            String query = "";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
