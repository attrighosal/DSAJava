package Stack;

import java.util.Stack;

public class DuplicateParenthesis {

  public static boolean duplicateParenthesis(String exp) {
    Stack<Character> stack = new Stack<>();
    for (int i=0; i<exp.length(); i++) {
      char ch = exp.charAt(i);
      if (ch == ')') {
        int count=0;
        while (!stack.peek().equals('(')) {
          stack.pop();
          count++;
        }
        if (count==0) {
          return true;
        }
        stack.pop();
      }
      else {
        stack.push(ch);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    String exp = "((a+b))*c";
    System.out.println(duplicateParenthesis(exp));
  }
}
