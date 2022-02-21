package Stack;

import java.util.Arrays;

public class NextGreaterElement {

  public static int[] nextGreaterElement(int[] input) {
    int n = input.length;
    int[] output = new int[n];
    for (int i=0; i<n; i++) { // iterating over all the elements
      int j=i+1;
      for (; j<n; j++) { // right elements
        if (input[j]>input[i]) {
          output[i] = input[j];
          break;
        }
      }
      if (j==n) {
        output[i] = -1;
      }
    }
    return output;
  }
  // i=0, n-1
  // i=1, n-2
  // i=3, n-3
  // i=n-1, 0
  // sum = n*(n-1)/2
  // TC : O(n^2)

  public static void main(String[] args) {
    int[] input = {10,8,9};
    int[] output = nextGreaterElement(input);
    System.out.println(Arrays.toString(output));
  }
}
