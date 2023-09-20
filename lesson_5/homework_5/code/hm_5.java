public class hm_5 {

    public static void main(String[] args) {

        // task 1

        String word = "Hell";
        String halfword = word.substring(0,2);
        System.out.println(halfword);


        // task 2

       /* Есть две переменные целого типа.
       Написать программу, выводящую на экран true если значение одной из переменных = 10 или сумма значение переменных равна 10.
        Иначе на экран выводится false.
        Пример: int a = 10, int b = 9 -> true
        int a = 1 , int b = 9 -> true
        int a = 4 , int b = 10 -> true
        int a = 4 , int b = 3 -> false

        */

        int a, b;
        a = 1;
        b = 9;

        boolean var_boolean = a == 10  || b == 10 || a + b  == 10;

        System.out.println(var_boolean);

    }

}
