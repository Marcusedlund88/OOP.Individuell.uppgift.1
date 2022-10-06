package OOP.Sprint1.ATM;

enum AccountType {
    CURRENT(0.01,0),
    SAVINGS(0,0.03);

    final double currentInterest;
    final double savingsInterest;


    AccountType(double currentInterest, double savingsInterest){
        this.currentInterest = currentInterest;
        this.savingsInterest = savingsInterest;
    }
}
