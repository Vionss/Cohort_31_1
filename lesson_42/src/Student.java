import java.util.Objects;

public class Student {
    private String name;
    private int lessons;

    public Student(String name, int id) {
        this.name = name;
        this.lessons = id;
    }

    @Override
    public String toString() {
        return name + "(" +lessons+")";
    }

    public String getName() {
        return name;
    }

    public int getLessons() {
        return lessons;
    }
}
