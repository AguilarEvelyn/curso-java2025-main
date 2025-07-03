import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciParams {

    private static List<Integer> calculateFibonacci(int limit) {

        int prev = 0, next = 1;
        List<Integer> serie = new ArrayList<>();

        while (prev <= limit) {
            serie.add(prev);
            // int temp = prev + next;
            // prev = next;
            // next = temp;
            next = next + prev;
            prev = next - prev;
        }

        return serie;
    }

    private static void showFibonacci(int limit, List<Integer> serie) {
        String message = "Sucesión de Fibonacci (hasta %s):\n";
        System.out.printf(message, limit);
        for (int item : serie) {
            System.out.println(item);
        }
    }

    private static int askLimit() {
        String message = "Indica el valor límite para tu serie de Fibonacci";
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int limit = scanner.nextInt();
        // scanner.close();
        return limit;
    }

    private static void askContinue() {
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;

        String[] messages = {
                "¿Quieres continuar (S/N)?",
                "Gracias por todo"
        };

        while (wantContinue) {
            int limit = askLimit();
            List<Integer> serie =  calculateFibonacci(limit);
            showFibonacci(limit, serie);
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
