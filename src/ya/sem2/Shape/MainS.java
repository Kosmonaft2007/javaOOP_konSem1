package ya.sem2.Shape;

import java.util.ArrayList;
import java.util.List;

public class MainS {
    public static void main(String[] args) {
        // List абстрактный класс и только new ArrayList а не new List
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new SquareShape(10));
        shapes.add(new CircleShape(20));
        shapes.add(new CircleShape(1));
        for (Shape shape : shapes) {
                                        // сама фигу shape, из него извлечь getArea() из него извлечь getPerimeter
            System.out.printf("%s area=%f perimeter=%f\n", shape, shape.getArea(), shape.getPerimeter());
        }
    }
}
