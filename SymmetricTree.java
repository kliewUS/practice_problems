public class SymmetricTree {
    //101. Symmetric Tree
    //https://leetcode.com/problems/symmetric-tree/description/
    public boolean checkSymmetric(TreeNode t1, TreeNode t2){
        //Similar to the Same Tree problem
        //If t1 and t2 are null, return true. If either t1 or t2 are null, return false.
        //Check if the left val in the subtree is equal to right val in the subtree. If it is, continue to traversal.
        //Otherwise return false.

        if(t1 == null && t2 == null){
            return true;
        }

        if(t1 == null || t2 == null){
            return false;
        }

        return t1.val == t2.val && checkSymmetric(t1.left, t2.right) && checkSymmetric(t1.right, t2.left);
    }


    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        return checkSymmetric(root.left, root.right);
    }
}
