public class Busket {

    //Допустим, мы пишем on-line магазин. У нас есть класс Товар ( придумайте, какие поля должны быть).
    // Реализуйте класс Корзинка, в которую можно добавить несколько товаров.
    // Реализовать метод добавления и добавления товара в корзину.
    // Реализовать метод, который распечатает весь заказ.
    // Реализовать метод, который вернет сумму заказа.

   private Item items;

    public Busket (Item  items){
        this.items = items;
    }

    public String toString(){
        return "You have this items in your basket: " + items.getName()+ ", Total: "+items.getPrice();
    }



}

