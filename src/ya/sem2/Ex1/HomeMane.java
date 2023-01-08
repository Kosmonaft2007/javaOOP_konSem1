package ya.sem2.Ex1;

import java.util.*;

public class HomeMane {
    public static void main(String[] args) throws IllegalAccessException {
        VendingMachine machine = new VendingMachine (Arrays.asList(
                new Product("Закупка "),
                new HotDrinkProduct("Cola", 15),
                new HotDrinkProduct("Pepsi", 16),
                new HotDrinkProduct("Fanta", 17)
                ));
        System.out.println(machine.findProduct("Cola", 15));
    }
}
