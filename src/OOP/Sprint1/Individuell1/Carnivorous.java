package OOP.Sprint1.Individuell1;
import javax.swing.*;

//Subclass Carnivorous. Inherits Plant and Calculations. Overrides all methods inside its parent class
//and uses enum PlantSpecifics to perform correct calculations and provide correct information,
// given its specific class, regarding nutrition.

public class Carnivorous extends Plant{
    PlantSpecifics plantSpecifics;
    Carnivorous(String name, double height, PlantSpecifics pS){

        super(name, height);
        this.height = height;
        this.plantSpecifics = pS;
        this.name = name;
    }
    @Override
    public double getNutrition() {
        nutrition = PlantSpecifics.CARNIVOROUS.baseAmount + (PlantSpecifics.CARNIVOROUS.extraAmount *height);
        return nutrition;
    }
    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printMethod() {
        String output = PlantSpecifics.CARNIVOROUS.typeOfNutrition;
        JOptionPane.showMessageDialog(null, getName() +" is a " + getClass().getSimpleName()
                + " of height " +
                getHeight()+" meters. It needs "+ getNutrition() + " liters of "+ output);
    }
}