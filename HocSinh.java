class HocSinh {
    private String name;
    private int diemToan;
    private int diemLy;
    private int diemHoa;
    private String lop;

    public  HocSinh(String name, int diemToan, String lop, int diemLy, int diemHoa) {
        this.name = name;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.lop = lop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(int diemToan) {
        this.diemToan = diemToan;
    }
    public int getdiemToan() {
        return diemToan;
    }

    public void setDiemLy(int diemLy) {
        this.diemLy = diemLy;
    }public int getDiemLy() {
        return diemLy;
    }

    public void setDiemHoa(int diemHoa) {
        this.diemHoa = diemHoa;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Diem Toan: " + diemToan);
        System.out.println("Diem Ly: " + diemLy);
        System.out.println("Diem Hoa: " + diemHoa);
        System.out.println("Lop: " + lop);
    }
}
class HocSinhChuyenToan extends HocSinh {
    private int diemtb;

    public HocSinhChuyenToan(String name, int diemToan,int diemLy,int diemHoa, String lop, int diemtb) {
        super(name, diemToan, lop, diemLy, diemHoa);
        this.diemtb = diemtb;
    }

    public int getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(int diemtb) {
        this.diemtb = diemtb;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Diem TB: " + diemtb);
    }
}
class Entry {
    public static void main(String[] args) {
        HocSinhChuyenToan t = new HocSinhChuyenToan("An", 9, 8, 7, "CNTT4","8");
        t.display();
    }
}