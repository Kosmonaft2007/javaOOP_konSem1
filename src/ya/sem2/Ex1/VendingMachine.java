package ya.sem2.Ex1;

import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    // поиск продуктов по температуре (по характеристикам)
    public Product findProduct(String name, int temperature) throws IllegalAccessException {
        for (Product product : products) {
            /*
            так как в родительский клас не можем вписать "temperature"  и getTemperature, тогда делаем проверку
            не является этот товар этого типа
            // делаем Daumcast (даумкаст) ---- смотри ниже
             */
            if (!(product instanceof HotDrinkProduct))
                continue;
            /*
            !!!!   if (product.name == name && products.temperature == temperature)
            обращаться к "name" на прямую не может так как поле привтное, обращаемся через getName
            и строки проверяют на равенство "==" а с помощью ".equals(name)"
             */
            if (product.getName().equals(name) &&
                    ((HotDrinkProduct) product).getTemperature () == temperature) // делаем Daumcast (даумкаст)
                return product;
        }
        throw new IllegalAccessException("Товар не найден");
        // return null;

    }
}
