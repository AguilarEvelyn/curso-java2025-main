import java.util.ArrayList;
import java.util.List;

public class PrimesList {

    private static void showPrimes(List<Integer> numbers) {
        // for (int i = 0; i < numbers.size(); i++) {
        //     System.out.println(numbers.get(i));
        // }

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static List<Integer> calculatePrimes(int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (Primes.isPrime(i)) {
                result.add(i);
            }
        }
        return result;
    }
    
    
    
    public static void main(String[] args) {
        String message = "Dime un número para obtener todos los primos menores que el";
        int number = Primes.getDataByScanner(message);
        // showPrimes(number);
        List<Integer> numbers = calculatePrimes(number);
        showPrimes(numbers);
    }

}
