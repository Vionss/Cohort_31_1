public class Main {
    public static void main(String[] args) {

        Items [] groceries = {
                new Groceries("Apple", 2),
                new Groceries("Pineapple", 4),
                new Groceries("Banana", 3)
        };

        Items [] electronics = {
                new Electronics("Fridge", 600),
                new Electronics("Wash machine", 500),
                new Electronics("Air conditioner", 400),
        };

        Items [] clothes = {
                new Clothes("Pants", 40),
                new Clothes("Shirt", 30),
                new Clothes("Shorts", 20)
        };

        Cart cart = new Cart();

        cart.add(electronics[0]);
        cart.add(electronics[2]);
        cart.add(groceries[0]);
        cart.add(clothes[1]);

        System.out.println(cart);

        electronics[0].buy();

        System.out.println("------------------------------");

        groceries[1].buy();

        clothes[1].buy();

        System.out.println("-------------------------------");


        cart.placeOrder();

    }
}