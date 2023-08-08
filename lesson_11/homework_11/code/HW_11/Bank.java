package HW_11;

import java.util.Random;

public class Bank {
    public static void main(String[] args) {

        Random random = new Random();
        double[] randomMoney = new double[20];

        for (int i = 0; i < randomMoney.length; i++) {
            randomMoney[i] = random.nextDouble(10000,100000000);
            System.out.printf("%.2f %n" , randomMoney[i]);

        }

        countNewAmount(randomMoney);

    }
    //---Methods---
    static void countNewAmount(double[] money){
        double[] denominated = new double[20];
        System.out.println("Denominated array");
        for (int i = 0; i < money.length; i++) {
            denominated[i] = money[i]/100.0;
            System.out.printf("%.2f %n",denominated[i]);
        }


    }
    //-------------
}
