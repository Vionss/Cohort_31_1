import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int [][] array = createArrayAndFill(5,3);
        print(array);
        System.out.println("-----------------------------");
        System.out.println(Arrays.toString(toArray(array)));
        changeRows(array, 2,4);
        print(array);


    }
    public static int [] [] createArrayAndFill(int row, int col){
        int [][] arr = new int [row][col];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) { // arr.length - количество строк
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(50);
            }
        }

        return arr;
    }
    public static void print(int [] [] arr){
        for (int i = 0; i < arr.length; i++) { // arr.length - количество строк
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();;
        }
    }


    public static int[] toArray (int [] [] arr) {
        int [] result = new int[arr.length*arr[0].length];
        int index =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[index++] = arr[i][j];
            }
        }
        return result;
    }

    public static void changeRows(int [][] arr, int row1, int row2){
        if(row1<0 || row2<0 || row1 >= arr.length || row2>= arr.length){
            throw new IllegalArgumentException();
        }
//        for (int j = 0; j < arr[row1].length; j++) {
//            int temp = arr[row1][j];
//            arr[row1][j] = arr[row2][j];
//            arr[row2][j] = temp;
//        }

        int[] temp;
        temp = arr[row1];
        arr[row1] = arr[row2];
        arr[row2] = temp;
    }

}
