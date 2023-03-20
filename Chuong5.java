class ChuyenXe {
    private String hoTentaixe;
    private int maSochuyen;
    private int doanhThu;
    private int soXe;


    public ChuyenXe(String hoTentaixe, int maSochuyen, int doanhThu, int soXe) {
        this.hoTentaixe = hoTentaixe;
        this.maSochuyen = maSochuyen;
        this.doanhThu = doanhThu;
        this.soXe = soXe;
    }

    public String getHotentaixe() {
        return hoTentaixe;
    }

    public void hoTentaixe(String hoTentaixe) {
        this.hoTentaixe = hoTentaixe;
    }

    public int getMaSochuyen() {
        return maSochuyen;
    }

    public void setMaSochuyen(int maSochuyen) {
        this.maSochuyen = maSochuyen;
    }
    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }
    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }
    public void display() {
        System.out.println("Họ tên tài xế: " + hoTentaixe);
        System.out.println("Mã số chuyến: " + maSochuyen);
        System.out.println("Doanh Thu: " + doanhThu);
        System.out.println("Số xe: " + soXe);
    }
}
class ChuyenXeNoiThanh extends ChuyenXe {
    private int soTuyen;
    private int soKm;

    public ChuyenXeNoiThanh(String hoTentaixe, int maSochuyen,int doanhThu,int soTuyen, int soKm, int soXe) {
        super(hoTentaixe, maSochuyen, doanhThu, soXe);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }
    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Số Tuyến: " + soTuyen);
        System.out.println("Số KM: " + soKm);
    }
}
class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgay;
    public ChuyenXeNgoaiThanh(String hoTentaixe, int maSochuyen,int doanhThu,String noiDen, int soNgay, int soXe) {
        super(hoTentaixe, maSochuyen, doanhThu, soXe);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }
    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Nơi đến: " + noiDen);
        System.out.println("Số ngày: " + soNgay);
    }
}
class Entry {
    public static void main(String[] args) {
        ChuyenXeNoiThanh t = new ChuyenXeNoiThanh("Pham Ho Binh An",235, 8000, 4, 200, 235 );
        t.display();
        ChuyenXeNgoaiThanh n = new ChuyenXeNgoaiThanh("Pham Ho Binh On",256, 9000, "HCM", 3, 256 );
        n.display();

    }
}