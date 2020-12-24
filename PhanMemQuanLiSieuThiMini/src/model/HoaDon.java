package model;

import java.sql.Date;

public class HoaDon {
    private String idHoaDon;
    private Date ngayTao;
    private String idNhanVien;
    private String tenNhanVien;
    private String idKhachHang;
    private String tenKhachHang;
    private float tongTien;
    private String loaiHoaDon;
    private String ptThanhToan;
    private float thueVAT;

    public HoaDon(String idHoaDon, Date ngayTao, String idNhanVien, String tenNhanVien, String idKhachHang, String tenKhachHang, 
            float tongTien, String loaiHoaDon, String ptThanhToan, float thueVAT) {
        this.idHoaDon = idHoaDon;
        this.ngayTao = ngayTao;
        this.idNhanVien = idNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.idKhachHang = idKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.tongTien = tongTien;
        this.loaiHoaDon = loaiHoaDon;
        this.ptThanhToan = ptThanhToan;
        this.thueVAT = thueVAT;
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public String getLoaiHoaDon() {
        return loaiHoaDon;
    }

    public void setLoaiHoaDon(String loaiHoaDon) {
        this.loaiHoaDon = loaiHoaDon;
    }

    public String getPtThanhToan() {
        return ptThanhToan;
    }

    public void setPtThanhToan(String ptThanhToan) {
        this.ptThanhToan = ptThanhToan;
    }

    public float getThueVAT() {
        return thueVAT;
    }

    public void setThueVAT(float thueVAT) {
        this.thueVAT = thueVAT;
    }
    
}
