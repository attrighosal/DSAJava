package Sort;

import java.util.Arrays;

public class SelectionSort {

  public static void selectionSort(int[] array) {
    int n = array.length;
    for (int i=0; i<n-1; i++) {
      // Find the smallest between i and n-1
      int smallest_index = i;
      for (int j=i; j<n; j++) {
        if (array[j]<array[smallest_index]) {
          smallest_index = j;
        }
      }
      int temp = array[i];
      array[i] = array[smallest_index];
      array[smallest_index] = temp;
    }
    // i=0, j->n
    // i=1, j->n-1
    // i=2, j->n-2
    // i=n-2, j->2
    // (2+3+...+n) = (1+2+3+..(n-2)+(n-1)+(n) -1) = n(n+1)/2 - 1 = n^2/2 + n/2 - 1 = O(n^2)
    System.out.println(Arrays.toString(array));
  }

  public static void main(String[] args) {
    int [] array = {8,6,-5,4,-3,2,1};
    selectionSort(array);
  }
}
