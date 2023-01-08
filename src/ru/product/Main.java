package ru.product;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        /*
        Вейдинг аппарат строка 18 второй конструктор
        List<Product> list = new ArrayList<>();
        VendingMachine vendingMachine = new VendingMachine(list) ;
         */

        // ПЕРВЫЙ ВАРИАН
//        VendingMachine vendingMachine = new VendingMachine();
//        // в продукте нужно сосздать конструтор для - new Product("Alpen Gold", 80);
//        Product product1 = new Product("Alpen Gold", 80);
//        Product product2 = new Product("Mico", 80);
//        Product product3 = new BottleProduct("Fanta", 80, 2);
//        vendingMachine.addProduct(product1);
//        vendingMachine.addProduct(product2);
//        vendingMachine.addProduct(product3);

        // ВТОРОЙ ВАРИАН
        VendingMachine vendingMachine = new VendingMachine(Arrays.asList(
                new Product("Alpen Gold", 80),
                new BottleProduct("Fanta", 80, 2),
                new HotDrinkProduct("Fanta", 80, 2)
        ));


        System.out.println("Hello VendingMachine!");

        System.out.println(vendingMachine.getProductByCost(100));
        System.out.println(vendingMachine.findProduct("Fanta", 80));


    }
}