package OOP.Sprint1.uppgift3;

import java.util.ArrayList;

public class Kurs{

    private String name;
    Lärare lärare;
    ArrayList elever = new ArrayList();
    //Elev[] elever = new Elev[10];
    Elev elev;
    int counter = 0;


    Kurs(String name, Lärare lärare){
        this.name = name;
        this.lärare = lärare;
        elever.add(elever);


    }
    public ArrayList getElev(Elev elev){

       elever.add(elev);
        return elever;
    }

    public String getName() {
        return name;
    }
}