package OOP.Sprint1.ATM;

import java.util.ArrayList;

public class CurrentAccount extends Account{

    private double balance;
    private double interest;

    public CurrentAccount(String bankName, ArrayList<Customer> customer, double balance){
        super(bankName, customer, balance );
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
}
