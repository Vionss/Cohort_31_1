import java.util.Arrays;

public class SmartArray {
    private int size=0;
    private int []arr = new int[4];


    public void add(int element){
        if(size <arr.length) {
            arr[size] = element;
            size++;
        }else {
            increaseArray();
            arr[size] = element;
            size++;
        }
    }

    private void increaseArray(){
        int[] tempArray= new int [arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }

        arr = tempArray;
    }
    public String specialtoString (){
        return Arrays.toString(arr) + " size: " + size;
    }

    public int[] getArr(){
        int[] tempArray= new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        return tempArray;
    }

    public String toString (){
        String res = "[";
        for (int i = 0; i < size; i++) {
            res += " " + arr[i];
        }
        res+="]";
        return res;
    }
}
