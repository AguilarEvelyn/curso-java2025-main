public class Statistic {


    static int sumAllArray(int[] data) {
        int sum =  0;
        for (int i : data) {
            sum = sum + i;
            // sum += i;
        }
        return sum;
    } 


    static double averageArray(int[] data) {
       double avg = (double)sumAllArray(data) / data.length;
       return avg;
    }


    static double average(int...args ) {
        return averageArray(args);
    }

    public static void main(String[] args) {

        int[] data = {2,3,4,7,6,3,5,8,1,2,76};
        int sum = sumAllArray(data);
        double avg = averageArray(data);
        System.out.println("La suma es " + sum);
        System.out.println("La media es " + avg);


        double avg2 = average(2,3,4,6,8,9,2,7);
        System.out.println("La media es " + avg2);
        

    }

    
}
