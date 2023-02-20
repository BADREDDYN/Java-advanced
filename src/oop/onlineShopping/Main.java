package oop.onlineShopping;

public class Main {

    public static void main(String[] args) {

        Product product47 = new Product("id79415", "Key board n14895", 499.99f, 5);

        Cart myCart = new Cart();
        myCart.addProduct(product47);

        myCart.showProducts();

        System.out.println(
                "Total costs: " +
                        myCart.totalCost() +
                        " DH."
        );

        System.out.println(
                "Total costs: " +
                        myCart.checkout() +
                        " DH."
        );

    }
}
