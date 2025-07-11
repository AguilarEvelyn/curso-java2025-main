package local.collections.exercices.Ex14;

import java.util.ArrayList;
import java.util.List;

public class AreCalculate {
     static double sumAreas(List<Shape> shapes) {
        double total = 0.0;
        for (Shape shape : shapes) {
            System.out.println("---------------------");
            System.out.println("Calculando área de: " + shape);
            total += shape.calculateArea();
        }
        return total;
    }

    public static void main(String[] args) {
    List<Shape> shapes =  new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));
        shapes.add(new Triangle(3, 4));

        double totalArea = sumAreas(shapes);
        System.out.println("--------------------");
        System.out.println("Total area de cada figura: " + totalArea);
    }
}
