import java.util.ArrayList;
import java.util.List;

class QuanLyPhong{
    private List<PhongHoc> listPhong = new ArrayList<PhongHoc>();
    private PhongHoc findById(String roomId){
        for (PhongHoc ph : listPhong){
            if(ph.getRoomId().equals(roomId)){
                return ph;
            }
        }
        return null;
    }
    private List<PhongHoc> sortByNum(){
        List<PhongHoc> listPhongHoc = this.listPhong;
        listPhongHoc.sort ((o1,o2) -> o1.getNum()- o2.getNum());
        this.listPhong = listPhongHoc;
        return listPhongHoc;
    }
    private List<PhongHoc> sortByArea(){
        List<PhongHoc> listPhongHoc = this.listPhong;
        listPhongHoc.sort((o1,o2) -> (int) (o1.getArea()-o2.getArea()));
        this.listPhong = listPhongHoc;
        return listPhongHoc;
    }
    private List<PhongHoc> sortByBulbs(){
        List<PhongHoc> listPhongHoc = this.listPhong;
        listPhongHoc.sort((o1,o2) -> o1.getNumberOfBulbs() - o2.getNumberOfBulbs());
        this.listPhong = listPhongHoc;
        return listPhongHoc;
    }
    private void xuat(List<PhongHoc> listPhongHoc){
        System.out.println(String.format("%20s %10s %15s %10s","ma phong","so","khu vuc","so luong bong den"));
        for(PhongHoc ph : listPhong){
            System.out.println(ph);
        }
    }
    private void CheckdsDatChuan(){
        System.out.println("Danh sach phong dat chuan: ");
        System.out.println(String.format("%20s %10s %15s %10s","ma phong","so","khu vuc","so luong bong den"));
        for(PhongHoc ph : this.listPhong){
            if(ph.DatChuan()){
                System.out.println(ph);
            }
        }
    }
    private void updatePhongMay(String roomId, int soMay){
        PhongMayTinh ph = (PhongMayTinh)this.findById(roomId);
        if(roomId != null)
        {
            ph.setSoMay(soMay);
            for(int i = 0; i < listPhong.size(); i++)
            {
                if(listPhong.get(i).getRoomId().equals(roomId))
                {
                    listPhong.remove(i);
                    listPhong.add(i, ph);
                }
            }
        }
    }
    public void init(){
        this.listPhong.add(new PhongMayTinh("1",1,100,10,2));
        this.listPhong.add(new PhongMayTinh("2",2,200,20,4));
        this.listPhong.add(new PhongMayTinh("3",3,300,30,6));
        this.listPhong.add(new PhongMayTinh("4",4,400,40,8));
        this.listPhong.add(new PhongThiNghiem("5",1,100,10,"TECH",1,true));
        this.listPhong.add(new PhongThiNghiem("6",2,200,20,"TECH",2,true));
        this.listPhong.add(new PhongThiNghiem("7",3,300,30,"TECH",3,true));
        this.listPhong.add(new PhongThiNghiem("8",4,400,40,"TECH",4,true));
        this.listPhong.add(new PhongLyThuyet("9",1,100,10,true));
        this.listPhong.add(new PhongLyThuyet("10",2,200,20,true));
        this.listPhong.add(new PhongLyThuyet("11",3,300,30,true));
        this.listPhong.add(new PhongLyThuyet("12",4,400,40,true));
    }
    private void menu(){
        System.out.println("1.  Thêm phòng máy tính:             ");
        System.out.println("2.  Thêm phồng thí nghiệm:           ");
        System.out.println("3.  Thêm phòng lý thuyết:            ");
        System.out.println("4.  Sửa số lượng máy tính:           ");
        System.out.println("5.  Phân loại theo số lượng:        ");
        System.out.println("6.  Phân loại theo khu vực          ");
        System.out.println("7.  Phân loại theo số:               ");
        System.out.println("8.  Phân loại theo số lượng bóng đèn:");
        System.out.println("9.  Xuất thông tin tất cả phòng:"               );
        System.out.println("10. Xuất phòng đạt chuẩn:        ");
        System.out.println("11. exit                            ");
        int choice = Common.getInt("Lựa chọn: ");
        menu(choice);
    }
    private void menu(int choice){
        switch(choice){
            case 1:
                this.listPhong.add(PhongMayTinh.input((listPhong.size()+"")));
                break;
            case 2:
                this.listPhong.add(PhongThiNghiem.input((listPhong.size()+"")));
                break;
            case 3:
                this.listPhong.add(PhongLyThuyet.input((listPhong.size()+"")));
                break;
            case 4:
                String roomId = Common.getString("nhap ma phong: ");
                int soMay = Common.getInt("Nhap so luong may: ");
                this.updatePhongMay(roomId, soMay);
                break;
            case 5:
                this.xuat(this.sortByNum());
                break;
            case 6:
                this.xuat(this.sortByArea());
                break;
            case 7:
                this.xuat(this.sortByNum());
                break;
            case 8:
                this.xuat(this.sortByBulbs());
                break;
            case 9:
                this.xuat(this.listPhong);
                break;
            case 10:
                this.CheckdsDatChuan();
                break;
            case 11:
                System.exit(0);
                break;
        }
    }
    public void start(){
        this.init();
        while(true){
            this.menu();
        }
    }
}