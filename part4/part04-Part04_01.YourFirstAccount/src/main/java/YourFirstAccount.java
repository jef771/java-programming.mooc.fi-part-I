
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account jeffAccount = new Account("Jeff's account", 100.0);
        
        jeffAccount.deposit(20.0);
        
        System.out.println(jeffAccount);
    }
}
