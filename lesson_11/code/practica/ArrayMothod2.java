package practica;

public class ArrayMothod2 {
    public static void main(String[] args) {

        //реализуйте метод, который получает на вход массив, искомое число
        // и отвечает на вопрос, нашлось ли это число в массиве.

        int[] array = {14, 73, -203242, 8, -15, -45, -999};

        findElInArray(array, 13);

    }
    //------------Methods
    public static void findElInArray(int[]arr, int x){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                flag = true;
            }
        }
        if(flag) {
            System.out.println("Element "+ x + " presents in array");
        }else {
            System.out.println("Element "+ x + " isn't present in array");
        }

    }

    //-------------------
}
