package HM_12;

public class Task2 {
    public static void main(String[] args) {

        // Task 2
        // Написать метод, проверяющий содержатся ли в массиве целых чисел 0 или -1. Если да, метод возвращает true,
        //если нет false.
        //static boolean checkOnesAndZeros( int[] ints)
        //В методе main() вывести получившийся результат на экран

        int[] mass = {2, 12, 31, 312, 453, 854, 0, 4};
        System.out.println(checkOnesAndZeros(mass));


    }

    //---Methods---
    public static boolean checkOnesAndZeros(int[] ints) {

        for (int i = 0; i < ints.length; i++){
            if (ints[i] == 0 || ints[i] == -1)
                return  true;
                }
        return false;


    }
    //-------------
}
