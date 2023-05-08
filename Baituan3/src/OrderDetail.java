import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class OrderDetail {
    private int quatity;
    private Product product;

    public int getQuatity() {
        return quatity;
    }

    public OrderDetail(int quatity, Product product) {
        super();
        this.quatity = quatity;
        this.product = product;
    }

    public void setQuatity(int quantity) {
        this.quatity = quatity;
    }

    public OrderDetail(int quantity) {
        super();
        this.quatity = quatity;
    }
    public void addLineItem(Product product,int quatity)
    {
        LineItems.add(new OrderDetail(product, quatity));
    }
    @Override
    public String toString() {
        return String.format("%3d %5f", quatity,calcTotalPrice());
    }
    public double calcTotalPrice(){
        return quatity*product.getPrice();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}