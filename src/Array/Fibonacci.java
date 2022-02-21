package Array;

public class Fibonacci {

  public static int fibonacci(int n) {
    int a=0, b=1, c=0;
    System.out.print(a+" ");
    System.out.print(b+" ");
    for (int i=2; i<=n; i++) {
      c = a+b;
      System.out.print(c+" ");
      a = b;
      b = c;
    }
    return c;
  }

  public static void main(String[] args) {
    fibonacci(7);
  }
}
