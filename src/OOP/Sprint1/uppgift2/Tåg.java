package OOP.uppgift2;

public class Tåg extends Fordon implements Prinable{

    private int antalVagnar;

    public Tåg(int hastighet, int vikt, int antalVagnar){
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }

    public int kopplaVagnar(int antalVagnar,int antalVagnarEfterKoppling){
        int koppladeVagnar;
        this.antalVagnar = getAntalVagnar();
        if(antalVagnar>antalVagnarEfterKoppling){
            koppladeVagnar = antalVagnar - antalVagnarEfterKoppling;
            System.out.println("Du kopplade bort " + koppladeVagnar + " st vagnar");
        } else if (antalVagnar == antalVagnarEfterKoppling){
            System.out.println("Du kopplade 0 vagnar");
        }
        else{
            koppladeVagnar = antalVagnarEfterKoppling - antalVagnar;
            System.out.println("Du kopplade bort " + koppladeVagnar + " st vagnar");
        }

        setAntalVagnar(antalVagnarEfterKoppling);
        return getAntalVagnar();
    }

    public int getAntalVagnar() {
        return antalVagnar;
    }

    public void setAntalVagnar(int antalVagnar) {
        this.antalVagnar = antalVagnar;
    }


    public void printMe() {
        System.out.println("Fordonets vikt: "+getVikt());
        System.out.println("Fordonets hastighet: "+getHastighet());
        System.out.println("Antal vagnar: "+getAntalVagnar());

    }
}
