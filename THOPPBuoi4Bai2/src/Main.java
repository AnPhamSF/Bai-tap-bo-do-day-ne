import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        KhachHangList lkh = new KhachHangList();
        Scanner in = new Scanner(System.in);
        int x;
        do
        {
            System.out.println("\n\t\t  -----Nhập lựa chọn của bạn-----");
            System.out.println("\t\t|0. Thoát ứng dụng\t\t\t\t |");
            System.out.println("\t\t|1. Thêm khách hàng Việt\t\t |");
            System.out.println("\t\t|2. Thêm khách hàng nước ngoài\t |");
            System.out.println("\t\t|3. Hiển thị danh sách khách hàng|");
            System.out.println("\t\t|4. Xem tổng(KW) của các KH\t\t |");
            System.out.println("\t\t|5. Xem TB thành tiền của KH NN  |");
            System.out.println("\t\t----------------------------------");
            x=in.nextInt();
            System.out.println("==>>");
            switch(x)
            {
                case 1:
                    lkh.ThemKH(1);
                    break;
                case 2:
                    lkh.ThemKH(2);
                    break;
                case 3:
                    lkh.HienThiKH();
                    break;
                case 4:
                    lkh.TongSL();
                    break;
                case 5:
                    lkh.TrungBinh();
                    break;
            }
        }while(x!=0);
        System.out.println("");
    }
}