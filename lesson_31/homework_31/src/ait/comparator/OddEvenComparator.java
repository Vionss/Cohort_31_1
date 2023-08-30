package ait.comparator;

import java.util.Comparator;

public class OddEvenComparator {
    //Напишите OddEvenComparator,
    // реализующий Comparator с методом сравнения для сортировки массива целых чисел по порядку:
    // четные числа должны идти перед нечетными числами

    public static void printArray(Object[] arr ){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static <Integer> void bubbleSort (Integer[] arr, Comparator<Integer> comparator){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(comparator.compare(arr[j], arr[j + 1]) > 0){
                    Integer t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = t;
                }
            }
        }
    }
}
