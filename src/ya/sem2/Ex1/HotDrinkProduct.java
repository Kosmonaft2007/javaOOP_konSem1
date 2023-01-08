package ya.sem2.Ex1;

public class HotDrinkProduct extends Product {
    private int temperature;

    public HotDrinkProduct(String name, int temperature) {
        super(name); //родительский класс
        this.temperature = temperature; // температуру запоминаем здесь
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {

        return "HotDrinkProduct{" +
                "name=" + getName() + // name  не можем так как поле родителя
                "temperature=" + temperature +
                '}';
    }
}
