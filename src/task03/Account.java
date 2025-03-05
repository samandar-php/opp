package task03;

public class Account {
    private int id;
    private double balance;
    private final double annualInterestRate;

    Account(int id, double balance,double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
        this.balance = balance;
        this.id = id;
    }


double getMonthlyInterestRate(){
        return annualInterestRate /12;
}
double getMonthlyInterest(){
        return balance * (annualInterestRate/12/100);
}

void withdraw(int amount){
        balance +=amount;
}


    void deposit(int amount){
        balance -=amount;
    }

}
