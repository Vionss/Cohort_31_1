package ait.string;

public class StringAppl {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);
        char[] chars = {' ', 'w', 'o', 'r', 'l', 'd'};
        String str1 = new String(chars);
        System.out.println(str1);
        str = str + str1;  //str.concat(str1);
        System.out.println(str);
        System.out.println(str.length());
        char c = str.charAt(2);
        System.out.println(c);
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,4));
        System.out.println(str.replace("l","AAA"));
        System.out.println("============================");
        String text = "qwerty";
        String newText = "qwerty";
        System.out.println(text.equals(newText));
        System.out.println("============================");
        text = "one, two, three, four, five";
        String [] arr = text.split(", ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("=======================");
        String email = " John@gmail.com ";
        System.out.println(email);
        email = email.trim().toLowerCase();
        System.out.println(email);
        System.out.println("=======================");
        text = String.join(", ", "one", "two", "three");
        System.out.println(text);
        text = String.join(", ", "one", "two", "three", "four", "five");
        System.out.println(text);
        text = String.join(", ", new String[] {"one", "two", "three", "four", "five"});
        System.out.println(text);

    }
}
