package ru.product;

// Класс наследование от продуктов для бутылки с жилкостью

// расширять от Продуктов
public class Bottle extends Product {

    private  double volume;
    //создаем конст
    public Bottle(String namePtoduct, double cost, double volume) {
        super(namePtoduct, cost);
        this.volume = volume;
    }

    //что бы видеть поле volume в терминале
//    //это не правильно, плохо мы не видем поля стоимости и наименование
//    @Override
//    public String toString() {
//        return "Bottle{" +
//                "volume=" + volume +
//                '}';
//    }

    @Override
    public String toString() {
        return super.toString() + "volume= " + volume;
    }


}
