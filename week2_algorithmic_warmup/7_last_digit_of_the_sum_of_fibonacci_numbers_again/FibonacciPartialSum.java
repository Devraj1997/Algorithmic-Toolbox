import java.util.*;

public class FibonacciPartialSum {
    private static long getFibonacciPartialSumNaive(long from, long to) {
        long sum = 0;

        long current = 0;
        long next  = 1;
        long mod = 100;
        for (long i = 0; i <= to; ++i) {
            if (i >= from) {
                sum += current;
                sum %= mod;
            }

            long new_current = next;
            next = next + current;
            current = (new_current % mod);
        }

        return sum % 10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getFibonacciPartialSumNaive(from, to));
    }
}

