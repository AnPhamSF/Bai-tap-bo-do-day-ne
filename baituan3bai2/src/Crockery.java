class Crockery extends Product{
    private String producer;
    private int inputDay;
    public Crockery(int id,String name,int quantity,double unitPrice,String producer,int inputDay){
        super(id,name,quantity,unitPrice);
        this.producer=producer;
        this.inputDay=inputDay;
    }
    @Override
    public double getPrice(){
        return(getUnitPrice() * getQuantity()) + ((getUnitPrice()*getQuantity())*getTax());
    }
    @Override
    public float getTax(){
        return 0.1f;
    }
    public String getProducer(){
        return producer;
    }
    public int getInputDay(){
        return inputDay;
    }
    public Crockery setProducer(String producer){
        this.producer = producer;
        return this;
    }
    public Crockery setInputDay(int inputDay){
        this.inputDay=inputDay;
        return this;
    }
    public static Crockery input(int id){
        String producer= "";
        int inputDay = 0;
        String name = Check.inputSTR("input product name","error",false);
        int quantity = Check.inputINT("input quantity","error");
        double unitPrice = Check.inputDOUBLE("input unitPrice","error");
        producer = Check.inputSTR("input producer","error",false);
        inputDay = Check.inputINT("input inputDay","error");
        return new Crockery(id,name,quantity,unitPrice,producer,inputDay);
    }
}