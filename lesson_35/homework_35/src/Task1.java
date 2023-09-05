import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {


        //Написать метод, принимающий два листа целых чисел одинаковой длины
        // и возвращающий лист, содержащий элементы Yes или No,
        // где значения на i-м месте зависит от того,
        // равны ли элементы этих двух листов под номером i.
        //Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);


            numbers2.add(5);
            numbers2.add(2);
            numbers2.add(3);
            numbers2.add(8);

            for (int j = 0; j < numbers2.size(); j++) {
                if (numbers.contains(j)) {
                    System.out.println( "Yes");
                }else System.out.println("No");
            }

        }
    }



