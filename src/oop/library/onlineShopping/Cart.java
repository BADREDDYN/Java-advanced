package oop.library.onlineShopping;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> purchases = new ArrayList<>();


    Boolean addProduct(Product product) {
        return purchases.add(product);
    }

    Boolean removeProduct(Product product) {
        return purchases.remove(product);
    }

    void showProducts() {
        for (Product product:purchases) {
            System.out.println(product);
        }
    }

    Float totalCost() {
        return purchases.stream().map(Product::getPrice).reduce(0f, Float::sum);
    }

    Float checkout() {
        Float totalCost = totalCost();
        purchases = new ArrayList<>();
        return totalCost;
    }

}
