package Trees;

public class BinaryTree {
  public Node root;

  private Node recursive_create(int[] array, int index) {
    if(index >= array.length) {
      return null;
    }
    Node node = new Node(array[index]);
    node.left = recursive_create(array, 2*index+1);
    node.right = recursive_create(array, 2*index+2);
    return node;
  }

  public Node createTree(int[] array) {
    if (array.length==0) {
      return null;
    }
    root = recursive_create(array, 0);
    return root;
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
    int[] array = {5,8,3,9,10};
    BinaryTree bt = new BinaryTree();
    bt.createTree(array);
    bt.inOrderTraversal(bt.root);
  }
}
