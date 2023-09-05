import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ArraysList {


    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<Integer> numbers2 = new ArrayList<>();

    @BeforeEach
    void setUp() {

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);


        numbers2.add(5);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(8);
    }

    @Test
    public static String method (ArrayList a, ArrayList b) {
        for (int j = 0; j < b.size(); j++) {
            if (a.contains(j)) {
                return "Yes";
            }
        }
        return "No";
    }
}
