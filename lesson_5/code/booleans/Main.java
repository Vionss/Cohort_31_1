package booleans;

public class Main {

    public static void main(String[] args) {

        // substring() method. Находит часть строки начиная с символа на указаной позиции

        String world = "world";
       String subWorld = world.substring(1);
        System.out.println(subWorld);


        subWorld = world.substring(1,4);
        System.out.println(subWorld);

        subWorld = world.substring(1,world.length());
        System.out.println(subWorld);

        // Тип boolean
        /*
        boolean  занимает 1 бит и может принимать два значения true or false
         */

        boolean b;

        b = false;
        System.out.println("b is "+b);

        b = true;
        System.out.println(b);

        System.out.println("10 > 9 ? " + (10 > 9 ));
        System.out.println("10 > 9 ? " + (10 < 9 ));

        int a = 10;
        int c = 12;
        if(a < c)
            System.out.println("a < c");


        // Relational opetators
        /*
        >  больше чем
        <  меньше чем
        >= больше или равно
        <= меньше или равно
        == равно
        != не равно
         */
        // true > false

        int i = 10;
        int j = 11;
        System.out.println("i < j " + (i<j));
        System.out.println("i > j " + (i>j));
        System.out.println("i <= j " + (i<=j));
        System.out.println("i >= j " + (i>=j));
        System.out.println("i == j " + (i==j));
        System.out.println("i != j " + (i!=j));


        // Логические операторы (Logical operators)

     /*
     & - AND  И
     | - OR   ИЛИ
     ! - NOT  НЕ
     ^ - XOR (exclusive OR)  исключающее ИЛИ

     Когда значения p и q разные, XOR дает true. Когда одинаковые , то false

      */

     boolean b1 = true;
     boolean b2 = false;
     System.out.println("b1&b2 "+(b1 & b2));
     System.out.println("!(b1&b2) "+!(b1 & b2));
     System.out.println("b1|b2 "+(b1 | b2));
     System.out.println("b1^b2 "+(b1 ^ b2));


     int n, d;

     n = 10;
     d = 0;

     if ( d != 0 && (n % d)==0 ) {
      System.out.println("sda");
     }








    }
}

