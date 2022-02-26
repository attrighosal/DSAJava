package Trees;

public class BST {

  public TreeNode root;

  private TreeNode recursiveInsert(TreeNode node, int val) {
    if (node==null) {
      return new TreeNode(val);
    }
    if (val < node.val) {
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
    for (int i=0; i< array.length; i++) {
      root = recursiveInsert(root, array[i]);
    }
  }

  public void inOrderTraversal(TreeNode node) {
    if(node==null) {
      return;
    }
    inOrderTraversal(node.left);
    System.out.print(node.val+" ");
    inOrderTraversal(node.right);
  }

  public boolean search(TreeNode node, int target) {
    if (node==null) {
      return false;
    }
    if (target==node.val) {
      return true;
    }
    else if (target< node.val) {
      return search(node.left, target);
    }
    else {
      return search(node.right, target);
    }
  }

  public TreeNode lca(TreeNode node, int val1, int val2) {
    if (node==null) {
      return null;
    }
    if (node.val == val1 || node.val == val2) {
      return node;
    }
    TreeNode left = lca(node.left, val1, val2);
    TreeNode right = lca(node.right, val1, val2);
    if (left != null && right != null) {
      return node;
    }
    else if (left != null) {
      return left;
    }
    return right;
  }

  public static void main(String[] args) {
    int[] array = {3,1,2,5,4,6};
    BST bst = new BST();
    bst.constructBST(array);
//    bst.inOrderTraversal(bst.root);
//    System.out.println(bst.search(bst.root, 3));
//    System.out.println(bst.search(bst.root, 8));
    System.out.println(bst.lca(bst.root, 4, 6).val);
    System.out.println(bst.lca(bst.root, 2, 4).val);
  }
}
