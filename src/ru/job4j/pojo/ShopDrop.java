package ru.job4j.pojo;

public class ShopDrop {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(product.getName());
        }
        products[1] = products[2];
        products[2] = null;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }

    public static Product[] leftShift(Product[] products, int index) {
        products[index] = null;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                for (int j = i + 1; j < products.length; j++) {
                    if (products[j] != null) {
                        products[i] = products[j];
                        products[j] = null;
                        break;
                    }
                }
            }
        }
        return products;
    }
}
