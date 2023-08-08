package practica;

public class ArrayMethod {
    public static void main(String[] args) {

        // реализуйте метод, который получает на вход массив и находит его минимальный элемент.
        // шаг 1. создать массив
        // шаг 2. сделать метод

        int[] array = {14, 73, -203242, 8, -15, -45, -999};

        minElofArray(array);




    }
    // -------Methods-----
    public static void minElofArray(int[] arr){
        // ищем минимальный элемент
        int min = arr[0]; // это переменная для минимума
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min element of array is: "+ min);
    }
    //--------------------
}
