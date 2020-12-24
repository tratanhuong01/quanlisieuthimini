package model;

public class SanPham {

    private String idSanPham;
    private String idNhomSanPham;
    private String tenSanPham;
    private String idDonViTinh;
    private String ngaySanXuat;
    private String hanSuDung;
    private String urlSanPham;
    private String tenNhom;
    private float donGia;
    private float giam;
    private float giaVonSP;
    private String idNhaCungCap;
    private String tenNhaCungCap;
    private int tinhTrang;
    private String SKU;
    private String ngayNhap;
    private String ngayXuat;

    public SanPham(String idSanPham, String idNhomSanPham, String tenSanPham, String idDonViTinh, String ngaySanXuat, String hanSuDung, String urlSanPham, String tenNhom, float donGia, float giam, float giaVonSP, String idNhaCungCap, String tenNhaCungCap, int tinhTrang, String SKU, String ngayNhap, String ngayXuat) {
        this.idSanPham = idSanPham;
        this.idNhomSanPham = idNhomSanPham;
        this.tenSanPham = tenSanPham;
        this.idDonViTinh = idDonViTinh;
        this.ngaySanXuat = ngaySanXuat;
        this.hanSuDung = hanSuDung;
        this.urlSanPham = urlSanPham;
        this.tenNhom = tenNhom;
        this.donGia = donGia;
        this.giam = giam;
        this.giaVonSP = giaVonSP;
        this.idNhaCungCap = idNhaCungCap;
        this.tenNhaCungCap = tenNhaCungCap;
        this.tinhTrang = tinhTrang;
        this.SKU = SKU;
        this.ngayNhap = ngayNhap;
        this.ngayXuat = ngayXuat;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getIdNhomSanPham() {
        return idNhomSanPham;
    }

    public void setIdNhomSanPham(String idNhomSanPham) {
        this.idNhomSanPham = idNhomSanPham;
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

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(String hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public String getUrlSanPham() {
        return urlSanPham;
    }

    public void setUrlSanPham(String urlSanPham) {
        this.urlSanPham = urlSanPham;
    }

    public String getTenNhom() {
        return tenNhom;
    }

    public void setTenNhom(String tenNhom) {
        this.tenNhom = tenNhom;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getGiam() {
        return giam;
    }

    public void setGiam(float giam) {
        this.giam = giam;
    }

    public float getGiaVonSP() {
        return giaVonSP;
    }

    public void setGiaVonSP(float giaVonSP) {
        this.giaVonSP = giaVonSP;
    }

    public String getIdNhaCungCap() {
        return idNhaCungCap;
    }

    public void setIdNhaCungCap(String idNhaCungCap) {
        this.idNhaCungCap = idNhaCungCap;
    }

    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(String ngayXuat) {
        this.ngayXuat = ngayXuat;
    }
    
}
