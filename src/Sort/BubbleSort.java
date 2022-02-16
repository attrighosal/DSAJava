package Sort;

import java.util.Arrays;

public class BubbleSort {

  public static void bubbleSort(int[] array) {
    int n = array.length;
    for (int i=0; i<n-1; i++) {
      for (int j=0; j<n-i-1; j++) {
        if (array[j] > array[j+1]) { // -> 1
          int temp = array[j]; // -> 1
          array[j] = array[j+1]; // -> 1
          array[j+1] = temp; // -> 1
        }
      }
    }
    // i = 0 -> 4*(n-1)
    // i = 1 -> 4*(n-2)
    // i = 2 -> 4*(n-3)
    // i = n-1 -> 4*(0)
    //4(0+1+2+....+n-3+n-2+n-1) = 4*n*(n-1)/2 = 2n(n-1)
    // = 2n^2-2n = O(n^2).
    System.out.println(Arrays.toString(array));
  }

  public static void main(String[] args) {
    int [] array = {8,6,-5,4,-3,2,1};
    bubbleSort(array);
  }
}
