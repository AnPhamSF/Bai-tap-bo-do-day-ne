class PhongMayTinh extends PhongHoc{
    private int soMay;
    private final static String label = "C";
    public PhongMayTinh(String roomId, int num, double area, int numberOfBulbs, int soMay){
        super(label+roomId,num,area,numberOfBulbs);
        this.soMay=soMay;
    }
    @Override
    public boolean DatChuan(){
        return(this.getArea()/this.soMay) >= 1.5f && super.DatChuan();
    }
    public void setSoMay(int soMay){
        this.soMay=soMay;
    }
    public int getSoMay(){
        return soMay;
    }
    public static PhongMayTinh input(String roomId){
        PhongHoc ph = PhongHoc.input(roomId);
        int soMay=Common.getInt("Nhap so luong may tinh: ");
        return new PhongMayTinh(roomId,ph.getNum(),ph.getArea(),ph.getNumberOfBulbs(),soMay);
    }
}