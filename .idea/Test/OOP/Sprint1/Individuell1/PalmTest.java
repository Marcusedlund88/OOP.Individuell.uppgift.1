package OOP.Sprint1.Individuell1;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {

    Palm p = new Palm("Kalle", 10,PlantSpecifics.PALM);

    @Test
    void getterTest() {
        assert (p.getName() == "Kalle");
        assert (p.getName() != "Jarl");
        assert (p.getHeight() == 10);
        assert (p.getHeight() != 5);
        assert (p.getNutrition() == 5);
        assert (p.getNutrition() != 50);

    }
}