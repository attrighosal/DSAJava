package BitManipulation;

public class BitInversion {

  // Given a number n invert the bits
  // 25,7 = 0011001 -> 1100110 = 102
  public static void invert(int decimal, int places) {
    int[] array = new int[50];
    int index=0;
    int inverted = 0;
    while (decimal > 0) {  // for(;decimal>0; decimal/=2) -> log n base 2
      int bit = decimal%2;
      decimal /= 2;
      array[index] = bit;
      index++; // 5
    } // 11001 -> 1001100
    while (index < places) { // place, logn = places O(places)
      array[index] = 0;
      index++;
    }
    for (int i=index-1; i>=0; i--) {
      array[i] = array[i]^1; // 0 -> 0^1 = 1, 1->1^1=0
      inverted = inverted<<1;
      inverted += array[i];
    }
    System.out.println("Inverted Number = "+inverted);
  }

  public static void main(String[] args) {
    invert(25,7);
  }
}
