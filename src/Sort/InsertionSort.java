package Sort;

import java.util.Arrays;

public class InsertionSort {

  public static void insertionSort(int[] array) {
    int n = array.length;
    for (int i=0; i<n; i++) { // -> 1 * n
      int j = i; // -> 1 * n
      while (j>0 && array[j]<array[j-1]) { // i
        int temp = array[j];  // -> 1
        array[j] = array[j-1]; // -> 1
        array[j-1] = temp; // -> 1
        j--; // -> 1
      }
    }
    // i = 0, -> 1
    // i = 1, -> 1 + 4
    // i = 2 -> 1 + 4*2
    // i = 3 -> 1 + 4*3
    // i = k -> 1+4k
    // i = n-1 -> 1+ 4*(n-1)
    // sum = n + 4*(0+1+2+...+n-1) = n + 4*(n*(n-1))/2 = n+2n^2-2n=2n^2-n
    // Time Complexity : O(n^2)
    // Best Case : O(n) 3*n
    System.out.println(Arrays.toString(array));
  }

  public static void main(String[] args) {
    int[] array = {5,8,3,2,1,6};
    insertionSort(array);
  }
}
