public class Operators {


    // Operadores -> expresiones

    // Asignación

    // =

    // Aritméticos

    // +
    // -
    // *
    // /
    // %

    // Copmaración -> expresión boolean    

    // ==
    // !=
    // .equals()
    // > >=
    // < <=

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 == num2); // igual -> false
        System.out.println(num1 != num2); // no igual -> true
        System.out.println(num1 > num2); // mayor que -> false
        System.out.println(num1 < num2); // menor que -> true

        String s1 = "Pepe";
        String s2 = "Pepa";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }

}
