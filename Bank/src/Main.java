//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe",400);
        BankAccount account2 = new BankAccount("Jane Doe");

        account1.deposit(400);
        account1.withdraw(300);
        account1.displayAccountInfo();

        account2.withdraw(200);
        account2.deposit(-400);
        account2.deposit(700);
        account2.displayAccountInfo();
    }
}