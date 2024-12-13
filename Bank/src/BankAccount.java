import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount {
    private static final AtomicInteger accountNumberGenerator = new AtomicInteger(1);
    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double balance) {
        this.accountNumber = accountNumberGenerator.getAndIncrement();
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public BankAccount(String accountHolderName) {
        this(accountHolderName,0);
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount>0 && amount<=balance) {
            balance-=amount;
            System.out.println("Withdrew: $" + amount + ". New balance: $" + balance);
        }else if(amount>balance){
            System.out.println("Insufficient balance.");
        }else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo(){
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Current balance: $" + balance);
    }

}
