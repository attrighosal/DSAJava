package Search;

public class RecursiveBinarySearch {

  private void search_recursive(int[] array, int target, int beg, int end) {
    if (beg>end) { // O(log n base 2)
      return;
    }
    int mid = (beg+end)/2;
    if (array[mid]==target) {
      System.out.println("Found");
      return;
    }
    else if (array[mid]<target) {
      search_recursive(array, target, mid+1, end);
    }
    search_recursive(array, target, beg, mid-1);
  }

  public void search(int[] array, int target) {
    search_recursive(array, target, 0, array.length-1);
  }
}
