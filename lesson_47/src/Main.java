import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        try {

        } catch () {

        } finally {

        }
        */
        //throw
        //throws

        int value = readInt();
        System.out.println(value);

        try {
            System.out.println("div " + div(18, 0));

        } catch (MyCheckedException e){

        }

        System.out.println("Div2 " + div2(7, 0));


    }
    public static int readInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input int: ");
        //int value;
        try {
            int value = scanner.nextInt();
            System.out.println("The inputed value: " + value);
            return value;
        }catch (Exception e){
           throw new ReadIntException();
        }finally {
            System.out.println("________finally________");
        }
    }

//    public static int readInt(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input int: ");
//        try {
//            int value = scanner.nextInt();
//            value = 10/value;
//            System.out.println("The inputed value: " + value);
//            return value;
//
//    }

    public static int div(int a, int b) throws MyCheckedException{
        if(b==0) throw new MyCheckedException("Not correct value");
        return a/b;
    }

    public static int div2(int a, int b){
        if(b==0) throw new MyUnCheckedException("Not correct value");
        return a/b;
    }
}
