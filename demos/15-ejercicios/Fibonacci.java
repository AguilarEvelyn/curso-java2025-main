import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    private static List<Integer> serie;
    private static int limit;

    private static void calculateFibonacci() {

        int prev = 0, next = 1;
        Fibonacci.serie = new ArrayList<>();

        while (prev <= Fibonacci.limit) {
            Fibonacci.serie.add(prev);
            // int temp = prev + next;
            // prev = next;
            // next = temp;
            next = next + prev;
            prev = next - prev;
        }
    }

    private static void showFibonacci() {
        String message = "Sucesión de Fibonacci (hasta %s):\n";
        System.out.printf(message, Fibonacci.limit);
        for (int item : Fibonacci.serie) {
            System.out.println(item);
        }
    }

    private static void askLimit() {
        String message = "Indica el valor límite para tu serie de Fibonacci";
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        Fibonacci.limit = scanner.nextInt();
        // scanner.close();
    }

    private static void askContinue() {
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;

        String[] messages = {
                "¿Quieres continuar (S/N)?",
                "Gracias por todo"
        };

        while (wantContinue) {
            askLimit();
            calculateFibonacci();
            showFibonacci();
            System.out.println(messages[0]);
            String answer = scanner.nextLine();
            if (answer.toLowerCase().equals("n") ||
                    answer.toLowerCase().equals("no")) {
                wantContinue = false;
            }
        }

        scanner.close();
        System.out.println(messages[1]);
    }

    public static void main(String[] args) {
        askContinue();
    }
}
