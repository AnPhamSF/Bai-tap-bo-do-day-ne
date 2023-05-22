class PhongLyThuyet extends PhongHoc{
    private final static String label = "T";
    private boolean projector;

    public PhongLyThuyet(String roomId, int num, double area, int numberOfBulbs,boolean projector){
        super(label+roomId,num,area,numberOfBulbs);
        this.projector=projector;
    }
    @Override
    public boolean DatChuan(){
        return this.projector && super.DatChuan();
    }
    public void setProjector(boolean projector){
        this.projector=projector;
    }
    public boolean getProjector(){
        return projector;
    }
    public static PhongLyThuyet input(String roomId){
        PhongHoc ph = PhongHoc.input(roomId);
        boolean projector = Common.getBoolean("Nhap may chieu: ");
        return new PhongLyThuyet(roomId, ph.getNum(), ph.getArea(),ph.getNumberOfBulbs(), projector);
    }
}