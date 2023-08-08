package practica;
import java.util.Scanner;

public class Pifagor {
    public static void main(String[] args) {

        // Реализуйте метод, который вычисляет длину гипотенузы прямоугольного треугольника по двум
        // заданным пользователем катетам (теорема Пифагора).


        // шаг 1. создать сканер
        // шаг 2. получить от пользователя данные про катеты
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input catet a: ");
        double a = scanner.nextDouble();
        System.out.println("Input catet b: ");
        double b = scanner.nextDouble();

        //  шаг 3. вызов метода
        pifagorMethod(a,b); // вызов метода с передачей ему аргументов


    }
    //----------Methods---------
    public static void pifagorMethod(double x, double y){ // обявили метод с параметрами на входе
        double c = Math.sqrt(Math.pow(x,2) + y * y); // Math.sqrt(вычисляет корень квадратный)/ в квадрат можновозводить по разному
        System.out.println("Hipotenusa = " + c);


    }
    //--------------------------
}
