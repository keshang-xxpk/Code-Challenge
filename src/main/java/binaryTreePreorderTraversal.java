import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import

//Given a binary tree, return the preorder traversal of its nodes' values.
public class binaryTreePreorderTraversal{
    /**
     * @param root: A Tree
     * @return: Preorder in ArrayList which contains node values.
     */
    //traverse
    public List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        traverse(root,result);
        return result;
    }

    public void traverse(TreeNode root,ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        traverse(root.left,result);
        traverse(root.right,result);
    }
}
