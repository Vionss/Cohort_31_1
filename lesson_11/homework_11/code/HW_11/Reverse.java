package HW_11;

public class Reverse {
    public static void main(String[] args) {

        // Написать метод, принимающий массив целых чисел, и печатающий его в обратном порядке.
        // Сначала последний элемент, потом предпоследний, и т. д.

        int[] arr = {13,534,24,13,7856,84,29,84};
        revers(arr);


    }
    //---Methods---
    public static void revers(int[]arr){

        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i]+ " ");
        }

        }
    }
    //-------------

