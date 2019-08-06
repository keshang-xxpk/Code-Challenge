import javax.swing.tree.TreeNode;

//Given a binary search tree (See Definition) and a node in it, find the in-order successor of that node in the BST.
//Recursive O(h) solution.
//If the given node has no in-order successor in the tree, return null.
public class Inorder_Successor_in_BST {

    public TreeNode Inorder_Successor_in_BST(TreeNode root, TreeNode p) {
        if (root == null) return null;

        if (root.val <= p.val) {
            return Inorder_Successor_in_BST(root.right, p);
        }

        TreeNode left = Inorder_Successor_in_BST(root.left, p);
        return left == null ? root : left;
    }
}
