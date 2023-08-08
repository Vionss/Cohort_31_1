package HW_11;

import java.util.Scanner;

public class MilesKM {
    public static void main(String[] args) {

        //Реализуйте с помощью метода конвертор, который переводит скорость в милях в час в скорость в км/час.
        // 1 миля равна 1609 метров. Метод получает на вход данные от пользователя с клавиатуры.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Miles/h: ");
        double miles = scanner.nextDouble();
       KmInMiles(miles);





    }
    //-----Methods---
    public static void KmInMiles(double miles){

        double  a = 1.609 * miles;
        System.out.println("Km/h = " + a);
    }
    //---------------

}
