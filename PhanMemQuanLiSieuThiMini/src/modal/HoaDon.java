package modal;

public class HoaDon {
    private String idHoaDon;
    private String idSanPham;
    private String tenKH;
    private String tenNV;
    private String ngayTao;
    private String tenSP;
    private float donGia;
    private int soLuong;

    public HoaDon(String idHoaDon, String idSanPham, String tenKH, String tenNV, String ngayTao, String tenSP, float donGia, int soLuong) {
        this.idHoaDon = idHoaDon;
        this.idSanPham = idSanPham;
        this.tenKH = tenKH;
        this.tenNV = tenNV;
        this.ngayTao = ngayTao;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
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

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
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
    
}
