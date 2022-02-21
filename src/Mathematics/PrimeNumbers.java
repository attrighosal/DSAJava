package Mathematics;

public class PrimeNumbers {

//  1. Iterate from 2 to number-1 (i)
//  2. Check if number%i == 0
//  3. If yes return false
//  4. if not continue
//  5. After iteration return true

  public static boolean isPrime(int number) {
    for (int i=2; i<=(int)Math.sqrt(number); i++) { //  Time complexity = O(sqrt(number))
      if (number%i==0) {
        System.out.println("The factor dividing "+number+" is "+i);
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPrime(31));
  }
}
