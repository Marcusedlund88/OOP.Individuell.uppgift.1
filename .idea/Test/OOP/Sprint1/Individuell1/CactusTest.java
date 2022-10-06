package OOP.Sprint1.Individuell1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CactusTest {
    Cactus c = new Cactus("Karl",2,PlantSpecifics.CACTUS);

    @Test
    void getNutrition() {
        assert (c.getNutrition() == 0.02);
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