class PhongThiNghiem extends PhongHoc{
    private String thongTin;
    private int size;
    private boolean bonruaTay;
    private final static String label = "L";

    public PhongThiNghiem(String roomId, int num, double area, int numberOfBulbs, String thongTin,int size, boolean bonruaTay){
        super(label+roomId,num,area,numberOfBulbs);
        this.thongTin=thongTin;
        this.size=size;
        this.bonruaTay=bonruaTay;
    }
    @Override
    public boolean DatChuan(){
        return this.bonruaTay && super.DatChuan();
    }
    public void setThongTin(String thongTin){
        this.thongTin=thongTin;
    }
    public void setSize(int size){
        this.size=size;
    }
    public void setBonRuaTay(boolean bonruaTay){
        this.bonruaTay=bonruaTay;
    }
    public String getThongTin(){
        return thongTin;
    }
    public int getSize(){
        return size;
    }
    public boolean getBonRuaTay(){
        return bonruaTay;
    }
    public static PhongThiNghiem input(String roomId){
        PhongHoc ph = PhongHoc.input(roomId);
        String thongTin = Common.getString("Nhap thong tin dac biet: ");
        int size = Common.getInt("Nhap size: ");
        boolean bonruaTay = Common.getBoolean("Nhap bon rua tay: ");
        return new PhongThiNghiem(roomId,ph.getNum(),ph.getArea(),ph.getNumberOfBulbs(),thongTin,size,bonruaTay);
    }
}