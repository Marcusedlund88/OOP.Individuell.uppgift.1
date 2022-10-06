package OOP.uppgift2;

public class Main {

    public static void printInterface(Prinable p){
        p.printMe();
    }
    public static void printAntalHjul(Hjulburen h){
        System.out.println("Antal hjul: "+h.getAntalHjul());
    }

    public static void main(String[] args){
        Bil bil = new Bil(30,2000,5,5);
        Tåg tåg = new Tåg(10, 10000, 5 );
        Båt båt = new Båt(5,1000,900);
        Cykel cykel = new Cykel(30,15,21,7);

        cykel.printMe();
        System.out.println();
        printInterface(bil);
        printAntalHjul(bil);

    }
}