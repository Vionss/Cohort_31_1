package operator;

public class Triangle {
    public static void main(String[] args) {

        // Даны 3 целых числа 10, 3 и 2 - длины отрезков.
        // Проверьте, можно ли из них составить треугольник или нельзя?

        // неравенство триугольника -

        int a = 10;
        int b = 3;
        int c = 2;

        if ( a < (b+c) & b < (a+c) & c < (a+b)) { //  && если первое условие не выполнилось, програма не продолжает
            System.out.println(" Yes it is !");
        } else {
            System.out.println(" No, triangle does not exist!");
        }

    }
}
