package baitaphinh;
 
public abstract class HinhHoc {
    public abstract double tinhDienTich();
}
package baitaphinh;
 
public class HinhChuNhat extends HinhHoc {
    private int chieuDai, chieuRong;
     
    public HinhChuNhat() {
        super();
    }
 
    public HinhChuNhat(int chieuDai, int chieuRong) {
        super();
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
 
    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
 
    @Override
    public String toString() {
        return "Hình chữ nhật có chiều dài = " + this.chieuDai + 
            ", chiều rộng = " + this.chieuRong + ", diện tích = " + tinhDienTich();
    }
} 
import java.text.DecimalFormat;
 
public class HinhTron extends HinhHoc {
    private int banKinh;
    DecimalFormat dcf = new DecimalFormat("#.##");
 
    public HinhTron() {
        super();
    }
 
    public HinhTron(int banKinh) {
        super();
        this.banKinh = banKinh;
    }
 
    @Override
    public double tinhDienTich() {
        return 3.14 * banKinh * banKinh;
    }
     
    @Override
    public String toString() {
        return "Hình tròn có bán kính = " + this.banKinh + 
            ", diện tích = " + dcf.format(tinhDienTich());
    }
 
}
import java.util.ArrayList;
 
public class DanhSachHinh {
    ArrayList<HinhHoc> arrHinhHoc;
 
    public DanhSachHinh() {
        super();
        arrHinhHoc = new ArrayList<>();
        arrHinhHoc.add(new HinhChuNhat(7, 3));
        arrHinhHoc.add(new HinhTron(3));
        arrHinhHoc.add(new HinhChuNhat(10, 1));
    }
     
    public void themHinh(HinhHoc hinhHoc) {
        arrHinhHoc.add(hinhHoc);
    }
     
    public void hienThiDanhSachHinh() {
        for (int i = 0; i < arrHinhHoc.size(); i++) {
            System.out.println(arrHinhHoc.get(i).toString());
        }
    }
     
    public int demSoHinhChuNhat() {
        int soHinhChuNhat = 0;
        for (HinhHoc hinhHoc : arrHinhHoc) {
            if (hinhHoc instanceof HinhChuNhat) {
                soHinhChuNhat++;
            }
        }
        return soHinhChuNhat;
    }
     
    public void hienThiHinhChuNhatCoDienTichLonNhat() {
        double temp = 0;
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        for (HinhHoc hinhHoc : arrHinhHoc) {
            if (hinhHoc instanceof HinhChuNhat) {
                if (temp < hinhHoc.tinhDienTich()) {
                    temp = hinhHoc.tinhDienTich();
                    hinhChuNhat = (HinhChuNhat) hinhHoc;
                }
            }
        }
        System.out.println("Hình chữ nhật có diện tích lớn nhất là " + hinhChuNhat.toString());
    }
}
import java.util.Random;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        int choose, chieuDai, chieuRong, banKinh;
        Scanner scanner = new Scanner(System.in);
        Random random;
        HinhHoc hinhHoc;
        DanhSachHinh danhSachHinh = new DanhSachHinh();
         
        System.out.println("1. Thêm hình chữ nhật");
        System.out.println("2. Thêm hình tròn");
        System.out.println("3. Hiển thị danh sách hình");
        System.out.println("4. Đếm số lượng hình chữ nhật");
        System.out.println("5. Hiển thị thông tin hình chữ nhật có diện tích lớn nhất");
        System.out.println("6. Thoát chương trình");
         
        do {
            System.out.print("Chọn chức năng (từ 1 đến 6): ");
            choose = scanner.nextInt();
             
            switch(choose) {
                case 1:
                    random = new Random();
                    do {
                        chieuDai = random.nextInt(5) + 1;   // chiều dài nằm trong khoảng [1...5]
                        chieuRong = random.nextInt(5) + 1;
                    } while (chieuDai <= chieuRong); 
                    hinhHoc = new HinhChuNhat(chieuDai, chieuRong);
                    danhSachHinh.themHinh(hinhHoc);
                    System.out.println("Thêm thành công hình chữ nhật có chiều dài = " + chieuDai + 
                        ", chiều rộng = " + chieuRong);
                    break;
                case 2:
                    random = new Random();
                    banKinh = random.nextInt(5) + 1;
                    hinhHoc = new HinhTron(banKinh);
                    danhSachHinh.themHinh(hinhHoc);
                    System.out.println("Thêm thành công hình tròn có bán kính = " + banKinh);
                    break;
                case 3:
                    System.out.println("Thông tin các hình có trong danh sách:");
                    danhSachHinh.hienThiDanhSachHinh();
                    break;
                case 4:
                    System.out.println("Số lượng hình chữ nhật = " + 
                        danhSachHinh.demSoHinhChuNhat());
                    break;
                case 5:
                    System.out.println("Thông tin hình chữ nhật có diện tích lớn nhất: ");
                    danhSachHinh.hienThiHinhChuNhatCoDienTichLonNhat();
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng chọn phải nằm trong khoảng từ 1 đến 6");
                    break;
            }
        } while (true);
    }
}