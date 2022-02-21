package Mathematics;

public class Digits {

//    1. define sum = 0
//    2. Modulo the number by 10
//    3. add the remainder to sum
//    4. divide the number by 10 (replace the number with quotient)
//    5. Repeat step 2 to 4 till number is greater than 0

  public static int sumOfDigits(int number) {
    int sum = 0;
    while (number>0) {                // O (log n base 10) -> O(d)
      int remainder = number % 10;   // for(int i=n; i>0; i/=2) -> logn base 2
      sum += remainder;
      number = number/10;
    }
    return sum;
  }

//  1. Find the sum of digits
//  2. Check if sum >= 10
//  3. If yes recalculate the sum
//  4. else return the sum

  public static int digitalSum(int number) {
    int sum = sumOfDigits(number); // O(log n base 10) -> O(d) 99999999 = 9*d = 9*logn base 10
    while (sum>=10) {
      sum = sumOfDigits(sum); // -> sum = 9*logn base 10 (worst case)
    }                         // log(sum) -> log(9*log(n)) -> log log n
    return sum;
  }
  // log n base 10 + log log n + log log log n = O(logn)

  public static void main(String[] args) {
    System.out.println(digitalSum(9010));
  }

}
