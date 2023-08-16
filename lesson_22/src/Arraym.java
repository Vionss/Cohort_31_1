public class Arraym {

    public static void sort (int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = searchMin(arr, i, arr.length);
            if(arr[min] < arr[i]){
                swap(arr, i, min);
            }
        }
    }

    public static int searchMin(int[] arr, int iMin, int iMax) {
        int indexOfMinEl= iMin;
        for (int i = iMin; i < iMax; i++) {
            if(arr[i]<arr[indexOfMinEl]){
                indexOfMinEl = i;
            }
        }
        return indexOfMinEl;
    }

    private static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public static void bubbleSort (int [] arr){
        for (int i = 0; i < arr.length-1 ; i++) {

            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
}
