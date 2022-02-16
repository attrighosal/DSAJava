package Sort;

import java.util.Arrays;

public class QuickSort {

  public static int partition(int[] array, int beg, int end) {
    int pivot = end, cnm=beg;   // initialise pivot, cnm->beg
    for(int i=beg; i<pivot; i++) {  // to loop through beg to pivot-1
      if(array[i]<array[pivot]) {   // if element is less than pivot perform swap
        int temp = array[cnm];      // with cnm element
        array[cnm] = array[i];
        array[i] = temp;
        cnm++;                    // incrementing the cnm position
      }
    }
    int temp = array[pivot];      // swap the pivot element with cnm
    array[pivot] = array[cnm];
    array[cnm] = temp;
    return cnm;                 // return the cnm as sorted pivot position
  }
  private static void quickSort(int[] array, int beg, int end) {
    if (beg<end) {  // only if there are more than 1 elements
      int p = partition(array, beg, end); // pivot element in right place
      quickSort(array, beg, p - 1); // sort left sub array
      quickSort(array, p + 1, end); // sort right sub array
    }
  }

  public static void sort(int[] array) {
    quickSort(array, 0, array.length-1);
  }

  public static void main(String[] args) {
    int[] array = {38,27,43,3,9,82,10};
    sort(array);
    System.out.println(Arrays.toString(array));
  }
}
