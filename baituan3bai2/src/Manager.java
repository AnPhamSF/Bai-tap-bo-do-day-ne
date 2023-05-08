import java.util.ArrayList;
import java.util.List;

class Manager{
    public Manager(){}
    public List<Product> products = new ArrayList<>();
    public void start(){
        int choice = 0;
        while (choice !=4){
            System.out.println("1. Them san pham thuc pham     ");
            System.out.println("2. Them san pham dien may      ");
            System.out.println("3. Them san pham bang su       ");
            System.out.println("4. Xem tat ca                  ");
            System.out.println("5. Thoat                       ");
            choice = Check.inputINT("Input choice","error");
            switch(choice){
                case 1:
                    products.add(Food.input(products.size() +1));
                    break;
                case 2:
                    products.add(Electronice.input(products.size() +1));
                    break;
                case 3:
                    products.add(Crockery.input(products.size() +1));
                    break;
                case 4:
                    for(Product product : products){
                        System.out.println(product);
                    }
                    Common.anyPressKey();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
            Common.clearScreen();
        }
    }
}