package Sort;

import java.util.Arrays;

public class MergeSort {

  private static int[] merge(int[] left, int[] right) {
    int leftSize= left.length, rightSize= right.length;
    int[] temp = new int[leftSize+rightSize];
    int p1=0, p2=0, index=0;
    while (p1<leftSize && p2<rightSize) {
      if (left[p1]<=right[p2]) {
        temp[index] = left[p1];
        p1++;
      }
      else {
        temp[index] = right[p2];
        p2++;
      }
      index++;
    }
    while (p1<leftSize) {
      temp[index++] = left[p1++];
    }
    while (p2<rightSize) {
      temp[index++] = right[p2++];
    }
    return temp;
  }

  private static int[] mergeSort(int[] array, int beg, int end) {
    if (beg<end) {
      int mid = (beg + end) / 2;
      int[] left = mergeSort(array, beg, mid);
      int[] right = mergeSort(array, mid + 1, end);
      int[] merged = merge(left, right);
      return merged;
    }
    return new int[] {array[beg]};
  }

  public static void search(int[] array) {
    int[] sorted = mergeSort(array, 0, array.length-1);
    System.out.println(Arrays.toString(sorted));
  }

  public static void main(String[] args) {
    int[] array = {38, 27, 43, 3, 9, 82, 10};
    search(array);
  }
}
