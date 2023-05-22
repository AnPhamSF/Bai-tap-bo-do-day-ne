class PhongHoc{
    private String roomId;
    private int num;
    private double area;
    private int numberOfBulbs;

    public PhongHoc(String roomId,int num,double area,int numberOfBulbs){
        this.roomId=roomId;
        this.num=num;
        this.area=area;
        this.numberOfBulbs=numberOfBulbs;
    }
    public String getRoomId(){
        return roomId;
    }
    public void setRoomId(String roomId){
        this.roomId=roomId;
    }
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num=num;
    }
    public double getArea(){
        return area;
    }
    public void setArea(double area){
        this.area=area;
    }
    public int getNumberOfBulbs(){
        return numberOfBulbs;
    }
    public void setNumBerOfBulbs(int numberOfBulbs){
        this.numberOfBulbs=numberOfBulbs;
    }
    @Override
    public String toString(){
        return String.format("%20s %10s %15s %10s", roomId, num, area, numberOfBulbs);
    }
    public boolean DatChuan(){
        return(this.area / this.num) >= 10;
    }
    public static PhongHoc input(String roomId){
        int num = Common.getInt("Nhap so: ");
        double area = Common.getDouble("Nhap khu vuc: ");
        int numberOfBulbs = Common.getInt("Nhap so luong bong den: ");
        return new PhongHoc(roomId,num,area,numberOfBulbs);
    }
}