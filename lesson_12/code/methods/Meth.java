package methods;

public class Meth {
    public static void main(String[] args) {
      //int result =  sumNumbers(2,8);
       // System.out.println(result+1);
        System.out.println(sumNumbers(1,3)+1);


        // написать метод, который принимает число и проверяет является ли число двухзначным или трехзначным
        // метод возвращает строку, в которой отвечает на этот вопрос

        System.out.println(checkNumbers(3123));

    }
    static int sumNumbers(int a, int b){
        int sum = a + b;
        System.out.println();
        return sum;




    }
    static String checkNumbers( int num){
        if(num >= 10 && num < 100)
            return num + " is two-digit number";
        else if (num >= 100 && num < 1000)
            return num + " is three digit number";
        else
            return "This is not two or three digit number";
    }

}
