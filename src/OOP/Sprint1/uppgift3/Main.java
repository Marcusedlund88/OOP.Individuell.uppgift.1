package OOP.Sprint1.uppgift3;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void printMe(Kurs kurs){

        System.out.println("Kurs: " + kurs.getName() + "\n" + "Lärare: "
                + kurs.lärare.getName() + "\n" +
                "Studerande: ");
        for (int i = 0; i < 4; i++) {

            Elev e = (Elev)kurs.elever.get(i+1);
            System.out.println(e.getName()+" "+e.getAge());
        }
    }

    public static void main(String[] args){

        Lärare l1 = new Lärare(65, "Stieg");
        Elev e1 = new Elev(34, "Marcus");
        Elev e2 = new Elev(34, "Mackan");
        Kurs k1 = new Kurs("OOP", l1);
        k1.getElev(e1);
        k1.getElev(e2);
        Lärare l2 = new Lärare(65, "Grieg");
        Kurs k2 = new Kurs("Java", l2);
        Elev e3 = new Elev(3, "Frances");
        Elev e4 = new Elev(31, "Sara");

        k2.getElev(e1);
        k2.getElev(e2);
        k2.getElev(e3);
        k2.getElev(e4);

        printMe(k2);

    }


}
