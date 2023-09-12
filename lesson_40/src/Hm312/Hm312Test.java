package Hm312;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Hm312Test {

    private Hm312 hm312;
    @BeforeEach
    public void setUp(){
        hm312 = new Hm312();
    }
    @Test
    public void removeDuplicatesOneElement(){
        List<String> actual = Arrays.asList("John");
        List<String> expected = Arrays.asList("John");

        assertEquals(expected, hm312.removeDuplicates(actual));
    }

    @Test
    public void removeDuplicatesNoDuplicates(){
        List<String> actual = Arrays.asList("John","Peter","Mary","Ann");
        List<String> expected = Arrays.asList("John", "Peter","Mary","Ann");

        assertEquals(expected, hm312.removeDuplicates(actual));
    }

    @Test
    public void removeDuplicates(){
        List<String> actual = Arrays.asList("John","Peter","Mary","Ann","John","Peter");
        List<String> expected = Arrays.asList("John", "Peter","Mary","Ann");

        assertEquals(expected, hm312.removeDuplicates(actual));
    }
}