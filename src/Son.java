import java.time.Instant;

public class Son extends Thread {

    private BankAccount account;

    public Son(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println("Son is withdrawing " + account.getBalance() + " " + Instant.now());

        account.withdraw(1000.0);

        System.out.println("Son is done withdrawing " + Instant.now());
    }
}
