package hm4;

public class Char {

    public static void main(String[] args) {

        // task 1

        System.out.println("\u0042"); //

        int chInt = 'B';
        System.out.println("chInt is "+chInt);


        // task 2

        String a = "Hi";
        String b = "Bye";

        System.out.println(a+b+b+a);


        // task 3

        String q = "Java";

        char ch2 = q.charAt(2);

        System.out.println(ch2);


        // task 4

        String j = "Java";
        int dj = j.length();

        System.out.println(dj*2);
    }
}
