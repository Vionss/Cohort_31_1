public class OurString {

    String john = "John";

   // String bill = new String();


    public static void main(String[] args) {

        String hello = "Hello";
        String java = "Java";
        // "Java".
        // 0 1 2 3 4
        // H e l l o   length = 5

        // length() - находит длину строки
        int len = hello.length();
        System.out.println("length of hello is " +len);

        int lenJava = java.length();
        System.out.println("length of java is "+ lenJava);

        // charAt() - находит символ на заданой позиции или по заданому индексу
       char ch0 = hello.charAt(0); // H
        System.out.println(ch0);
        char ch1 = hello.charAt(1); //e
        System.out.println(ch1);
        char ch2 = hello.charAt(2); // l
        System.out.println(ch2);
        char ch3 = hello.charAt(3); // l
        System.out.println(ch3);
        char ch4 = hello.charAt(4); // o
        System.out.println(ch4);
    }


}
