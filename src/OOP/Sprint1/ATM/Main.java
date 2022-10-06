package OOP.Sprint1.ATM;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<Customer> cL = new ArrayList<>();
        Customer c = new Customer("marcus", 880405);
        cL.add(c);

        Account a = new CurrentAccount("Hejbank", cL,100 );
        Person p = new Customer("Marcus",880405, a );
    }
}
