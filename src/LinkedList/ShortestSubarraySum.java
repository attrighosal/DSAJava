package LinkedList;

public class ShortestSubarraySum {

  public static int shortestSubarraySum(int[] array, int target) {
    int ans = array.length+1;
    int size = 0;
    int sum = 0;
    int i=0;
    Queue q = new Queue();
    while (i<array.length || sum>=target) {
      if (sum<target) {
        q.enqueue(array[i]);
        size++;
        sum += array[i];
        i++;
      }
      if (sum==target) {
        ans = Math.min(ans, size);
        int dq = q.dequeue();
        sum -= dq;
        size--;
      }
      else if (sum>target) {
        int dq = q.dequeue();
        sum -= dq;
        size--;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] array = {1,1,5,2,3,3,1,7};
    int sp = shortestSubarraySum(array, 7);
    System.out.println(sp);
  }
}
