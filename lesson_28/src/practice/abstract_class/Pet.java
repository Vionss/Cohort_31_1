package practice.abstract_class;

import java.util.Objects;

public abstract class Pet {
    private String kind;
    private int age;
    private double wage;
    private boolean  gender;

    public Pet(String kind, int age, double wage, boolean gender) {
        this.kind = kind;
        this.age = age;
        this.wage = wage;
        this.gender = gender;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "kind='" + kind + '\'' +
                ", age=" + age +
                ", wage=" + wage +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && Double.compare(wage, pet.wage) == 0 && gender == pet.gender && Objects.equals(kind, pet.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, age, wage, gender);
    }


}
