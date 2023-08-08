package HM_12;

public class Task1 {
    public static void main(String[] args) {

        // task 1
        // Написать метод, принимающий строку и возвращающий второй и третий символы строки заглавными буквами.
        // Пример: Hello-> EL
        //В методе main() вывести получившийся результат на экран

        String st = "Hello"; // задали переменную

        System.out.println(hello(st));



    }
    //----Methods----
    public static String hello(String s){

        return s.substring(1,3).toUpperCase();
    }
    //---------------
}
