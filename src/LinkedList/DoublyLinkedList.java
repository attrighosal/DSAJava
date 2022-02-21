package LinkedList;

public class DoublyLinkedList {

  private DllNode head;
  private DllNode tail;

  public void addBegin(int val) {
    DllNode newNode = new DllNode(val);
    if (head==null) {
      head = newNode;
      tail = newNode;
    }
    else {
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }
  }

  public void addEnd(int val) {
    DllNode newNode = new DllNode(val);
    if (tail==null) {
      head = newNode;
      tail = newNode;
    }
    else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
  }

  public void forwardDisplay() {
    DllNode iterator = head;
    System.out.print("Forward View : ");
    while (iterator != null) {
      System.out.print(iterator.val+" ");
      iterator = iterator.next;
    }
    System.out.println();
  }

  public void backwardDisplay() {
    DllNode iterator = tail;
    System.out.print("Backward View : ");
    while (iterator != null) {
      System.out.print(iterator.val+" ");
      iterator = iterator.prev;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();
    dll.addBegin(1); // 1
    dll.addBegin(0); // 0,1
    dll.addEnd(2); // 0,1,2
    dll.forwardDisplay();
    dll.backwardDisplay();
  }
}
