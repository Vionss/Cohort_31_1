public class Car {
    String brand;
    String color;
    String licensePlate;
    MyDate registrationDate;
    Engine engine;

    public Car (String brand, String color, Engine engine, MyDate registrationDate, String licensePlate){
        this.brand = brand;
        this.color = color;
        this.licensePlate = licensePlate;
        this.registrationDate = registrationDate;
        this.engine = engine;
    }
    public String toString(){
        return "Brand of a car: "+ brand + "\n" + "Color: " + color + "\n" + "Engine type: " + engine + "\n" +"Registration date: " + registrationDate +"\n" + "License plate: " + licensePlate;
    }

    // В классе Car добавте методы drive и stop.
    // Первый должке заводить двигатель и писать, что такая то машина поехала.
    // Второй, соответственно глушить двигатель и останавливать машину.

    public String drive(){
        return color +" " + brand + ", "+"License plate: "+ licensePlate+" - " + engine.start() + "." + " This car is driving"; // почему через engine?
    }
    public String stop(){
        return color +" " + brand + ", "+"License plate: "+ licensePlate+" - " + engine.stop() + "." + " This car has stoped";
    }

}
