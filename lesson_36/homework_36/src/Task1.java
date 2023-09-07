import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {

    //Написать метод, принимающий  лист строк и возвращающий строку,
    // которая встречается раньше в листе -
    // самую короткую или самую длинную. Все строки в листе разной длины

    public String findShortestOrLongest(List<String> list) {
        //List<String> list1 = Arrays.asList("aaa", "c", "sdsd", "ddddd");

        String minSizeElement = list.get(0);
        int indexMinElement = 0;
        String maxSizeElement = list.get(0);
        int indexMaxElement = 0;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() < minSizeElement.length()){
                minSizeElement = list.get(i);
                indexMinElement = i;
            }else if (list.get(i).length() > maxSizeElement.length()){
                maxSizeElement = list.get(i);
                indexMaxElement = i;
            }
        }
        if(indexMinElement < indexMaxElement){
            return minSizeElement;
        }
        return maxSizeElement;
    }
}
