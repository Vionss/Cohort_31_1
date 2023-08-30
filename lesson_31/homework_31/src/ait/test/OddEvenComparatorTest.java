package ait.test;

import ait.comparator.OddEvenComparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class OddEvenComparatorTest {

    Integer[] arrNum;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9, 7, 4, 7, 2, 5, 1, 0};
    }
    @Test
    void OddEvenComparator() {
        OddEvenComparator.bubbleSort(arrNum, (c1,c2) -> {
            if(c1 < 0){
                return -1;
            }
            if(c1 % 2 != 0){
                return 1;
            }
            return 0;
        });
        OddEvenComparator.printArray(arrNum);

    }
}
