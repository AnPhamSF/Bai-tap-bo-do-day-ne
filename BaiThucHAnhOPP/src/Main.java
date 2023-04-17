import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static void nhapThongTin(SinhVienNhap tt) {
        System.out.println("Nhập mã SV: ");
        tt.setMaSV(sc.nextInt());
        ;
        sc.nextLine();
        System.out.println("Nhập họ và tên SV: ");
        tt.setHoTen(sc.nextLine());
        System.out.println("Nhập địa chỉ SV: ");
        tt.setDiaChi(sc.nextLine());
        do {
            System.out.println("Nhập std gồm 9 số: ");
            tt.setSTD(sc.nextLine());
        } while (tt.getsTD().length() != 9);
    }

    public static void main(String[] args) {
        SinhVienNhap sv[] = null;
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.println("Nhập lựa chọn: ");
            System.out.println("1.Nhập thông tin sinh viên. ");
            System.out.println("2.Xuất bảng danh sách sinh viên.");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nhập số lương sinh viên cần khai báo: ");
                    n = sc.nextInt();
                    sv = new SinhVienNhap[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên thứ " + (i + 1)+": ");
                        sv[i] = new SinhVienNhap();
                        nhapThongTin(sv[i]);

                    }

                    break;
                case 2:
                    SinhVienNhap temp = sv[0];
                    for (int i = 0; i < sv.length - 1; i++) {
                        for (int j = i + 1; j < sv.length; j++) {
                            if (sv[i].getmaSV() > sv[j].getmaSV()) {
                                temp = sv[j];
                                sv[j] = sv[i];
                                sv[i] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        sv[i].hienThi();
                    }
                    break;
                default:
                    break;
            }
        } while (flag);
    }
}

