package task03;

public class Main {
    public static void main(String[] args) {
Account account = new Account(12,1000,5);
account.deposit(10000);
account.withdraw(100);
        System.out.println(account.getMonthlyInterest());
        System.out.println(account.getMonthlyInterestRate());
    }
}
