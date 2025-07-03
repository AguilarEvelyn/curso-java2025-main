public class Shapes {

    // Sobrecarga de funciones (Overload)

    public static double calculateArea (double side) {
        return side * side;
    }

     public static double calculateArea (double base, double height) {
        return base * height;
    }

    public static double calculateArea (double base, double height, boolean isTriangle) {
        return (base * height) / 2;
    }

    public static void main(String[] args) {
       
        System.out.println(calculateArea(2));
        System.out.println(calculateArea(2, 5));
        System.out.println(calculateArea(2, 5, true));

    
    }

}
