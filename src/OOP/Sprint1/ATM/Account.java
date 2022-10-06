package OOP.Sprint1.ATM;

import java.util.ArrayList;

public abstract class Account extends Bank{


    protected ArrayList<Customer> customer;
    protected int idNumber;
    double balance;
    public Account(String bankName, ArrayList<Customer> customer, double balance){
        super(bankName, customer);
        this.balance = balance;
    }
}
