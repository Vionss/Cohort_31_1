package ait.comparator;

import java.util.Comparator;

public class OddEvenComparator implements Comparator<Integer>{
    //Напишите OddEvenComparator,
    // реализующий Comparator с методом сравнения для сортировки массива целых чисел по порядку:
    // четные числа должны идти перед нечетными числами

    public static void printArray(Object[] arr ){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 % 2 == 0 && o2 % 2 !=0){
            return -1;
        }
        if(o1 % 2 != 0 && o2 % 2 ==0){
            return 1;
        }
        if(o1 % 2 == 0 && o2 % 2 ==0){
            return o1 - o2;
        }
        if(o1 % 2 != 0 && o2 % 2 !=0){
            return o2 - o1;
        }

        return 0;
    }
}
