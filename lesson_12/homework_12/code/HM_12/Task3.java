package HM_12;

public class Task3 {
    public static void main(String[] args) {

        // task 3
        //Написать метод, принимающий массив целых чисел и число и находящий индекс этого числа(элемента) в массиве.
        // Если такой элемент есть, возвращается его индекс, если нет, метод возвращает -1.
        //В методе main() вывести получившийся результат на экран

        int [] mass = {123,634,53,72,12,56,82,};
        System.out.println(searchNumber(mass,11,4));

    }
    //---Methods---
    public static int searchNumber(int[]ints, int x, int index){

        for (int i = 0; i < ints.length ; i++) {
            if(ints[i] == x && i ==index)
                return i;
        }

            return -1;
    }
    //-----------
}
