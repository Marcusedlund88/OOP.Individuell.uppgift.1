package OOP.Sprint1.ATM;

public class SavingsAccount extends Account{

    private double balance;
    private double interest;

    public SavingsAccount(String bankName, Customer[] customer, double balance){
        super(bankName, customer, balance );
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
}
