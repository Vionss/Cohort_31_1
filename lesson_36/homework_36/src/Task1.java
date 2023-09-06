import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {

    //Написать метод, принимающий  лист строк и возвращающий строку,
    // которая встречается раньше в листе -
    // самую короткую или самую длинную. Все строки в листе разной длины

    public static void main(String[] args) {
        List<String > list1 = Arrays.asList("aaa","c","sdsd","ddddd");

        System.out.println(Collections.max(list1));
        System.out.println(Collections.min(list1));

    }


//    public List<String> firstString(List<String> list){
//        List<String> resultFirstString = Arrays.asList("aaa","c","sdsd","ddddd");
//
//        }
//    }
}
