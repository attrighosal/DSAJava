package BitManipulation;

public class MissingElement {

  public static int missingElement(int n, int[] array) {
    int xorWhole = 0, xorArray=0;
    for (int i=1; i<=n; i++) {
      xorWhole = xorWhole^i;
    }
    for (int i=0; i<n-1; i++) {
      xorArray = xorArray^array[i];
    }
    return xorWhole^xorArray;
  }

  public static void main(String[] args) {
    int[] array = new int[] {5,6,3,1,2};
    System.out.println(missingElement(6, array));
  }
}
