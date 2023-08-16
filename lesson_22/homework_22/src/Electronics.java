public class Electronics extends Items {
    public Electronics(String nameOfItem, double price) {
        super(nameOfItem, price);
    }

    public String toString(){
        return getNameOfItem()+";" + " price: "+ getPrice()+"$";
    }
    public void buy(){
        System.out.println("Thank you for the purchase"+"\n"+"We will also give you 3 years guarantee from our store");
    }

}
