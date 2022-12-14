package OOP.Sprint1.Individuell1;
import javax.swing.*;

//Subclass Cactus. Inherits Plant and Calculations. Overrides getNutrition method inside its parent class
//and uses enum PlantSpecifics to perform correct calculations and provide correct information,
// given its specific class, regarding nutrition.

public class Cactus extends Plant{
    PlantSpecifics plantSpecifics;
    Cactus(String name, double height, PlantSpecifics pS){

        super(name, height);
        this.height = height;
        this.plantSpecifics = pS;
        this.name = name;
    }
    @Override
    public double getNutrition() {
        nutrition = PlantSpecifics.CACTUS.baseAmount;
        return nutrition;
    }

    @Override
    public void printMethod() {
        String output = PlantSpecifics.CACTUS.typeOfNutrition;
        JOptionPane.showMessageDialog(null, getName() +" is a " + getClass().getSimpleName()
                + " of height " +
                getHeight()+" meters. It needs "+ getNutrition() + " liters of "+ output);
    }
}