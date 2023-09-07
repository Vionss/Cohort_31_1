package our_linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    // LinkedList methods методы отличающийся от ArrayList
    /*
    addFirst() / offerFirst() - добавляет элемент в начало листа
    addLast() / offerLast()   - добавляет элемент в конец листа
    removeFirst() / pollFirst() - удаляет первый элемент
    removeLast() / pollLast()   - удаляет последний элемент
    getFirst() / peekFirst - получить первый элемент
    getLast() /peekLast    - получить последний элемент
     */
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        LinkedList<String> names = new LinkedList<>();

        names.add("Jack");
        names.add("John");
        names.add("Bill");
        System.out.println(names);

        names.addFirst("Ann");
        System.out.println(names);


    }
}
