package ait.test;

import ait.comparator.OddEvenComparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class OddEvenComparatorTest{

    Integer[] arrNum;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{-6, 9, -8, 4, 7, 2, 5, 1, 0};
    }

    //Оновіть OddEvenComparator
    // за допомогою методу compare для сортування масиву цілих чисел у порядку:
    // парні цілі числа мають передувати непарним числам у порядку зростання.
    // Цілі непарні числа мають йти після парних у порядку спадання.
    // Напишіть тестовий приклад Junit для OddEvenComparator
//    @Test
//    void OddEvenComparator() {
//        OddEvenComparator.bubbleSort(arrNum, (c1,c2) -> {
//            if(c1 % 2 == 0 ){
//                return -1;
//            }
//            if(c1 % 2 != 0){
//                return 1;
//            }
//            return 0;
//        });
//        OddEvenComparator.printArray(arrNum);
//
//    }
    //        c1 идет перед c2 = -1
//        c1 идет после c2 =  1
//        c1 равно c2      =  0


}

