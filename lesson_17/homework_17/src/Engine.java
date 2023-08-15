public class Engine {

    double enginePower;
    String typeOfEngine;

    public Engine(double enginePower, String typeOfEngine){
        this.enginePower = enginePower;
        this.typeOfEngine = typeOfEngine;


    }
    public String toString(){
        return "\n"+ "Engine Power: "+ enginePower + "\n" + "Type of engine: " +typeOfEngine;

        //В классе Engine добавте методы start и stop. Кадлый из них пусть выводит строку "Engine is started" "Engine is stoped"
    }
    public String start(){
        return "Engine is started";
    }
    public String stop() {
        return "Engine is stoped";
    }
}
