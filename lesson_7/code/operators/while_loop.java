package operators;

public class while_loop {
    public static void main(String[] args) {
        System.out.println("***LEAP YEAR***");

        int  year = 2020;

       boolean a1 =  (year % 4) == 0;
       boolean b1 = (year % 100) != 0;
       boolean c1 = ((year % 100 == 0) && (year % 400 == 0));
       boolean result = a1 && (b1 || c1);
        System.out.println("is "+ year + " a leap year ? "+ result);


        // цикл While

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        // while ( condition) {
        // statement;
        // statement;
        // }

        int i = 0; // присвоение начального значение переменной условия цикла

        while (i < 10){
            System.out.println(1);
            i++;

        }
        System.out.println("End of while loop");

        int o=1;

        while (o <= 10){
            System.out.println(o++);
            // o++;

        }
        System.out.println("End of while loop");


        int j = 10;

        while (j > 1){
            System.out.println(j);
            j--;
        }


        char ch = 'a';

        while (ch <= 'z'){
            System.out.print(ch+" ");
            ch++;
        }
        System.out.println();

        // написать програму, считающую сумму чисел от 1 до 5
        // 1+2+3+4+5

        int k = 1;
        int sum = 0;

        while (k <= 5){
            sum = sum + k;
            k++;

        }
        System.out.println("Sum of 5 digits is "+ sum);


        // цикл DO-WHILE
        /*
        Отличие цикла do-while от while  заключается в том, что проверка условия в нем
        происходит в конце цикла

        do
        {
         statement(s)
        } while (condition )
         */

        System.out.println("DO-while example");
        int g = 10;

        do {

            System.out.println(g);
            g--;

        }while (g > 1);

        System.out.println("End of do-while");


        int i1 = 1;

        while (i1 <= 9) {

            int j1 = 1;
            while (j1 <= 9){

                System.out.println(i1+ "*"+j1+ " = "+ j1*i1);
                j1++;
            }
            System.out.println("*************************");

            i1++;
        }



    }
}
