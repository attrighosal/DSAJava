package LinkedList;

public class CircularLinkedList {

  private Node head;

  public void addBegin(int val) {
    Node newNode = new Node(val);
    if (head==null) { // No elements
      head = newNode; // 1
      newNode.next = newNode; // Make cyclic connection
    }
    else {
      Node iterator = lastNode();
      iterator.next = newNode; // last node.next = new node
      newNode.next = head; // connecting new node to head
      head = newNode; // pointing head to new node
    }
  }

  public void addEnd(int val) {
    Node newNode = new Node(val);
    if (head==null) {
      head = newNode;
      newNode.next = newNode;
    }
    else {
      Node iterator = lastNode();
      iterator.next = newNode;
      newNode.next = head;
    }
  }

  private Node lastNode() {
    Node iterator = head; // init
    while (iterator.next != head) { // we are iterating till the last node
      iterator = iterator.next;
    }
    return iterator;
  }
}
