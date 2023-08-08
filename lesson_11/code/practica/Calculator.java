package practica;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // добавить ввод чисел и математического действия пользователем;
        //реализовать все вычисления методами, которые получают данные для вычислений на вход.

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Input firs number: ");
            double a = scanner.nextDouble();
            System.out.println("Input action: ");
            String action = scanner.next();
            System.out.println("Input second number: ");
            double b = scanner.nextDouble();

            switch (action) {
                case "+": {
                    sum(a, b);
                    break;
                }
                case "-": {
                    subst(a, b);
                    break;
                }
                case "*": {
                    multiply(a, b);
                    break;
                }
                case "/": { // то деление для ЦЕЛЫХ чисел
                    devision(a, b);
                    break;
                }
                case "q" :{
                    return;
                }
                default: {
                    System.out.println("Can't understand!");
                }
            }
        }


    }
    //--------Methods----
        public static void sum(double a, double b)  {
            System.out.println(a + b);
        }

    public static void subst(double a, double b)  {
        System.out.println(a - b);
    }
    public static void multiply(double a, double b)  {
        System.out.println(a * b);
    }
    public static void devision(double a, double b)  {
        System.out.println(a / b);
    }

    //-------------------
}
