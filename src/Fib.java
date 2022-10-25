public class Fib {

    /**
     * This is the Fibonacci iterative function. The function sums the two most recent numbers and calculates the time it takes to process.
     * @param n n is how far you want to take the Fibonacci sequence to
     */
    public static void FibIterative(int n) {

        int num1 = 0;
        int num2 = 1;
        int num3 = 0;

        System.out.print(num1 + " " + num2);
        long startTime = System.nanoTime();
        long elapsed = 0;

        for (int i = 2; i < n; i++) {
            num3 = num1 + num2;
            //System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
            elapsed = System.nanoTime() - startTime;
            System.out.print(" " + i + " " + elapsed);
        }
    }

    /**
     * The is the Fibonacci recursive function. The function returns the sum of the two most recent numbers
     * @param n n is how far you want to take the Fibonacci sequence to.
     * @return Return the sum of the most recent and the prior number
     */
    public static int FibRecursive(int n) {
        if (n==0) {
            return 0;
        }

        if (n==1 || n==2) {
            return 1;
        }
        return FibRecursive(n-1) + FibRecursive(n-2);
    }

    /**
     * This is the main method.
     * @param args  Strings passed into the main method.
     */
    public static void main(String[] args) {
        FibIterative(40);

        long startTime = System.nanoTime();
        long elapsed = 0;

        for (int i = 0; i < 40; i++) {
            FibRecursive(i);
            elapsed = System.nanoTime() - startTime;
            System.out.print(" " + i + " " + elapsed);
        }
    }
}
