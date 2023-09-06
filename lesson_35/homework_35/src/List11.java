import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List11 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = List.of(5,2,3,8);

        List11 task1 = new List11();
        System.out.println(task1.yesOrNo(list1,list2));

    }


    //Написать метод, принимающий два листа целых чисел одинаковой длины
    // и возвращающий лист, содержащий элементы Yes или No,
    // где значения на i-м месте зависит от того,
    // равны ли элементы этих двух листов под номером i.
    //Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}


    public List<String> yesOrNo(List<Integer> list1, List<Integer> list2) {
        List<String> resultYesOrNo = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i))) {
                resultYesOrNo.add("Yes");
            } else resultYesOrNo.add("No");
        }
        return resultYesOrNo;
    }

    //Написать метод, принимающий лист целых чисел и целое число
    // и возвращающий лист без элементов больших этого числа.
    //Протестировать.

    public List<Integer> withoutEltsMoreThanNumber(List<Integer> input, int n){
        List<Integer> withioutMoreThan = new ArrayList<>();
        for (Integer i : input){
            if(i <= n){
                withioutMoreThan.add(i);
            }
        }
        return withioutMoreThan;
    }

    public List<Integer> withoutEltsMoreThatNIterator(List<Integer> input, int n){
        Iterator<Integer> iterator = input.iterator();

        while (iterator.hasNext()){
            if(iterator.next() >= n ){
                iterator.remove();
            }
        }
        return input;
    }
}



