package ru.product;

public class HotDrinkProduct extends Product {
    private int temperature;

    public HotDrinkProduct(String namePtoduct, double cost, int temperature) {
        super(namePtoduct, cost);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
