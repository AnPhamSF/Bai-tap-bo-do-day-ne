import java.util.Scanner;
class SinhVienNhap {
    private int maSV;
    private String hoTen;
    private String diaChi;
    private String sTD;

    public SinhVienNhap() {

    }
    public SinhVienNhap( int maSV, String hoTen, String diaChi, String sTD){
            this.maSV = maSV;
            this.diaChi = diaChi;
            this.hoTen = hoTen;
            this.sTD = sTD;
        }

    public String gethoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getdiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getsTD() {
        return sTD;
    }

    public void setSTD(String sTD) {
        this.sTD = sTD;
    }

    public int getmaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    @Override
    public String toString() {
        return maSV + " " + hoTen + " " + diaChi + " " + sTD;
    }
    public void hienThi() {
        System.out.printf("%-5d %-15s %-20s %-5s \n", maSV, hoTen, diaChi, sTD);
    }
}