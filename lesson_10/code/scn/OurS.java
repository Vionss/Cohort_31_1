package scn;
import java.util.*;
public class OurS {
    public static void main(String[] args) {
        System.out.println();

        // создает сканер
       Scanner scanner = new Scanner(System.in);

        /*System.out.println( "Enter a number ");

        int num1 = scanner.nextInt(); // сканер ждет пока пользователь введет целое число
        System.out.println("You entered number  "+ num1);
        System.out.println("Enter second number ");
        int num2 = scanner.nextInt();
        System.out.println("You entered number  "+ num2);

        int sum = num1+num2;
        System.out.println(num1+ " + "+ num2+ " = "+ sum);

        */

        // метод для чтеня строк nextLine
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, "+name+" "+ surname+ "! "+"You are "+ age+  " old.");

       scanner.close();




    }
}
