import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Product {
    private String productID;
    private String description;
    private double price;
    public String getProductID() {
        return productID;
    }
    public Product(){
        this("00000","Mô tả",0);
    }
    public Product(String productID, String description, double price) {
        super();
        this.productID = productID;
        this.description = description;
        this.price = price;
    }
    public void setProductID(String productID) {
        this.productID = productID;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return String.format("%-7s%-10s%-5f",productID,description,price);
    }
}
