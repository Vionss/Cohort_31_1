package HM13;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Print all dividers");
        System.out.println(Arrays.toString(findAllDividers(125)));

    }
    // ====Methods===
    public static int[] findAllDividers(int n){

        int counter = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                counter++;
            }
        }
        int[]diveiders = new int[counter];

        int index = 0;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                diveiders[index] = i;
                index++;
            }
        }
        return diveiders;
    }
    //===============

}
