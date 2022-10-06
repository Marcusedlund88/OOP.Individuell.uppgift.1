package OOP.uppgift2;

public abstract class Fordon implements Prinable{

    private int hastighet;
    int vikt;

    public Fordon(int hastighet, int vikt){
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    private int deltaHastighet(int nyHastighet){
        nyHastighet = getHastighet();
        return nyHastighet;
    }

    public int getHastighet() {
        return hastighet;
    }

    public void setHastighet(int hastighet) {
        this.hastighet = hastighet;
    }

    public int getVikt(){
        return vikt;
    }
    public void setVikt(int vikt){
        this.vikt = vikt;
    }
    public void printMe(){};
}
