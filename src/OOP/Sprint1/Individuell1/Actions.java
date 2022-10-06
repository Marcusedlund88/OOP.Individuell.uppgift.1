package OOP.Sprint1.Individuell1;

import java.util.ArrayList;

public class Actions {

    //Polymorphism, using the fact that each subclass belongs to its parent class,  to create an arraylist of plants.
    //
    public ArrayList<Plant> getInitialArraylist() {
        ArrayList<Plant> aL = new ArrayList<>();
        Plant p1 = new Palm("Laura", 5, PlantSpecifics.PALM);
        Plant p2 = new Palm("Putte", 1, PlantSpecifics.PALM);
        Plant p3 = new Carnivorous("Meatloaf", 0.7, PlantSpecifics.CARNIVOROUS);
        Plant p4 = new Cactus("Igge", 0.2, PlantSpecifics.CACTUS);
        aL.add(p1);
        aL.add(p2);
        aL.add(p3);
        aL.add(p4);
        return aL;
    }

    //The program is made to be scalable. Bellow are methods that could easily be implemented to increase functionality.

    /*public ArrayList<Plant> createEmptyArraylist{}
    public ArrayList<Plant> addToArraylist(){}
    public ArrayList<Plant> addToArraylist(){}
    public ArrayList<Plant> getUpdatedArraylist(){}
    public ArrayList<Plant> removeFromArraylist(){}
    public ArrayList<Plant> readToFile(){}
    public ArrayList<Plant> readFromFile(){}*/

}
