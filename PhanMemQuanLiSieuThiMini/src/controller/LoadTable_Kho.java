package controller;

import javax.swing.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.ConnectDAO;

public class LoadTable_Kho {

    public void loadNhap(String text, JTable table) {
        table.removeAll();
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT HoaDon.IDHoaDon,HoaDon.NgayTao,KhachHang.IDKhachHang,KhachHang.HoTen,NhanVien.IDNhanVien,\n"
                    + " NhanVien.HoTen,\n"
                    + " CASE \n"
                    + "	WHEN HoaDon.TrangThai = 0 THEN N'Chưa Hoàn Thành'\n"
                    + "	WHEN HoaDon.TrangThai = 1 THEN N'Hoàn Thành'\n"
                    + "	ELSE N'Đang Xử Lí'\n"
                    + " END AS TinhTrang,\n"
                    + " CASE \n"
                    + "	WHEN IDThongTin IS NULL THEN N'Tiền Mặt'\n"
                    + "	ELSE N'ATM'\n"
                    + " END AS PTThanhToan,\n"
                    + " CASE \n"
                    + "	WHEN HoaDon.LoaiHoaDon = 0 THEN N'Hóa Đơn Bán Hàng'\n"
                    + "	WHEN HoaDon.LoaiHoaDon = 0 THEN N'Hóa Đơn Nhập Hàng'\n"
                    + "	ELSE N'Hóa Đơn Xuất Hàng'\n"
                    + " END AS LoaiHoaDon,\n"
                    + " ThueVAT,NoiDung,IDPhieu\n"
                    + "  FROM dbo.HoaDon \n"
                    + " INNER JOIN KhachHang ON HoaDon.IDKhachHang = KhachHang.IDKhachHang\n"
                    + " INNER JOIN NhanVien ON HoaDon.IDNhanVien = NhanVien.IDNhanVien\n"
                    + text;
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rms = rs.getMetaData();
            Vector vTitle = new Vector(rms.getColumnCount());
            for (int i = 1; i <= rms.getColumnCount(); i++) {
                vTitle.add(rms.getColumnLabel(i));
            }
            DefaultTableModel tableMode = new DefaultTableModel(vTitle, 0);
            while (rs.next()) {
                Vector vData = new Vector();
                vData.add(rs.getString(1));
                vData.add(rs.getString(2));
                vData.add(rs.getString(3));
                vData.add(rs.getString(4));
                vData.add(rs.getString(5));
                vData.add(rs.getString(6));
                vData.add(rs.getString(7));
                vData.add(rs.getString(8));
                vData.add(rs.getString(9));
                vData.add(rs.getString(10));
                vData.add(rs.getString(11));
                vData.add(rs.getString(12));
                tableMode.addRow(vData);
            }
            table.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadXuat(String text, JTable table) {
        table.removeAll();
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT HoaDon.IDHoaDon,HoaDon.NgayTao,NhanVien.IDNhanVien,\n"
                    + "NhanVien.HoTen,\n"
                    + "CASE \n"
                    + "WHEN HoaDon.TrangThai = 0 THEN N'Chưa Hoàn Thành'\n"
                    + "WHEN HoaDon.TrangThai = 1 THEN N'Hoàn Thành'\n"
                    + "ELSE N'Đang Xử Lí'\n"
                    + "END AS TinhTrang,\n"
                    + "CASE \n"
                    + "WHEN IDThongTin IS NULL THEN N'Tiền Mặt'\n"
                    + "ELSE N'ATM'\n"
                    + "END AS PTThanhToan,\n"
                    + "CASE \n"
                    + "WHEN HoaDon.LoaiHoaDon = 1 THEN N'Hóa Đơn Nhập Hàng'\n"
                    + "WHEN HoaDon.LoaiHoaDon = 2 THEN N'Hóa Đơn Xuất Hàng'\n"
                    + "ELSE N'Hóa Đơn Xuất Hàng'\n"
                    + "END AS LoaiHoaDon,\n"
                    + "ThueVAT,NoiDung,IDPhieu\n"
                    + "FROM dbo.HoaDon \n"
                    + "INNER JOIN NhanVien ON HoaDon.IDNhanVien = NhanVien.IDNhanVien\n "
                    + text;
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rms = rs.getMetaData();
            Vector vTitle = new Vector(rms.getColumnCount());
            for (int i = 1; i <= rms.getColumnCount(); i++) {
                vTitle.add(rms.getColumnLabel(i));
            }
            DefaultTableModel tableMode = new DefaultTableModel(vTitle, 0);
            while (rs.next()) {
                Vector vData = new Vector();
                vData.add(rs.getString(1));
                vData.add(rs.getString(2));
                vData.add(rs.getString(3));
                vData.add(rs.getString(4));
                vData.add(rs.getString(5));
                vData.add(rs.getString(6));
                vData.add(rs.getString(7));
                vData.add(rs.getString(8));
                vData.add(rs.getString(9));
                vData.add(rs.getString(10));
                tableMode.addRow(vData);
            }
            table.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void NhapHangTK(String text, JTable table) {
        table.removeAll();
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT DongHoaDon.IDDongHoaDon,DongHoaDon.IDSanPham,SanPham.TenSanPham,DongHoaDon.IDDonViTinh,\n"
                    + "DongHoaDon.SoLuong,NhomSanPham.TenNhom,PhieuKho.IDKVKho \n"
                    + "FROM DongHoaDon INNER JOIN SanPham ON DongHoaDon.IDSanPham = SanPham.IDSanPham\n"
                    + "INNER JOIN NhomSanPham ON NhomSanPham.IDNhomSanPham = SanPham.IDNhomSanPham "
                    + "INNER JOIN HoaDon ON HoaDon.IDHoaDon = DongHoaDon.IDHoaDon "
                    + "INNER JOIN PhieuKho ON PhieuKho.IDPhieu = HoaDon.IDPhieu "
                    + text;
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rms = rs.getMetaData();
            Vector vTitle = new Vector(rms.getColumnCount());
            for (int i = 1; i <= rms.getColumnCount(); i++) {
                vTitle.add(rms.getColumnLabel(i));
            }
            DefaultTableModel tableMode = new DefaultTableModel(vTitle, 0);
            while (rs.next()) {
                Vector vData = new Vector();
                vData.add(rs.getString(1));
                vData.add(rs.getString(2));
                vData.add(rs.getString(3));
                vData.add(rs.getString(4));
                vData.add(rs.getString(5));
                vData.add(rs.getString(6));
                vData.add(rs.getString(7));
                tableMode.addRow(vData);
            }
            table.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void XuatHangTK(String text, JTable table) {
        table.removeAll();
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT DongHoaDon.IDDongHoaDon,Kho.SKU,DongHoaDon.IDSanPham,SanPham.TenSanPham,DongHoaDon.IDDonViTinh,\n"
                    + "DongHoaDon.SoLuong,NhomSanPham.TenNhom,KhuVucKho.TenKho \n"
                    + "FROM DongHoaDon INNER JOIN SanPham ON DongHoaDon.IDSanPham = SanPham.IDSanPham\n"
                    + "INNER JOIN Kho ON SanPham.IDSanPham = Kho.IDSanPham\n"
                    + "INNER JOIN NhomSanPham ON NhomSanPham.IDNhomSanPham = SanPham.IDNhomSanPham \n"
                    + "INNER JOIN HoaDon ON HoaDon.IDHoaDon = DongHoaDon.IDHoaDon \n"
                    + "INNER JOIN PhieuKho ON PhieuKho.IDPhieu = HoaDon.IDPhieu\n"
                    + "INNER JOIN KhuVucKho ON PhieuKho.IDKVKho = KhuVucKho.IDKVKho"
                    + text;
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rms = rs.getMetaData();
            Vector vTitle = new Vector(rms.getColumnCount());
            for (int i = 1; i <= rms.getColumnCount(); i++) {
                vTitle.add(rms.getColumnLabel(i));
            }
            DefaultTableModel tableMode = new DefaultTableModel(vTitle, 0);
            while (rs.next()) {
                Vector vData = new Vector();
                vData.add(rs.getString(1));
                vData.add(rs.getString(2));
                vData.add(rs.getString(3));
                vData.add(rs.getString(4));
                vData.add(rs.getString(5));
                vData.add(rs.getString(6));
                vData.add(rs.getString(7));
                vData.add(rs.getString(8));
                tableMode.addRow(vData);
            }
            table.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
