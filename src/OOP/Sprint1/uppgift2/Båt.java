package OOP.uppgift2;

public class Båt extends Fordon implements Prinable{

    private int dödVikt;

    public Båt(int hastighet, int vikt, int dödVikt){
        super(hastighet, vikt);
        this.dödVikt = dödVikt;

    }

    public int getDödVikt() {
        return dödVikt;
    }

    public void setDödVikt(int dödVikt) {
        this.dödVikt = dödVikt;
    }


public void printMe() {
        System.out.println("Fordonets vikt: "+getVikt());
        System.out.println("Fordonets hastighet: "+getHastighet());
        System.out.println("Fordonets dödvikt: " + getDödVikt());
    }
}
