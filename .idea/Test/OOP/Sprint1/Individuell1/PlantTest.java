package OOP.Sprint1.Individuell1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlantTest {

    Plant p = new Palm("Kalle", 10,PlantSpecifics.PALM);

    @Test
    void getterTest() {
        assert (p.getName() == "Kalle");
        assert (p.getName() != "Jarl");
        assert (p.getHeight() == 10);
        assert (p.getHeight() != 5);
        assert (p.getNutrition() == 5);
        assert (p.getNutrition() != 50);

    }

    Plant p1 = new Carnivorous("Kalle", 10,PlantSpecifics.CARNIVOROUS);

    @Test
    void getterTest1() {
        assert (p1.getName() == "Kalle");
        assert (p1.getName() != "Jarl");
        assert (p1.getHeight() == 10);
        assert (p1.getHeight() != 5);
        assert (p1.getNutrition() == 2.1);
        assert (p1.getNutrition() != 0.7);

    }

    Plant p2 = new Cactus("Kalle", 10,PlantSpecifics.CACTUS);

    @Test
    void getterTest2() {
        assert (p2.getName() == "Kalle");
        assert (p2.getName() != "Jarl");
        assert (p2.getHeight() == 10);
        assert (p2.getHeight() != 5);
        assert (p2.getNutrition() == 0.02);
        assert (p2.getNutrition() != 50);
    }

}