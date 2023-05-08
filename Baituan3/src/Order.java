import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class Order {
 private int orderID;
 private Date orderDate;
 private OrderDetail lineitems;
 private Product product;
 public Order(int orderID, LocalDate orderDate) {
  super();
  this.orderID = orderID;
  //this.orderDate = orderDate;
 }
 public Date getOrderDate() {
  return orderDate;
 }
 public void setOrderDate(Date orderDate) {
  this.orderDate = orderDate;
 }
 public int getOrderID() {
  return orderID;
 }

 public void addLineItem(Product product,int soluong)
 {

 }

 public double calcTotalCharge(){
  return product.getPrice()*lineitems.getQuatity();
 }

 @Override
 public String toString(){
  return String.format("%-5d %-10s",orderID,orderDate);
 }
}