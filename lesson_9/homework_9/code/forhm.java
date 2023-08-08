public class forhm {
    public static void main(String[] args) {


        // task 1

        // Написать программу, вычисляющую факториал числа 5.
        //Факториал числа - это произведение всех целых чисел от 1 до самого числа.
        // Т.е. факториал 5 это: 5! = 5 * 4 * 3 * 2 * 1.
        //! -обозначение факториала.


        int f = 5;
         int result = 1;
         for( int i = 1; i <= f; i++){

             result *= i;

        }
        System.out.println("Факториал числа " + f + " = " + result);







        // task 2
        // Есть массив из 10 целых чисел. Написать программу, находящую количество четных чисел в нем

       /* int [] odd = {26, 32, 37,75,13,29,75,3,38,92};

        int i = 0;
        int result = 0;


        while ( i < odd.length ){

            if (odd[i] % 2 == 0){
                result++;
            }
            i++;
        }
        System.out.println(result);

        */



        int [] odd = {26, 32, 37,75,13,29,75,3,38,92};

        int result1 = 0;
        for (int i = 0; i < odd.length; ) {

           if(odd[i] % 2 == 0)
               result1++;
           i++;

        }
        System.out.println("Количество четных чисел " + result1);


        // task 3

        //Есть массив целых чисел.
        // Написать программу, находящую разницу между значением максимального и минимального элементов.
        // (max - min).


        int [] mass = {26, 32, 37,75,13,29,75,3,38,92};

        int max = mass[0];
        int min = mass[0];

        for ( int i = 0; i < mass.length; i++){

            if (mass[i] > max){
                max = mass[i];
            }
            else if (mass[i] < min){
                min  = mass[i];
            }
        }
        System.out.println("Разница между " + max + " и " + min + " = "+ (max-min));



        // task 4
       /* Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:
        1
        12
        123
        1234
        12345
        123456
        */

        int x = 6;

        for (int i = 1; i<=x; i++);

        for ( int j= 1; j <= 1; j++ )
        System.out.println(j);

        System.out.println();


        







    }

}
