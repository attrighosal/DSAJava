package BitManipulation;

public class OddChecker {
  public static boolean isOdd(int n){
    if (n%2==0) {
      return false;
    }
    else {
      return true;
    }
  }

  public static void main(String[] args) {
    System.out.println(isOdd(1));
  }
}
