package Stack;

public class Stack {

  private int top; // -> 1
  private int[] array; // -> capacity
  private final int capacity=6; // -> 1

  public Stack() {
    this.top = -1;
    array = new int[capacity];
  }

  public void push(int val) { // TC : O(1)
    if (top == capacity-1) {  // -> 1
      System.out.println("Stack Overflow!!"); // -> 1
      return; // -> 1
    }
    top++; // -> 1
    array[top] = val; // -> 1
//    System.out.println("Pushed value "+val+" to stack");
  }

  public int pop() { // TC: O(1)
    if (top == -1) {  // -> 1
      System.out.println("Stack Underflow!!");  // -> 1
      return -1;  // -> 1
    }
    int poppedVal = array[top]; // -> 1
    top--;  // -> 1
//    System.out.println("Popped value "+poppedVal+" from stack");
    return poppedVal; // -> 1
  }

  public boolean isEmpty () {
    return top == -1;
  }

  public void display() {
    System.out.print("Current stack : ");
    for (int i=0; i<=top; i++) {
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }

//  public static void main(String[] args) {
//    Stack stack = new Stack();
//
//    // Edge case 1 : Stack underflow
////    stack.display();
////    stack.pop();
//
//    // Edge Case 2 : Stack Overflow
//    stack.push(6);
//    stack.push(4);
//    stack.push(2);
//    stack.push(1);
//    stack.push(3);
//    stack.push(8);
//    stack.display();
//    stack.push(7);
//
//    // Normal Case
////    stack.push(6);
////    stack.display();
////    stack.push(4);
////    stack.display();
////    stack.pop();
////    stack.display();
//
//  }

}
