package Game;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        /*
        Написать игру "Угадай число", в которой за ограниченое число попыток ввода числа с клавиатуры
        нужно угадать секретное число от 0 до 9.

        Условия;
        1. Код игры находится в классе GuessNumber
        2.Класс должен содержать:
          - сканер для ввода числа
          - secret, в которую записано секретное число
          - следующие методы:
            - метод, считывающий количество предоставленных попыток
            - метод, который считывает вводимое число
            - мотод, содержащий логику игры
            - метод - последовательности вызова предыдущих методов

         */


        start();




    }
    //===Methods===
    static Scanner scanner = new Scanner(System.in);
    static int secret = 9;

    public static void start(){
       int attempts =  readNumberOfAttempts();
       guessNumber(attempts);
       scanner.close();
    }

    // считывает с клавиатуры количество попыток
    static int readNumberOfAttempts(){
        System.out.println("Enter number of attempts ");
        return scanner.nextInt();

    }

    // считывает с клавитатуры число
    static int readNumber(){
        System.out.println("Enter the number from 0 to 9");
        return scanner.nextInt();
    }

    static void guessNumber( int attempts){
        while(attempts > 0){
           int number = readNumber();
           attempts--;
           if (number == secret){
               System.out.println("BINGO! You have guessed the secret number");
               return;
           }else {
               System.out.println("Wrong! You have " + attempts+ " attempts left.");
           }

        }
        System.out.println("Sorry, buddy. Maybe next time");
    }
    //=============
}
