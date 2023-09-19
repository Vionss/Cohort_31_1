import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Дан List<Integer>. Написать метод, который определит,
        // есть лм в этом списке такая пара чисел, которые в сумме дабт заданное число N

        List<Integer> list = List.of(-1, 6, -5, 7, 4, 2, -1, 0);
        System.out.println(isPairEqualsNumber(list, 7)); // true
        System.out.println(isPairEqualsNumber(list, 1)); // true
        System.out.println(isPairEqualsNumber(list, 16)); // false
        System.out.println(isPairEqualsNumber(list, -1)); // true
        System.out.println("=======================================");

        System.out.println(isPairEqualsNumber2(list, 7)); // true
        System.out.println(isPairEqualsNumber2(list, 1)); // true
        System.out.println(isPairEqualsNumber2(list, 16)); // false
        System.out.println(isPairEqualsNumber2(list, -1)); // true

        System.out.println("========================================");

        System.out.println(isPairEqualsNumber3(list, 7)); // true
        System.out.println(isPairEqualsNumber3(list, 1)); // true
        System.out.println(isPairEqualsNumber3(list, 16)); // false
        System.out.println(isPairEqualsNumber3(list, -1)); // true
    }


    public static boolean isPairEqualsNumber(List<Integer> list, int num) {
        if (list == null || list.size() < 2) return false;

        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPairEqualsNumber2(List<Integer> list, int num) {
        if (list == null || list.size() < 2) return false;

        for (int i = 0; i < list.size() - 1; i++) {
            Integer pair = num - list.get(i);
            if (list.contains(pair)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPairEqualsNumber3(List<Integer> list, int num) {
        if (list == null || list.size() < 2) return false;
        HashSet<Integer> wishNumberSet = new HashSet<>();
        for (Integer i : list) {
            if(wishNumberSet.contains(i)){
                return true;
            }else {
                wishNumberSet.add(num - i);
            }
        }
        return false;
    }

}
