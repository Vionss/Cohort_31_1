public class Student {

    private String name;

    private static int questionCounter;

    static {
        questionCounter =0;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student" + name;
    }

    public void ask(){
        questionCounter++;
        System.out.println(name + " ask the question #"+ questionCounter);

    }

}
