public class practicum {
    public static void main(String[] args) {


        // Есть трехзначное число ( 365). Написать программу,
        // 1.выводящую на экран все цифры  этого числа.
        // 2.получить новое число, образованное перестановкой  единиц и сотен и вывести его на экран
        // 3.Вывести на экран сумму цифр этого числа
        int number = 365;
        System.out.println( );





        // Написать программу, выводящую на экран цифры от 1 до 10
        // Написать программу, считающую сумму цифр от 0 до 20 и выводящую результат на печать

        int a = 1;
        int b = 10;

        while(a <= b){
            System.out.println(" "+ a);
            a++;
        }

        int a1 = 0;
        int b1 = 20;
        int sum = 0;

        while(a1 <= b1){
            sum = sum + a1;
            a1++;
        }
        System.out.println("Sum of digits from 0 to " +b1+ " is " + sum);
    }
}
