package tasks;

public class Task1 {
    public static void main(String[] args) {

        // Написать метод, который получает массив чисел, и возвращает последнее число в массиве, которое меньше 0

        int [] array = {12,556,-11,3,-29,123, -9 };
        System.out.println(findMinZero(array));


    }
    //===Methods===
    public static int findMinZero(int [] numbers){

        int lastNumber = 0;
        /*for (int i = 0; i > numbers.length; i++) {
            if (numbers[i] < 0){
                lastNumber = numbers[i];
            }

        }
        */
        for (int i = numbers.length -1; i >= 0; i--) {
            if (numbers[i] < 0){
                return numbers[i];
            }

        }

        return lastNumber;

    }

    //=============
}
