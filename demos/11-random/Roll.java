import java.util.Random;
import java.util.Scanner;

public class Roll {

    private static int getDataByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el número que he pensado, del 1 al 10");
        int number = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return number;
    }


    private static void guessRoll (int random) {
        int userNumber = getDataByScanner();
        
        String message = "Fallaste, el número era el " + random;
        if (userNumber == random) {
            message = "Muy bien, acertaste con el " + userNumber;
        }
        System.out.println(message);

    }


    private static void guessRoll2  (int random) {
        int userNumber = getDataByScanner();
    
        String message = (userNumber == random) 
        ? "Muy bien, acertaste con el " + userNumber 
        : "Fallaste, el número era el " + random;

        System.err.println(message);
    }
    
    public static void main(String[] args) {
        Random randomCreator = new Random();
        int random = randomCreator.nextInt(9) + 1;
        // guessRoll(random);
        guessRoll2(random);
    }
}
