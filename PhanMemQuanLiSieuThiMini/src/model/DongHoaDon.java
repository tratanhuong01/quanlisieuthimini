package model;

public class DongHoaDon {
    private String idDongHoaDon;
    private String idHoaDon;
    private String idSanPham;
    private String tenSanPham;
    private String idDonViTinh;
    private float donGia;
    private int soLuong;
    private String hinhSanPham;
    private float giam;
    private String idNhanVien;
    private String tenNhanVien;
    private String idKhachHang;
    private String tenKhachHang;
    private String ngayTao;

    public DongHoaDon(String idDongHoaDon, String idHoaDon, String idSanPham, String tenSanPham, String idDonViTinh, float donGia, int soLuong, String hinhSanPham, float giam, String idNhanVien, String tenNhanVien, String idKhachHang, String tenKhachHang, String ngayTao) {
        this.idDongHoaDon = idDongHoaDon;
        this.idHoaDon = idHoaDon;
        this.idSanPham = idSanPham;
        this.tenSanPham = tenSanPham;
        this.idDonViTinh = idDonViTinh;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.hinhSanPham = hinhSanPham;
        this.giam = giam;
        this.idNhanVien = idNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.idKhachHang = idKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.ngayTao = ngayTao;
    }

    public String getIdDongHoaDon() {
        return idDongHoaDon;
    }

    public void setIdDongHoaDon(String idDongHoaDon) {
        this.idDongHoaDon = idDongHoaDon;
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getIdDonViTinh() {
        return idDonViTinh;
    }

    public void setIdDonViTinh(String idDonViTinh) {
        this.idDonViTinh = idDonViTinh;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getHinhSanPham() {
        return hinhSanPham;
    }

    public void setHinhSanPham(String hinhSanPham) {
        this.hinhSanPham = hinhSanPham;
    }

    public float getGiam() {
        return giam;
    }

    public void setGiam(float giam) {
        this.giam = giam;
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

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }
    
    
}
