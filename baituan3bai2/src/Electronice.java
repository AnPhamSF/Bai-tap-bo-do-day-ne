class Electronice extends Product{
    private int warrantyPeriod;
    private int wattage;
    public Electronice(int id,String name,int quantity,double unitPrice,int warrantyPeriod,int wattage){
        super(id,name,quantity,unitPrice);
        this.warrantyPeriod = warrantyPeriod;
        this.wattage = wattage;
    }
    @Override
    public double getPrice(){
        return(getUnitPrice() * getQuantity()) + ((getUnitPrice()*getQuantity())*getTax());
    }
    @Override
    public float getTax(){
        return 0.1f;
    }
    public int getWarrantyPeriod(){
        return warrantyPeriod;
    }
    public int getWattage(){
        return wattage;
    }
    public Electronice setWarrantyPeriod(int warrantyPeriod){
        this.warrantyPeriod = warrantyPeriod;
        return this;
    }
    public Electronice setWattage(int wattage){
        this.wattage = wattage;
        return this;
    }
    public static Electronice input(int id){
        int warrantyPeriod = 0,wattage = 0;
        String name = Check.inputSTR("input product name","error",true);
        int quantity = Check.inputINT("input quantity","error");
        double unitPrice = Check.inputDOUBLE("input unitPrice","error");
        warrantyPeriod = Check.inputINT("input warrantyPeriod","error");
        wattage = Check.inputINT("input wattage","error");
        return new Electronice(id,name,quantity,unitPrice,warrantyPeriod,wattage);
    }
}