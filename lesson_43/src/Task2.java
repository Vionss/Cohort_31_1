import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        // Дан список строк. Получить список 4 самых часто встречаемых слов
        /*
        1. Список строк-тексов преобразовать в список слов
        2. Сформировать Map<String, Integer>
        3.
         */

        Map<String, Integer> map = new HashMap<>();
        map.put("qwe", 3);
        map.put("rty", 2);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> e: entries){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
