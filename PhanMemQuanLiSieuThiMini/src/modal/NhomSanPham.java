package modal;

public class NhomSanPham {
    private String idNhomSanPham;
    private String tenNhomSanPham;
    private int loaiNhomSanPham;
    private String idKhuVuc;

    public NhomSanPham(String idNhomSanPham, String tenNhomSanPham, int loaiNhomSanPham, String idKhuVuc) {
        this.idNhomSanPham = idNhomSanPham;
        this.tenNhomSanPham = tenNhomSanPham;
        this.loaiNhomSanPham = loaiNhomSanPham;
        this.idKhuVuc = idKhuVuc;
    }

    public String getIdNhomSanPham() {
        return idNhomSanPham;
    }

    public void setIdNhomSanPham(String idNhomSanPham) {
        this.idNhomSanPham = idNhomSanPham;
    }

    public String getTenNhomSanPham() {
        return tenNhomSanPham;
    }

    public void setTenNhomSanPham(String tenNhomSanPham) {
        this.tenNhomSanPham = tenNhomSanPham;
    }

    public int getLoaiNhomSanPham() {
        return loaiNhomSanPham;
    }

    public void setLoaiNhomSanPham(int loaiNhomSanPham) {
        this.loaiNhomSanPham = loaiNhomSanPham;
    }

    public String getIdKhuVuc() {
        return idKhuVuc;
    }

    public void setIdKhuVuc(String idKhuVuc) {
        this.idKhuVuc = idKhuVuc;
    }
    
}
