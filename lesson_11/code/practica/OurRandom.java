package practica;

import java.util.Random;

public class OurRandom {
    public static void main(String[] args) {
        Random random = new Random();

        int[]  ints = new int [10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10,20);
            System.out.println(ints);
        }
    }
}
