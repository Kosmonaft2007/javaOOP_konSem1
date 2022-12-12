package ru.product;

import java.util.ArrayList;
import java.util.List;

//Создаем объект торговый аппарат
/*
1) приватные поля
2) содаем конструкторы
3) методы get и set (сначала публичные потом приватные )
 */
public class VendingMachine {
    //коллекции которые легко расширяются
    // сосдали ссылку, само объекта не ту
    private List<Product> productList;

    // конструктор метод который сосдает объект текущего класса и прижелаение конст может вызывать другой конст
    // в качестве аргумента можем принять ЛИСТ продукта
    // мы сосзаем абстрактный какой-то любой автома (кофе, батончики и т.д)
    public VendingMachine(List<Product> productList) {
        // сначала super а потом this
        // super(); // вызов конст родительского класасс
        this.productList = productList;
    }

    public VendingMachine() {
        // пустое смотри мэйн строка 10-11
        // this(); //если оставлю скобки, значит сосздаю рекурсивный метод
        this(new ArrayList<>()); // вызываю верхний конструктор
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        //обычно в сетерах проверяют на валидность
        this.productList = productList;
    }

    // метод доавление продуктов
    public void addProduct(Product product) {
        productList.add(product);
    }

    /*
    ТО ЧТО МЫ ПЕРЕОПЛЕДИЛИЛИ И ЕСТЬ ПОЛИМОРФИЗМ

     */
    //    // перегружаем метод  полиформизма ?????????????
//    public  void addProduct (String name, int cost){
//        addProduct(new Product(name, cost));
//
//    }
    // метод будет возвращать список продукто удовлетворяющей цене
    public List<Product> getProductByCost(int cost) {
        List<Product> res = new ArrayList<>();
        for (Product product : productList) {
            // product.getCost() стоимость продукта меньше цены
            if (product.getCost() <= cost) {
                res.add(product);
            }
        }
        return res;
    }
}
