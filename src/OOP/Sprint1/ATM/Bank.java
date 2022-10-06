package OOP.Sprint1.ATM;

import java.util.ArrayList;

public class Bank {

    String name;
    ArrayList<Customer> customer;
    public Bank(String name, ArrayList<Customer> customer){
        this.name = name;
        this.customer = customer;
    }
}
