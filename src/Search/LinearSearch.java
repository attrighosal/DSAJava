package Search;

public class LinearSearch {

  private void search_recursive(int[] array, int target, int index) {
    if (index==array.length) {
      return;
    }
    else if (array[index]==target) {
      System.out.println("Found");
      return;
    }
    search_recursive(array, target, index+1);
  }

  public void search(int[] array, int target) {
    search_recursive(array, target, 0); // O(n->size of the array) O(n)
  }
}
