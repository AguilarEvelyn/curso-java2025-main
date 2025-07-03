public class Factorial {

    static long calculateFactorial(long number) {
        // if (number < 0) {
        //     number = number * -1;
        // }

        long result = 1;

        for (long i = number; i > 0; i--) {
            result = result * i;
            // result *= i;   
        }
        return result;

    } 

     static long recursiveFactorial(long number) {
        if (number == 1) {
            return number;
        }
        long result = number * recursiveFactorial(number-1);
        return result;
     }    



    public static void main(String[] args) {

        System.out.println(calculateFactorial(10));
        System.out.println(recursiveFactorial(10));
        
    }
    
}
