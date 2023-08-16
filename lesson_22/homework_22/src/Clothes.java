public class Clothes extends Items {
    public Clothes(String nameOfItem, double price) {
        super(nameOfItem, price);
    }
    public String toString(){
        return getNameOfItem()+";" + " price: "+ getPrice()+"$";
    }
}
