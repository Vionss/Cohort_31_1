public class Main {
    public static void main(String[] args){
        /*
        Допустим, мы пишем on-line магазин. У нас есть класс Товар ( придумайте, какие поля должны быть). Реализуйте класс Корзинка, в которую можно добавить несколько товаров. Реализовать метод добавления и добавления товара в корзину. Реализовать метод, который распечатает весь заказ. Реализовать метод, который вернет сумму заказа.
         */
        Product [ ]array = {
                new Product( " Product title 1", 8.6),
                new Product( " Product title 2", 81.3),
                new Product (" Product title 3", 10.5),
                new Product( " Product title 4", 1.6),
                new Product( " Product title 5", 4.2),
                new Product( " Product title 6", 3.6),
                new Product( " Product title 7", 4.0),
                new Product( " Product title 8", 8.6),
          };

        Cart cart = new Cart();
        cart.add(array[0]);
        cart.add(array[2]);
        cart.add(array[6]);
        System.out.println(cart);

        cart.removeByID(3);
        System.out.println(cart);

        System.out.println("Quantity:"+cart.quantity());
        System.out.println("Amount:"+cart.sum());


        System.out.println("======================================");

        Product p1 = new Product(" Product title 2", 81.3);
        Product p2 = new Product(" Product title 3", 10.5);



        System.out.println(p1);
        p1.temp=10;
        System.out.println(p2);

        Product.print();

        StaticDemo.printMsg("this is message");
    }
}