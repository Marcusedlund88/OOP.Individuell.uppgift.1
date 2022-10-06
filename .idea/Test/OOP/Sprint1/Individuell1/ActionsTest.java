package OOP.Sprint1.Individuell1;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ActionsTest {
    Actions a = new Actions();

    @Test
    void getInitialArraylistTest() {
        ArrayList<Plant> p = new ArrayList<>();
        p = a.getInitialArraylist();

        assert (p.size() == 4);

        assert (p.get(0).name.equals("Laura"));
        assert (p.get(1).name.equals("Putte"));
        assert (p.get(2).name.equals("Meatloaf"));
        assert (p.get(3).name.equals("Igge"));

        assert (p.get(0).height ==5 );
        assert (p.get(1).height == 1);
        assert (p.get(2).height == 0.7);
        assert (p.get(3).height == 0.2);

    }
}