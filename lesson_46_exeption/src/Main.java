public class Main {
    public static void main(String[] args) {
        int [] arr = {1,4,5,9};

    }

    public static void method(int arr[]){
        arr[1] = 10;
        arr[1] = arr[0]+ arr[1];
        arr[1] = arr[0]+ arr[1];
        arr[1] = arr[0]+ arr[1];
        arr[1] = arr[0]+ arr[1];
    }
    public static void method2(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10;
            arr[i] = arr[0]+ arr[1];
            arr[i] = arr[0]+ arr[1];
            arr[1] = arr[0]+ arr[1];
            arr[1] = arr[0]+ arr[1];
        }
    }
}
