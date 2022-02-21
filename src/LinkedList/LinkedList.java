package LinkedList;

import Stack.Stack;

public class LinkedList {

  public Node head;

  public LinkedList() {
    this.head = null;
  }

  public void addBegin(int val) { // TC : O(1) SC: O(1)
    Node newNode = new Node(val); // Create a new node -> 1
    newNode.next = head; // link new node to existing head -> 1
    head = newNode; // Point head to the new node -> 1
  }

  public void addEnd(int val) { // TC: O(n) SC: O(1)
    if (head==null) {
      addBegin(val);
      return;
    }
    Node newNode = new Node(val); // Create a new node -> 1
    Node iterator = head; // -> 1
    while (iterator.next != null) { // number of elements
      iterator = iterator.next; // 1
    }
    iterator.next=newNode; // 1
  }

  public void display() {
    System.out.print("List : ");
    Node iterator = head;
    while (iterator != null) {
      System.out.print(iterator.val + " ");
      iterator = iterator.next;
    }
    System.out.println();
  }

  public void displayReverse() {
    Node iterator = head;
    Stack stack = new Stack();
    while (iterator != null) {
      stack.push(iterator.val);
      iterator = iterator.next;
    }
    stack.display();
    System.out.print("List in Reverse Order : ");
    while (!stack.isEmpty()) {
      int val = stack.pop();
      System.out.print(val+" ");
    }
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList(); // creates a new ll, head->null
//    ll.addBegin(0); // head -> val=0
//    ll.addBegin(1); // list : head -> 1 -> 0 -> null
    ll.addEnd(0);
    ll.addEnd(1);
    ll.addEnd(2); // 1->0->2
    ll.addEnd(3);
    ll.addEnd(4);
    ll.addEnd(5);
    ll.display(); // print head val
    ll.displayReverse();
  }
}
