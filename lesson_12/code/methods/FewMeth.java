package methods;

public class FewMeth {
    public static void main(String[] args) {


        System.out.println("with two args: " + sumNumbers(1,2));
        System.out.println("with three args: "+ sumNumbers(1,2,3));
        System.out.println("with three args: "+ sumNumbers(1.5,2.5));



    }

   // ----Methods---
   static int sumNumbers(int a, int b, int c){

       return a + b + c;


    }
    static int sumNumbers(int a, int b){

        return a + b;
    }

    static double sumNumbers( double a, double b){

        return a + b;
    }

    //static double sumNumbers(int a, int b){
      //  return a + b;
    //}
    //-----------
}
