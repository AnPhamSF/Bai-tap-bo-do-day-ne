import java.util.Scanner;
public class KhachHang
{
    protected int MaKH, SoLuong;
    protected double DonGia, ThanhTien;
    protected String NgayHD, HoTenKH;
    Scanner in =new Scanner(System.in);
    protected KhachHang()
    {
        this.MaKH=0;
        this.DonGia=0;
        this.NgayHD="";
        this.HoTenKH="";
        this.SoLuong=0;
    }
    protected KhachHang(int ma, double dgia, String ngay, String hoten, int sl,
                        double ttien)
    {
        this.MaKH=ma;
        this.DonGia=dgia;
        this.NgayHD=ngay;
        this.HoTenKH=hoten;
        this.SoLuong=sl;
        this.ThanhTien=ttien;
    }
    protected int getMaKH() {
        return MaKH;
    }
    protected void setMaKH(int maKH) {
        MaKH = maKH;
    }
    protected double getDonGia() {
        return DonGia;
    }
    protected void setDonGia(double donGia) {
        DonGia = donGia;
    }
    protected String getNgayHD() {
        return NgayHD;
    }
    protected void setNgayHD(String ngayHD) {
        NgayHD = ngayHD;
    }
    protected String getHoTenKH() {
        return HoTenKH;
    }
    protected void setHoTenKH(String hoTenKH) {
        this.HoTenKH = hoTenKH;
    }
    protected int getSoLuong() {
        return SoLuong;
    }
    protected void setSoLuong(int sl) {
        this.SoLuong = sl;
    }
    protected double getThanhTien() {
        return ThanhTien;
    }
    protected void setThanhTien(double thanhTien) {
        ThanhTien = thanhTien;
    }
    protected void nhap()
    {
        System.out.println("Nhập mã khách hàng: ");
        MaKH = in.nextInt();
        System.out.println("Tên khách hàng: ");
        HoTenKH = in.next();
        System.out.println("Ngày lập hóa đơn: ");
        NgayHD = in.next();
        System.out.println("Số lượng (KW): ");
        SoLuong = in.nextInt();
        System.out.println("Đơn giá: ");
        DonGia = in.nextDouble();
    }
    public String toString() {
        return "Mã KH: " + MaKH + ", Tên KH: " + HoTenKH + ", Ngày lập HD: " + NgayHD + ", Đơn giá: " + DonGia + ", Số lượng: " +SoLuong;
    }
}