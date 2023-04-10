public class SameTree{
    //100. Same Tree
    //https://leetcode.com/problems/same-tree/description/
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //Traverse both trees.
        //If both p and q are null, return true;
        //If one of the value is null, return false.
        //Check if the value is the same. If it is, traverse through the rest of the tree.
        //Otherwise, return false.

        if(p == null && q == null){
            return true;
        }

        if(p == null || q == null){
            return false;
        }

        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }
}