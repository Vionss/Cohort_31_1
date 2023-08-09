public class Main {
    public static void main(String[] args) {

        //#1 Создать класс Car со следующими полями
        // (String brand, String color, String licensePlate, MyDate registrationDate, Engine engine}
        //Оьратите внимание, поля registrationDate и engine - это тоже объект.
        // Engine - содержмт информация о мощности двигателя и о типе (бензин, дизель, электро).
        //Реализуйте метод toString в каждом классе.
        //Реализуйте метод конструктор в каждом классе.
        //Создайте два объекта автомобтля.

        // Car 1

        Engine engine1 = new Engine(1.5, "Diesel");
        MyDate dateOfRegistration1 = new MyDate(3,10,1990);
        Car car1 = new Car("Reno", "black", engine1, dateOfRegistration1,"RE1234TN");
        System.out.println(car1);
        System.out.println(car1.drive());
        //System.out.println(car2.drive()); почему не видит вторую машину
        System.out.println();


        // Car 2
        Engine engine2 = new Engine(6.4,"Gasoline");
        MyDate dateOfRegistration2 = new MyDate(6,12, 2017);
        Car car2 = new Car("Chevrolet", "blue", engine2, dateOfRegistration2,"KA92311MN");
        System.out.println(car2);
        System.out.println();

        //System.out.println(car2.engine.start());// почему видит клас Саr но не Engine и почему только через engine.
        //System.out.println(car2.start());
        System.out.println(car1.drive());
        System.out.println(car2.stop());








    }
}