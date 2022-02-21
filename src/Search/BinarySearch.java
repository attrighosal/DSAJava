package Search;

public class BinarySearch {

  public static void search(int[] array, int target) { // T : O(n), S : O(1)
    int beg = 0, end = array.length-1, mid=0;
    while(beg<=end) {
      mid = (beg+end)/2;
      if(array[mid]==target) {
        System.out.println("Found");
        return;
      }
      else if(array[mid]<target) {
        beg = mid+1;
      }
      else {
        end = mid-1;
      }
    }
  }

  public static void main(String[] args) {
    int[] array = {1,3,4,5,6};
    search(array, 3);
  }
}
