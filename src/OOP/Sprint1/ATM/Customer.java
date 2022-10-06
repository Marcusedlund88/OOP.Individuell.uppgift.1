package OOP.Sprint1.ATM;

public class Customer extends Person{

    private String name;
    private int idNumber;
    Account bankAccount;

    public Customer(String name, int idNumber){
        super(name,idNumber);
        this.bankAccount = bankAccount;

    }
}
