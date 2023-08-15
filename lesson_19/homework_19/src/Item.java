public class Item {

    private String  name;

    private double price;

    private int  size;

    public Item (String name, double price, int size){
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String toString(){
        return "Item: "+name + ", "+price+ "$,"+size+ "g";
    }

    public String addItem (){
        return "You added " + "'"+name+"'" + " to your basket";
    }
    public String deleteItem (){
        return "You deleted " + "'"+name+"'" + " from your basket";
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }



}
