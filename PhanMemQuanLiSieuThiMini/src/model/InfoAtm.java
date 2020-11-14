package model;

public class InfoAtm {
    private String idKhachHang;
    private String idPTThanhToan;
    private String loaiThe;
    private String soTaiKhoan;
    private String tenTaiKhoan;
    private String chiNhanh;
    private String tenNganHang;

    public InfoAtm(String idKhachHang, String idPTThanhToan, String loaiThe, String soTaiKhoan, String tenTaiKhoan, String chiNhanh, String tenNganHang) {
        this.idKhachHang = idKhachHang;
        this.idPTThanhToan = idPTThanhToan;
        this.loaiThe = loaiThe;
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.chiNhanh = chiNhanh;
        this.tenNganHang = tenNganHang;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getIdPTThanhToan() {
        return idPTThanhToan;
    }

    public void setIdPTThanhToan(String idPTThanhToan) {
        this.idPTThanhToan = idPTThanhToan;
    }

    public String getLoaiThe() {
        return loaiThe;
    }

    public void setLoaiThe(String loaiThe) {
        this.loaiThe = loaiThe;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getChiNhanh() {
        return chiNhanh;
    }

    public void setChiNhanh(String chiNhanh) {
        this.chiNhanh = chiNhanh;
    }

    public String getTenNganHang() {
        return tenNganHang;
    }

    public void setTenNganHang(String tenNganHang) {
        this.tenNganHang = tenNganHang;
    }
    
}
