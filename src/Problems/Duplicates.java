package Problems;

public class Duplicates {

  public static void findDuplicates(int[] array) {
    int count=0;
    for(int i=0; i<array.length; i++) {
      for(int j=i+1; j< array.length; j++) {
        if(array[i]==array[j]) {
          count++;
        }
      }
      if (count>1) {
        System.out.println(array[i]);
        count=0;
      }
    }
  }

  public static void main(String[] args) {
    int[] array = {1,3,2,2,2,4,5,4,2};
    findDuplicates(array);
  }
}
