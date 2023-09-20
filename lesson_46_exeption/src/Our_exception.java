public class Our_exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println(div(a, b));
        } catch (Exception e){
            System.out.println("Error");
            System.out.println("The program is terminated");
        }
    }

    public static int div(int a, int b) {
        if (a == 0 || b == 0){
            throw new RuntimeException();
        }
        int res = a / b;
        return res;
    }
}
