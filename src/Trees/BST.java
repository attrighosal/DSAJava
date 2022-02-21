package Trees;

public class BST {

  public Node root;

  private Node recursiveInsert(Node node, int val) {
    if (node==null) {
      return new Node(val);
    }
    if (node.value>val) {
      node.left = recursiveInsert(node.left, val);
    }
    else {
      node.right = recursiveInsert(node.right, val);
    }
    return node;
  }

  public void constructBST(int[] array) {
    if (array.length==0) {
      return;
    }
    // create a root with 0th element
    for (int i=0; i<array.length; i++) {
      root = recursiveInsert(root, array[i]);
    }
  }

  public void inOrderTraversal(Node node) {
    if(node==null) {
      return;
    }
    inOrderTraversal(node.left);
    System.out.print(node.value+" ");
    inOrderTraversal(node.right);
  }

  public static void main(String[] args) {
    int[] array = {6,5,7,4,2,3,1};
    BST bst = new BST();
    bst.constructBST(array);
    bst.inOrderTraversal(bst.root);
  }
}
