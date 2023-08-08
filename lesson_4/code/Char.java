public class Char {

    public static void main(String[] args) {

            char ch;
            ch = 'X';
           // ch = 'a'
        System.out.println("This is character: "+ch);
        System.out.println("This is character: "+'X');


        ch++;
        System.out.println("ch is now "+ch);

        int chInt = 'X';
        System.out.println("chInt is "+chInt);

        char char1 = 88;
        System.out.println(char1);

        System.out.println("He says \"hello\"");
        // \"...\"   - для передачи двойных кавычек
        // \'...\'   - одинарная кавычка
        // \\...\\   - передает слеш
        // \n        - переход на новую строку
        // \t        - табуляция
        // \u0000    - ислользование юникода

        System.out.print("Hello \nJava\n");

        System.out.println("Hello\t\tJava\tHello");
        System.out.println();


        Person john = new Person();
        john.name = "John";
        john.age = 25;
        System.out.println("Person name is "+ john.name);
        System.out.println("Person age is "+  john.age);
        john. canTalk();
        john.canWalk();

        Person bill = new Person();
        bill.name = "Bill";
        bill.age = 46;
        System.out.println("Person name is "+bill.name);
        System.out.println("Person age is "+bill.age);

    }
}
