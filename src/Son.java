
public class Son extends Thread {
    // Create a private BankAccount variable named account
    private BankAccount account;

    // Create a non-default constructor that takes a BankAccount parameter named account
    public Son(BankAccount account) {
        // In the constructor, initialize the account variable with the account parameter
        this.account = account;
    }

    // Override the run method
    @Override
    public void run() {
        // In the method, call the deposit method of the account variable with 1000.0 as the parameter
        account.deposit(1000.0);
    }
}
