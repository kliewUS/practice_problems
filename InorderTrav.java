import java.util.ArrayList;
import java.util.List;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 //94. Binary Tree Inorder Traversal
// If root is null, then return void.
//Otherwise, traverse the left subtree.
//Then the root node.
//Then the right subtree
public class InorderTrav {
    public void inorderTrav(List<Integer> list, TreeNode node){
        if(node != null){
            inorderTrav(list, node.left);
            list.add(node.val);
            inorderTrav(list, node.right);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderTrav(res, root);
        return res;
    }    
}
