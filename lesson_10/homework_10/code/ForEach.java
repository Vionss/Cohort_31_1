import java.util.*;

public class ForEach {

    public static void main(String[] args) {

        // task 1
        //Написать программу, которая принимает с клавиатуры имя , фамилию и возраст (Ваши или воображаемого персонажа)
        // и выводит в консоль эту информацию в следующем виде:
        //
        //First name: John
        //
        //Last name: Smith
        //
        //Age: 25


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Firs name: "+name);
        System.out.println("Last name: "+ surname);
        System.out.println("Age: "+ age);

        System.out.println();


        // task2
        //Написать программу, вычисляющую факториал числа 5.
        //Факториал числа - это произведение всех целых чисел от 1 до самого числа.
        // Т.е. факториал 5 это: 5! = 5 * 4 * 3 * 2 * 1. ! -обозначение факториала.

        factorial();

    }
    static void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Factorial: ");
        int factorial = scanner.nextInt();

        int f = factorial;
        int result = 1;
        for( int i = 1; i <= f; i++){

            result *= i;

        }
        System.out.println("Факториал числа " + f + " = " + result);

        Celsius();


        // task 3

        //Написать метод для перевода градусов по фаренгейту в шкалу цельсия.
        // Формула для расчета С = 5*(F-32)/9. Результат вывести на экран

        System.out.println();

    }


    static void Celsius(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Fahrenheit degree: ");
        int F = scanner.nextInt();

        double C = 5.0 *(F-32)/9.0;
        System.out.println("Celsius = " + C);

    }
}








