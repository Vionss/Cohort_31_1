package HW_11;

import java.util.Random;

public class SumofArray {
    public static void main(String[] args) {
        Random random = new Random();

        //Реализуйте метод sumOfArray (сумма элементов массива),
        // который получает на вход массив и определяет сумму его элементов.

        int[] ints = {123,2,31,64,7435,12,5};

        /*int[]  ints = new int [10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10,20);

        }
           */
        sumOfArray(ints);



    }
    //---Methods---
    public static void sumOfArray(int[]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

        } System.out.println(sum);
    }
    //-------------
}
