package LinkedList;

public class Queue {

  private Node start;
  private Node end;

  public void enqueue(int val) { // TC : O(1)
    Node newNode = new Node(val); // -> 1
    if (start==null) { // -> 1
      start = newNode; // -> 1
      end = newNode; // -> 1
    }
    else {          // -> 1
      end.next = newNode; // -> 1
      end = newNode;      // -> 1
    }
  }

  public int dequeue() { // TC: O(1)
    if (start==null) {
      System.out.println("Empty Queue");
      return -1;
    }
    int dq = start.val;
    start = start.next;
    if (start==null) {
      end = null;
    }
    return dq;
  }

  public void display() { // TC : O(n)
    System.out.print("Current Queue : ");
    Node iterator = start;
    while(iterator != null) {
      System.out.print(iterator.val+" ");
      iterator = iterator.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    q.display();
    q.enqueue(5);
    q.display();
    q.enqueue(6);
    q.display();
    q.enqueue(8);
    q.display();
    q.dequeue();
    q.display();
  }
}
