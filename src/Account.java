import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Account {
    private long soTK;
    private String tenTK;
    private double soTienTrongTK;
    private String trangThai;
    private final double RATE = 0.035;

    public Account() {
        soTK = 50;
        soTienTrongTK = 50;
    }

    Scanner sc = new Scanner(System.in);

    public Account(Long soTK, String tenTK, double soTienTrongTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTienTrongTK = soTienTrongTK;
    }

    public long getSoTK() {
        return this.soTK;
    }

    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return this.tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getSoTienTrongTK() {
        return this.soTienTrongTK;
    }

    public void setSoTienTrongTK(double soTienTrongTK) {
        this.soTienTrongTK = soTienTrongTK;
    }
    public String getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        Locale local = new Locale("Vietnamese", "Viet Nam");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        String str1 = formatter.format(soTienTrongTK);
        return soTK + "-" + tenTK + "-" + str1;
    }

    public double napTien() {
        double nap;
        System.out.print("Nhập số tiền bạn cần nạp: ");
        nap = sc.nextDouble();
        if (nap >= 0) {
            soTienTrongTK = nap + soTienTrongTK;
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String str1 = formatter.format(nap);
            System.out.println("bạn vừa nạp " + str1 + " vào tài khoản.");
        } else {
            System.out.println("Số tiền nạp vào không hợp lệ!");
        }
        return nap;
    }

    public double rutTien() {
        double rut;
        System.out.print("Nhập số tiền bạn cần rút: ");
        rut = sc.nextDouble();
        if (rut <= (soTienTrongTK)) {
            soTienTrongTK = soTienTrongTK - (rut);
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String str1 = formatter.format(rut);
            System.out.println("Bạn vừa rút " + str1 + "Đ từ tài khoản.");
        } else {
            System.out.println("Số tiền muốn rút không hợp lệ!");
            return rutTien();
        }
        return rut;
    }
    public double chuyenKhoang() {
        double tienChuyen;
        tienChuyen = sc.nextDouble();
        System.out.println("Nhập số tiền cần chuyển: ");
        tienChuyen = sc.nextDouble();
        if (tienChuyen <= soTienTrongTK) {
            soTienTrongTK = soTienTrongTK - tienChuyen;
            soTienTrongTK = soTienTrongTK + tienChuyen;
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String str1 = formatter.format(tienChuyen);
        } else {
            System.out.println("Số tiền nhập không hợp lệ!");
        }
        return tienChuyen;
    }
    public double daoHan() {
        double laiSuat = 0.035;
        soTienTrongTK = soTienTrongTK + soTienTrongTK * laiSuat;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String str1 = formatter.format(soTienTrongTK);
        System.out.println("Bạn vừa được " + str1 + " từ đáo hạn. ");
        return soTienTrongTK;
    }
    void inTK() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String str1 = formatter.format(soTienTrongTK);
        System.out.printf("%-10d %-20s %-20s \n", soTK, tenTK, str1);
    }
}


