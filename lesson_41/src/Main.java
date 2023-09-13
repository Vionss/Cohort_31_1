import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // С помощью множеств реализовать метод,
        // который принимает лист имен и возвращает лист без повторяющихся элементов

        System.out.println(task(List.of("jack", "john", "ann", "jack", "nick")));

        List<Person> people = task1(List.of(
                new Person("Jack", 21),
                new Person("John", 22),
                new Person("Ann", 30),
                new Person("Jack", 21),
                new Person("Jack", 21)
        ));

        System.out.println(people);

    }


    public static List<String> task (List<String> list){
        if(list == null) return null;
        Set<String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static List<Person> task1 (List<Person> list){
        if(list == null) return null;
        Set<Person> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
}
