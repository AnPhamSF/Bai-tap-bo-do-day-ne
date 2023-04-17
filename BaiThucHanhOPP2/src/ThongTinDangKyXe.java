public class ThongTinDangKyXe {
    private int dungTich;
    private double triGia;
    private String chuXe, loaiXe;

    public ThongTinDangKyXe(){

    }
    public ThongTinDangKyXe(int dungTich, double triGia, String chuXe, String loaiXe) {
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.chuXe = chuXe;
        this.loaiXe = loaiXe;
    }
        public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public double tinhThue(){
        double thue;
        if(dungTich<100) thue=triGia*0.01;
        else if (dungTich >= 100 && dungTich<=200) thue = triGia * 0.03;
        else thue = triGia * 0.05;
        return thue;
    }

    @Override
    public String toString() {
        return loaiXe + "-"+chuXe + "-"+dungTich + "-" + triGia;
    }

    void inThue(){
        System.out.printf("%5s %10s %10s %10s %20s \n", loaiXe, chuXe, dungTich, triGia, tinhThue() );
    }
}

