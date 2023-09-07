import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    Task1 task1;
    @BeforeEach
    public void setUp(){
        task1 = new Task1();
    }

    @Test
    public void shortestOrLongestTest_oneElement(){
        assertEquals("a",task1.findShortestOrLongest(Arrays.asList("a")));
    }

}