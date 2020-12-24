package model;

public class KhachHang {
    private String idKhachHang;
    private String idNhomKhachHang;
    private String hoTen;
    private String gioiTinh;
    private String soDienThoai;
    private String diaChi;
    private String tenNhomKhachHang;
    private String maSoThue;
    private float traDK;
    private float thuDK;
    private int soDiem;
    public KhachHang(String idKhachHang, String idNhomKhachHang, String hoTen, String gioiTinh, String soDienThoai, String diaChi,
            String tenNhomKhachHang, String maSoThue, float traDK, float thuDK, int soDiem) {
        this.idKhachHang = idKhachHang;
        this.idNhomKhachHang = idNhomKhachHang;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.tenNhomKhachHang = tenNhomKhachHang;
        this.maSoThue = maSoThue;
        this.traDK = traDK;
        this.thuDK = thuDK;
        this.soDiem = soDiem;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getIdNhomKhachHang() {
        return idNhomKhachHang;
    }

    public void setIdNhomKhachHang(String idNhomKhachHang) {
        this.idNhomKhachHang = idNhomKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTenNhomKhachHang() {
        return tenNhomKhachHang;
    }

    public void setTenNhomKhachHang(String tenNhomKhachHang) {
        this.tenNhomKhachHang = tenNhomKhachHang;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public float getTraDK() {
        return traDK;
    }

    public void setTraDK(float traDK) {
        this.traDK = traDK;
    }

    public float getThuDK() {
        return thuDK;
    }

    public void setThuDK(float thuDK) {
        this.thuDK = thuDK;
    }

    public int getSoDiem() {
        return soDiem;
    }

    public void setSoDiem(int soDiem) {
        this.soDiem = soDiem;
    }
    
}
