public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String  toString(){
        return name + " " + age;
    }

    public  int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age < 0){
            return;
        }
        this.age = age;
    }
}
