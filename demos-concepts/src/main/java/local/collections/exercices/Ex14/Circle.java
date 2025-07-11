package local.collections.exercices.Ex14;

/*
 * [14]. Escriba un método que reciba una lista de objetos de clase figura (con subclases círculo, rectángulo, triángulo) 
 * y devuelva la suma de las áreas de todas las figuras.
 */
public class Circle implements Shape {
   double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

}
