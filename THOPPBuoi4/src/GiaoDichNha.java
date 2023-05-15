public class GiaoDichNha extends GiaoDich{
    private String loaiNha,diaChi;
    private int chon;
    public GiaoDichNha(){
        super();
    }
    public GiaoDichNha(String loaiNha, String diaChi){
        super();
        this.loaiNha=loaiNha;
        this.diaChi=diaChi;
    }
    public String getLoaiNha(){
        return loaiNha;
    }
    public void setLoaiNha(String loaiNha){
        this.loaiNha=loaiNha;
    }
    public String getDiaChi(){
        return diaChi;
    }
    public void setDiaChi(String diaChi){
        this.diaChi=diaChi;
    }

    public void nhap(){
        super.nhap();

        System.out.print("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhập loại nhà (0,1): ");
        chon = scanner.nextInt();
        switch (chon){
            case 0:
                loaiNha="cao cấp";
                break;
            case 1:
                loaiNha="thường";
                break;
            default:
                System.out.println("Chọn số không hợp lệ !");
                break;
        }
    }
}