import java.util.*;

public class Main {
    /*
    Collections

    List and ArrayList
     */
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        // List<String> names = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();

        // добавление элемента в конец листа, метод add()

        names.add("John");
        System.out.println(names);
        names.add("Bill");
        System.out.println(names);

        // добавление элемента по индексу

        names.add(1, "Mary");
        System.out.println(names);
//        names.add(5,"Jack");
//        System.out.println(names);

        names.add(3, "Jack");
        System.out.println(names);

        System.out.println("print listCapacity");
        List<String> listCapacity = new ArrayList<>(20);
        System.out.println(listCapacity);

        // метод для определение размера листа
        System.out.println("names list size is: " + names.size());
        System.out.println("listCapacity size is: " + listCapacity.size());

        //[John, Mary, Bill, Jack]
        // изменить элемент - метод set();
        names.set(2, "Ann");
        System.out.println(names);

        // получение элемента по индексу - метод get();
        System.out.println(names.add("Kate"));
        System.out.println(names.get(0));

        List<Integer> numbers = new ArrayList<>(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(12);
        numbers.add(17);
        System.out.println("numbers capacity size" + numbers);

        // удаление элемента метод remove(Object o) - удаление по названию
        names.remove("Bill");
        System.out.println("Bill removed");
        System.out.println(names);

        // удаление по индексу Object remove (int index) удаление по индексу
        System.out.println("who is removed? "+ names.remove(0));
        System.out.println(names);

        System.out.println(numbers);
        numbers.remove(1); //по индексу
        System.out.println(numbers);
        numbers.remove(1); // Обект
        System.out.println(numbers);
        numbers.remove(Integer.valueOf(17));
        System.out.println(numbers);

        // int indexOf(Object o) - возвращает индекс элемента
        int position = names.indexOf("Ann");
        System.out.println(position);

        // boolean contains(Object o) - проверяет содержит ли лист данный элемент
        System.out.println(names.contains("Jack"));
        System.out.println(names.contains("Bill"));


        // сортировка коллекций
        Collections.sort(names);
        System.out.println(names);

        System.out.println("For Loop");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("Enhanced For");
        for (String name : names) {
            System.out.println(name);
        }

        // Итератор
        /*
        Iterator - один из методов интерфейса Сollection. Он возвразает обект,
        реализующий интерфейс Iterator

        методы интерфейса итератор:
        E next() - возвращает следующий элемент коллекции
        boolean hasNext() - проверят не достигнут ли конец коллекции
        remove - удаляет текущий элемент (полученный последним вызовом next())
         */
        System.out.println("With iterator");
        Iterator<String > ourIterator =  names.iterator();

        while (ourIterator.hasNext()){
           if(ourIterator.next().equals("Ann"))
            ourIterator.remove();
        }
        System.out.println(names);
    }
}
