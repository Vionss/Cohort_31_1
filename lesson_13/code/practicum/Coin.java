package practicum;

import java.util.Random;

public class Coin {
    public static void main(String[] args) {

        //Задание 2. Написать методы, реализующие имитацию:
        //бросание монеты
        // На вход методов подается ко-во попыток, метод должен вернуть результаты попыток.
        //орел и решка n = (int)(Math.random() * (1 - 0 + 1) + 0)

       int [] game = new int [10];

       game = coins(10);


    }
    //---Methods---
    public static int [] coins(int n){
        int [] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = (int)(Math.random() * (1 - 0 + 1) + 0);
            System.out.print(c[i] + " | ");
        }
        return c;

    }

    //-------------
}
