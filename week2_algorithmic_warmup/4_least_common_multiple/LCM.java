import java.util.*;

public class LCM {
  private static long lcm_naive(int a, int b) {
    long gcd = a > b ? gcd(a,b) : gcd(b,a);
    long product = ((long)a) * b;
    return product/gcd;
  }

  private static int gcd(int a, int b) {
    if(b==0) return a;
    return gcd(b, a%b);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println(lcm_naive(a, b));
  }
}
