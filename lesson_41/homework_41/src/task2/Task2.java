package task2;

import javax.swing.*;
import java.time.Instant;
import java.time.format.SignStyle;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        //Дан список студентов. Каждая запись в этом списке означает, что студен посетил занятие.
        // Необходимо сформировать Map<Student, Integer>, где ключ студент,
        // а значение - количество занятий

        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Jack"));
        list.add(new Student(3, "Nick"));
        list.add(new Student(2, "Ann"));
        list.add(new Student(1, "Jack"));
        list.add(new Student(1, "Jack"));
        list.add(new Student(3, "Nick"));
        list.add(new Student(1, "Jack"));

        System.out.println(listHandler(list));
        System.out.println(listHandler2(list));
    }

    public static Map<Student, Integer> listHandler(List<Student> students){
        Map<Student, Integer> result = new HashMap<>();
        if(students == null)return result;
        for(Student student : students){
            if(result.containsKey(student)){ // student is present
                result.put(student, result.get(student)+1);
            } else {
                result.put(student, 1);  // student first time
            }
        }
        return result;
    }

    public static Map<Student, Integer> listHandler2(List<Student> students){
        Map<Student, Integer> result = new HashMap<>();
        if(students == null)return result;
        for(Student student : students){
            result.put(student,    result.getOrDefault(student, 0)   +1);
        }
        return result;
    }
}
