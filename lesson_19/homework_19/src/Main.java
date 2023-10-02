public class Main {
    public static void main(String[] args) {

       //Допустим, мы пишем on-line магазин. У нас есть класс Товар ( придумайте, какие поля должны быть).
        // Реализуйте класс Корзинка, в которую можно добавить несколько товаров.
        // Реализовать метод добавления и добавления товара в корзину.
        // Реализовать метод, который распечатает весь заказ.
        // Реализовать метод, который вернет сумму заказа.

    Item item1 = new Item("Lays", 2.05, 100);
    Item item2 = new Item("Chitos", 3, 150);
        System.out.println(item1.addItem());
        System.out.println(item1.deleteItem());


        Busket busket = new Busket(item1);
        System.out.println(busket);
    }
}