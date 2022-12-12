package ru.product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Вейдинг аппарат строка 18 второй конструктор
        List<Product> list = new ArrayList<>();
        VendingMachine vendingMachine = new VendingMachine(list) ;
         */
        VendingMachine vendingMachine = new VendingMachine();
        // в продукте нужно сосздать конструтор для - new Product("Alpen Gold", 80);
        Product product1 = new Product("Alpen Gold", 80);
        Product product2 = new Product("Mico", 80);
        Product product3 = new Bottle("Fanta", 80, 2);
        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);


        System.out.println("Hello VendingMachine!");

        System.out.println(vendingMachine.getProductByCost(100));


    }
}