class Food extends Product{
    private Date expiryDate;
    private Date dateOfManufacture;
    private String supplier;
    public Food(int id,String name,int quantity,double unitPrice,Date expiryDate,Date dateOfManufacture,String supplier){
        super(id,name,quantity,unitPrice);
        this.expiryDate = expiryDate;
        this.dateOfManufacture=dateOfManufacture;
        this.supplier=supplier;
    }
    @Override
    public double getPrice(){
        return(getUnitPrice() * getQuantity()) + ((getUnitPrice() * getQuantity()) * getTax());
    }
    @Override
    public float getTax(){
        return 0.05f;
    }
    public Date getExpiryDate(){
        return expiryDate;
    }
    public Date getDateOfManufacture(){
        return dateOfManufacture;
    }
    public String getSupplier(){
        return supplier;
    }
    public Food setExpiryDate(Date expiryDate){
        this.expiryDate = expiryDate;
        return this;
    }
    public Food setDateOfManufacture(Date dateOfManufacture){
        this.dateOfManufacture = dateOfManufacture;
        return this;
    }
    public Food setSupplier(String supplier){
        this.supplier = supplier;
        return this;
    }
    public static Food input(int id){
        Date expiryDate = null , dateOfManufacture = null;
        String name = Check.inputSTR("input product name","error",true);
        int quantity = Check.inputINT("input quantity","error");
        double unitPrice = Check.inputDOUBLE("input unitPrice","error");
        do{
            dateOfManufacture = Check.inputDATE("input dateOfManufacture","error",true);
            expiryDate = Check.inputDATE("input expiryDate","error",false);
        }while(expiryDate.getTime()<dateOfManufacture.getTime());
        String supplier = Check.inputSTR("input supplier","error",false);
        return new Food(id,name,quantity,unitPrice,expiryDate,dateOfManufacture,supplier);
    }
}