package BitManipulation;

public class BitReversal {

  public static void reverse(int decimal) {
    int[] array = new int[50];
    int index=0;
    while (decimal > 0) {  // for(;decimal>0; decimal/=2) -> log n base 2
      int bit = decimal%2;
      decimal /= 2;
      array[index] = bit;
      index++;
    }
    int reversed = 0;
    for(int i=0; i<index; i++) { // number of bits = log n base 2
      reversed = reversed << 1;
      reversed += array[i];
    }
    System.out.println("Reversed number = "+reversed);
  }

  public static void main(String[] args) {
    reverse(6);
  }
}
