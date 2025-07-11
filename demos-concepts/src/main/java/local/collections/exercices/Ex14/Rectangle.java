package local.collections.exercices.Ex14;

/*
 * [14]. Escriba un método que reciba una lista
 *  de objetos de clase figura (con subclases círculo, rectángulo, 
 * triángulo) y devuelva la suma de las áreas de todas las figuras.
 */
public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +

                ", height=" + height +
                '}';
    }
}
