package practicum;

public class NumbersHandler {
    private SmartArray numbers;

    public NumbersHandler (SmartArray numbers){
        this.numbers = numbers;
    }

    public int getQuantity(){
        int size = numbers.getArr().length;
       return size;
    }

    public double calcAverage(){
        int[] array = numbers.getArr();
        double sum = 0;
        for (int num: array){
            sum+=num;
        }
        return sum/ array.length;
    }

    public void printStat(){
        System.out.println("Size: " + getQuantity());
        System.out.println("Average volume: " + calcAverage());
    }
}
