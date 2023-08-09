import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {

        //Создать класс Student со следующими полями
        // (String firstName, String lastName, MyDate birthday, String group, MyDate startCourse}
        //Создайте пару объектов этого класса. Напишите метод studentToString(Student student)
        // который возвращает строку с данными студента.
        Scanner scanner = new Scanner(System.in);
    }
}


       /* Student student = new Student();
        MyDate startCourse = new MyDate();

        System.out.println("Input first name: ");
        student.firstName = scanner.nextLine();
        System.out.println("Input last name: ");
        student. lastName = scanner.nextLine();


        System.out.println(studentToString(student));

    }
    //===Methods===

    public static MyDate getMyDateFromScanner(Scanner scanner, String msg){
        System.out.println(msg);
        MyDate date = new MyDate();
        System.out.println("Input day:");
        date.day = scanner.nextInt();
        System.out.println("Input month:");
        date.month = scanner.nextInt();
        System.out.println("Input year:");
        date.year = scanner.nextInt();
        scanner.nextLine();
        return date;


    }

    public static String studentToString(Student student){
        String firstName = student.toString();
        String lastName = student.toString();
        return student.firstName + " "+ student.lastName + "(" + (student.birthday)+ ")" + "group: ";
    }

    //=============
}
/*
        */
