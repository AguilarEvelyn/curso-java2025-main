import java.util.Scanner;

public class AgeGreetings {


    static int getAgeByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int age = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return age;
    }

    static int gatAgeByArgs (String[] args) {
        
        if (args.length == 0) {
            System.out.println("Tienes que añadir un entero en la línea de comandos");
            return -1;
        }

        int age = Integer.valueOf(args[0]);
        return age;
    }


    public static void main(String[] args) {

        int age = gatAgeByArgs(args);
        //int age = getAgeByScanner();

        if (age < 0 ) {
            return;
        } else if (age < 18 ) {
            System.out.println("Eres menor de edad");
        }  else if (age < 33) {
            System.out.println("Eres un joven");
        } else if (age < 65) {
            System.out.println("Eres un adulto");
        } else {
            System.out.println("Estas jubilado");
        }
    }

}
