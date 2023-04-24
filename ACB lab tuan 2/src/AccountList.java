import java.util.Scanner;
import java.util.ArrayList;
public class AccountList {
    private int count;
    ArrayList<Account> accList;
    public AccountList() {
        ArrayList<Account> accList = new ArrayList <Account>(10);
        count = 0;
    }
    public AccountList (int count) {
        this.count= 0;
    }
}
