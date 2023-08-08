package practica;

import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {

        //Реализуйте метод, который получает на вход строку на английском языке
        // и сообщает количество гласных букв в ней.

        // a, e, i, o, u, y - это гласные буквы
        // шаг 1. подключаем сканер
        // шаг 2. получить от пользователя строку
        // шаг 3. пишем метод, который принимает эту строку на вход
        // шаг 4. пройти циклом по всей строке charAt(index) и посчитать количество гласных

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String st = scanner.nextLine().toLowerCase();  // читает строку с клавиатуры до нажатия ввода, включая пробелы

        // вызов метода
        findLetters(st); // передаем ему на вход аргумент st

    }
    // -------Methods---------

    public static void findLetters(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
           if  (s.toLowerCase().charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||s.charAt(i) == 'y'){
               count++;
           }
        }
        System.out.println("Number of vowels letters are: " +count);

    }


    //------------------------

}
