package ya.sem2.Shape;

public class SquareShape extends Shape{
    private float side;

    public SquareShape(float side) {
        this.side = side;
    }

    /*
        создали два метода так ка родитель абстрактный
         */
    @Override
    public float getArea() {
        return side * side; // прием вычислимое поле
    }

    @Override
    public float getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "SquareShape{" +
                "side=" + side +
                '}';
    }
}


/*
 есть два приема
 - Хранимое поле - хорош что мы можем настроить переменную area в конструкторе и контролировать
class Square extends Shape{
    - нам его далили -
    private float area;

    - мы его сохранили в конструкторе -
    public Shape(float area) {this.area = area;}

    - мы его ретерним-
    public  float getArea () { return area;}
}

 - вычислимое поле - хорош что позволяет создовать илюзию что есть ГЕТ метод, при этом мы не знаем что за ним,
 можем используем в наследование

class Square extends Shape{
    private float side; - хранимое поле

- мы его сохранили в конструкторе -
    public Shape(float area) {this.area = area;}


    - Area вычесляется на его основе
    public  float getArea () { return 20f;}
    или
    public  float getArea () { return side * side;}
    }
 */
