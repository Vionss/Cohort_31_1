package HM13;

public class Task4 {
    public static void main(String[] args) {

        int [] nums ={1,3,4,62,7};
        int [] res = findMaxMin(nums);
        System.out.println(" min element = " + res[0]+ " max element "+ res [1]);
        System.out.println(" min element = " + findMaxMin(nums)[0]+ " max element "+ findMaxMin(nums)[1]);
    }
    //===Methods===
    public static int[] findMaxMin (int[] numbers){
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
            else if (numbers[i] < min){
                min = numbers[i];
            }
        }
        //int [] minMax = {min, max};
        return new int [] {min,max};

    }
    //=============
}
