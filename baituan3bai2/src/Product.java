import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
abstract class Product {
    private String id;
    private String name;
    private int quantity;
    private double unitPrice;

    abstract float getTax();

    abstract double getPrice();

    public Product(int id, String name, int quantity, double unitPrice) {
        this.id = "sp" + id;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public Product setID(String id) {
        this.id=id;
        return this;
    }
    public Product setName(String name){
        this.name=name;
        return this;
    }
    public Product setQuantity(int quantity){
        this.quantity=quantity;
        return this;
    }
    public Product setUnitPrice(double unitPrice){
        this.unitPrice=unitPrice;
        return this;
    }
    @Override
    public String toString(){
        return String.format("%5s %20s %10s %50s", this.id, this.name, this.quantity, this.unitPrice);
    }
}
class thuchanh31{
    public static void main(String[] args){
        Manager manager = new Manager();
        manager.start();
    }
}