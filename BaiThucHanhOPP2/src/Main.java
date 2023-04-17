import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static void nhapXe(ThongTinDangKyXe xe){
        System.out.print("Nhập loại xe: ");
        xe.setLoaiXe(sc.nextLine());sc.nextLine();
        System.out.print("Nhập tên chủ xe: ");
        xe.setChuXe(sc.nextLine());
        System.out.print("Nhập dung tích xe: ");
        xe.setDungTich(sc.nextInt());
        System.out.print("Nhập trị giá xe: ");
        xe.setTriGia(sc.nextDouble());;sc.nextLine();
    }
    public static void main(String[] args) {
        ThongTinDangKyXe v[]= null;
        int a,n=0;
        boolean flag = true;
        do {
            System.out.println("Bạn chọn làm gì ?");
            System.out.println("1.Tạo các đối tượng xe và nhập thông tin.");
            System.out.println("2.Xuất bảng kê khai tiền thuế của các xe.");
            a =sc.nextInt();
            switch (a){
                case 1:
                    System.out.print("Nhập số lượng xe bạn muốn khai báo thuế: ");
                    n=sc.nextInt();
                    v= new ThongTinDangKyXe[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Xe thứ " + (i+1));
                        v[i] = new ThongTinDangKyXe();
                        nhapXe(v[i]);
                    }
                    break;
                case 2:
                    System.out.printf( "%5s %10s %10s %10s %20s \n","Loại Xe","Chủ xe","Dung tích","Trị giá","Thuế phải nộp");
                    System.out.printf( "=================================================================================== \n");
                    for (int i = 0; i < n; i++) {
                        v[i].inThue();
                    }
                    break;
                    default:
                flag=false;
                break;
        }
    }while (flag);
    }
}