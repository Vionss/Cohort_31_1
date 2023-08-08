public class StudentInfo {
    public static void main(String[] args) {

        //Создать класс Student со следующими полями
        // (String firstName, String lastName, MyDate birthday, String group, MyDate startCourse}
        //Создайте пару объектов этого класса. Напишите метод studentToString(Student student)
        // который возвращает строку с данными студента.



        MyDate myDate = new MyDate();
        myDate.day = 3;
        myDate.month = 10;
        myDate.year = 1999;

        MyDate myDate2 = new MyDate();
        myDate2.day = 18;
        myDate2.month = 7;
        myDate2.year = 2023;

        Student student = new Student();

        student.firstName = "Rob";
        student.lastName = "Kublar";
        student.birthday = myDate;
        student.group = "31";
        student.startCourse = myDate2;

        System.out.println(studentToString(student));

    }
    //===Methods===

    public static String studentToString(Student student){
        return student.firstName + " "+ student.lastName+ " "+ student.birthday+ " "+ student.group+" "+ student.startCourse;

    }

    //=============
}
