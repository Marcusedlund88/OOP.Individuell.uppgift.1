package OOP.uppgift2;

public class Bil extends Fordon implements Prinable, Hjulburen{

    private int antalVäxlar;
    private int nuvarandeVäxel;

    private int antalHjul = 4;

    public Bil(int hastighet, int vikt, int antaVäxlar, int nuvarandeVäxel){
        super(hastighet, vikt);
        this.antalVäxlar = antaVäxlar;
        this.nuvarandeVäxel = nuvarandeVäxel;
    }

public int växla(int nuvarandeVäxel, int antalVäxlar, int önskadVäxel){

    this.antalVäxlar = getAntalVäxlar();
    this.nuvarandeVäxel = getNuvarandeVäxel();
        if(antalVäxlar < 1 || antalVäxlar > 6  ){
            System.out.println("Förbjudet antal växlar");
        }
        else {
            if (nuvarandeVäxel == getNuvarandeVäxel()) {
                System.out.println("Du kan ej växla till samma växel");
                växla(nuvarandeVäxel, antalVäxlar, önskadVäxel);
            } else {
                setNuvarandeVäxel(önskadVäxel);
                nuvarandeVäxel = getNuvarandeVäxel();
            }
        }
        return nuvarandeVäxel;
}


    public void printMe() {
        System.out.println("Fordonets vikt: " +getVikt());
        System.out.println("Fordonets hastighet: "+getHastighet());
        System.out.println("Antal växlar: "+getAntalVäxlar());
        System.out.println("Nuvarande växel: "+getNuvarandeVäxel());

    }

    public int getAntalVäxlar() {
        return antalVäxlar;
    }

    public void setAntalVäxlar(int antalVäxlar) {
        this.antalVäxlar = antalVäxlar;
    }

    public int getNuvarandeVäxel() {
        return nuvarandeVäxel;
    }

    public void setNuvarandeVäxel(int nuvarandeVäxel) {
        this.nuvarandeVäxel = nuvarandeVäxel;
    }


    public int getAntalHjul(){
        return antalHjul;
    }
}
