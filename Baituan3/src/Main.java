import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // create products
        Product p1 = new Product("sp4", "Product 1", 10000);
        Product p2 = new Product("sp1", "Product 2", 15000);
        Product p3 = new Product("sp3", "Product 3", 20000);
        Product p4 = new Product("sp1","Product 2", 15000);

        // create order
        Order order = new Order(1, LocalDate.now());

        // add line items to order
        order.addLineItem(p1, 10);
        order.addLineItem(p2, 5);
        order.addLineItem(p3, 1);
        order.addLineItem(p4, 1);

        // print order
        System.out.println("Mã HD: " + order.getOrderID());
        System.out.println("Ngày lập hóa đơn: " + order.getOrderDate());
        for (OrderDetail lineItem : order.getLineItems()) {
            System.out.println(lineItem.getProduct().getDescription() + ", " + lineItem.getQuatity() + " x " + lineItem.getProduct().getPrice() + " = " + lineItem.calcTotalPrice());
        }
        System.out.println("Tổng : " + order.calcTotalCharge() + " VND");
    }
}