
import java.time.Instant;

public class Father extends Thread {

    private BankAccount account;

    public Father(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println("Father is depositing " + account.getBalance() + " " + Instant.now());

        account.deposit(1000.0);

        System.out.println("Father is done depositing " + Instant.now());
    }
}
