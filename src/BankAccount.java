
public class BankAccount {


    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount) {
        balance -= amount;
    }

    public String getBalance() {
        return String.format("$%.2f", balance);
    }
}
