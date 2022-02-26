package Trees;

public class BinaryTree {
  public TreeNode root;

  private TreeNode recursive_create(int[] array, int index) {
    if (index>= array.length) {
      return null;
    }
    TreeNode node = new TreeNode(array[index]); // Create a node
    node.left = recursive_create(array, 2*index+1);
    node.right = recursive_create(array, 2*index+2);
    return node;
  }

  public TreeNode createTree(int[] array) {
    root = recursive_create(array, 0);
    return root;
  }

  public void inOrderTraversal(TreeNode node) {
    if (node==null) {
      return;
    }
    inOrderTraversal(node.left);
    System.out.print(node.val+" ");
    inOrderTraversal(node.right);
  }

  private int recursiveSum(TreeNode node) {
    if (node == null) {
      return 0;
    }
    int left = recursiveSum(node.left);
    int right = recursiveSum(node.right);
    return left + right + node.val;
  }

  public int sum() {
    return recursiveSum(root);
  }

  public static void main(String[] args) {
    int[] array = {28,10,54,38,43,3,5};
    BinaryTree bt = new BinaryTree();
    bt.createTree(array);
    bt.inOrderTraversal(bt.root);
//    int sum = bt.sum();
//    System.out.println("Sum : "+sum);
  }
}
