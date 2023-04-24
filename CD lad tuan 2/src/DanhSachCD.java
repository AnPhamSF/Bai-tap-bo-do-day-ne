import java.util.Scanner;
import java.util.ArrayList;
public class DanhSachCD {
    private int count;
    ArrayList<CD> accList;
    public DanhSachCD() {
        ArrayList<CD> accList = new ArrayList <CD>();
        count = 0;
    }
    public DanhSachCD (int count) {
        this.count= 0;
    }
    public void themDanhSachCD(CD a) {
        Scanner ds = new Scanner(System.in);
        System.out.println("\nNhap so luong can them: "); int n = ds.nextInt();
        for (int i=0; i<n; i++) {
            System.out.println("\nLan them thu "+ (i+1)+": ");
        }
    }
    public void suaDanhSachCD(String maCD)
    {

    }

    public void xoaDanhSachCD(String maCD)
    {

    }
}
