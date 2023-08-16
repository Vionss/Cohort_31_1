public class Groceries extends Items{
    public Groceries(String nameOfItem, double price) {
        super(nameOfItem, price);
    }

    public String toString(){
        return getNameOfItem()+";" + " price: "+ getPrice()+"$";
    }
    public void buy(){
        System.out.println("There will be "+ getPrice()+"$"+ " and extra 5$ for quick delivery. "+ "Total: "+(getPrice()+ 5+"$"));
    }
}
