public class Conditions {
    
    public static void main(String[] params) {

        if (params.length == 0) {
            System.out.println("Tienes que añadir tu edad en la línea de comandos");
        } else {
            int age = Integer.valueOf(params[0]);
            System.out.println("Tu edad es " + age);
        }
    
    }
}
