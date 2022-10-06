package OOP.Sprint1.Individuell1;

//Parent class plant. Contains what to be inherited by its subclasses, Cactus, Palm and Carnivorous.
//Also implements the abstract method inside the interface SpannableMethods.

public class Plant implements SpannableMethods {
    protected double height;
    protected double nutrition;
    protected String name;

    Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }


    public double getNutrition() {
        return nutrition;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
    public void printMethod() {
    }
}
