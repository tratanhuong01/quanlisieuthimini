
package model;

public class SPNhap {
    private String stt;
    private String idSanPham;
    private String donViTinh;
    private String giaNhap;
    private String soLuong;
    private String thanhTien;
    private String tenNhaCungCap;
    private String diaChi;
    private String hinhThucThanhToan;
    private String dienThoai;
    private String maSoThue;
    private String idPhieu;

    public SPNhap(String stt, String idSanPham, String donViTinh, String giaNhap, String soLuong, String thanhTien, String tenNhaCungCap, String diaChi, String hinhThucThanhToan, String dienThoai, String maSoThue, String idPhieu) {
        this.stt = stt;
        this.idSanPham = idSanPham;
        this.donViTinh = donViTinh;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.tenNhaCungCap = tenNhaCungCap;
        this.diaChi = diaChi;
        this.hinhThucThanhToan = hinhThucThanhToan;
        this.dienThoai = dienThoai;
        this.maSoThue = maSoThue;
        this.idPhieu = idPhieu;
    }

    public SPNhap() {

    }
    
    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(String giaNhap) {
        this.giaNhap = giaNhap;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(String thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(String hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public String getIdPhieu() {
        return idPhieu;
    }

    public void setIdPhieu(String idPhieu) {
        this.idPhieu = idPhieu;
    }
    
}
