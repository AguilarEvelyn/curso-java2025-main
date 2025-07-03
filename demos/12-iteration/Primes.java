import java.util.Scanner;

public class Primes {

    public static int getDataByScanner(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int number = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return number;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void showInfo(int number) {
        String message = isPrime(number)
                ? "%s SI es primo"
                : "%s NO es primo";
        System.out.printf(message, number);
    }

    public static void main(String[] args) {
        String message = "Dime un número para ver si es primo";
        int number = getDataByScanner(message);
        showInfo(number);
        //showInfo(getDataByScanner());
    }

}
