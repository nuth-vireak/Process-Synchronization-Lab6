
public class BankAccount {

    // Create a private double variable named balance
    private double balance;

    // Create a non-default constructor that takes a double parameter named initialBalance
    public BankAccount(double initialBalance) {
        // In the constructor, initialize the balance variable with the initialBalance parameter
        balance = initialBalance;
    }

    // Create a public synchronized void method named deposit that takes a double parameter named amount
    public synchronized void deposit(double amount) {
        // In the method, add the amount parameter to the balance variable
        balance += amount;
    }

    // getter method for balance
    public String getBalance() {
        return String.format("$%.2f", balance);
    }
}
