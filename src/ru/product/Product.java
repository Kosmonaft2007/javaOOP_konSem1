package ru.product;

public class Product {
    /*
1) приватные поля
2) содаем конструкторы
3) методы get и set (сначала публичные потом приватные )
 */
    private String namePtoduct;
    private double cost;

    /*
    если прописываем аргументы то сеторы не нужны
      public Product(String namePtoduct, double cost) {
            this.namePtoduct = namePtoduct;
            this.cost = cost;
        }
     */

    public Product(String namePtoduct, double cost) {
        this.namePtoduct = namePtoduct;
        this.cost = cost;
    }

    public String getNamePtoduct() {
        return namePtoduct;
    }

    public void setNamePtoduct(String namePtoduct) {
        this.namePtoduct = namePtoduct;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        }
    }

//    // Override - переопределение
//    @Override
//    public String toString() {
//        return super.toString();
//    }

    // правой кнопкой -> Generator -> toString
    @Override
    public String toString() {
        return "Product{" +
                //название поля + его значение
                "namePtoduct='" + namePtoduct + '\'' +
                ", cost=" + cost +
                '}';
    }
}
