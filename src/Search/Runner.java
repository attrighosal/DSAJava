package Search;

public class Runner {
  public static void main(String[] args) {
    int[] array = {1,2,3,4,5,6,7};
//    LinearSearch ls = new LinearSearch();
//    ls.search(array, 7);
    RecursiveBinarySearch rbs = new RecursiveBinarySearch();
    rbs.search(array, 7);
  }
}
