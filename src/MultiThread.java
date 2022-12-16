
public class MultiThread {

    public static void main(String[] args) {

        // In the method, create a BankAccount object and named it account
        BankAccount account = new BankAccount(0.0);

        // Create a Father object and named it father. Pass the account object as the parameter
        Father father = new Father(account);

        // Create a Son object and named it son. Pass the account object as the parameter
        Son son = new Son(account);

        // Call the start method of the father object
        father.start();

        // Call the start method of the son object
        son.start();

        // Call the join method of the father object
        try {
            father.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Call the join method of the son object
        try {
            son.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print out the balance of the account object
        System.out.println(account.getBalance());


    }
}
