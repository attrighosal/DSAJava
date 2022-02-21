package BitManipulation;

public class DecimalToBinary {

  public static void decimalToBinary(int decimal) {
    int[] binary = new int[50];
    int index = 0;
    while(decimal>0) {
      binary[index] = decimal%2;
      decimal = decimal/2;
      index++;
    }
    for (int i=index-1; i>=0; i--) {
      System.out.print(binary[i]);
    }
    System.out.println();
  }

  public static void main(String[] args) {
    decimalToBinary(25);
  }
}
