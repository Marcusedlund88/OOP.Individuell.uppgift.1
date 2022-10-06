package OOP.Sprint1.Individuell1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousTest {
    Carnivorous c = new Carnivorous("Karl",2,PlantSpecifics.CARNIVOROUS);

    @Test
    void getNutrition() {
        assert (c.getNutrition() == 0.5);
        assert (c.getNutrition() != 0.7);
    }

    @Test
    void getHeight() {
        assert (c.getHeight() == 2);
        assert (c.getHeight() != 10);
    }

    @Test
    void getName() {
        assert (c.getName() == "Karl");
        assert (c.getName() != "Jarl");
    }


}