import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Дана String с произвольным текстом (без знаков препинания слова разделены пробелом).
        // Необходимо получить map, где ключем будет выступать первая буква слова,
        // а значением, список слов начинающихся на эту букву


//        System.out.println(listHandler("Hello i am daun", "e"));
//    }
//
//
//    public static Map<String, List<String>> listHandler(String str, String firstLetter) {
//        Map<String, List<String>> result = new HashMap<>();
//
//        String[] words = str.split("\\s");
//        for (String subStr : words) {
//            System.out.println(subStr);
//            return result;
//        }
//        return result;
//    }

        String str = "разбить строку на слова";
        String[] words = str.split("\\s"); // Разбиение строки на слова с помощью разграничителя (пробел)
        // Вывод на экран
        for(String subStr:words) {
            System.out.println(subStr);
        }
    }
}
