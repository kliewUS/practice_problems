public class InvertBinaryTree {
    //226. Invert Binary Tree
    //https://leetcode.com/problems/invert-binary-tree/description/
    public TreeNode invertTree(TreeNode root) {
        //Treat this as if you are swapping elements in an array.
        //if root is null, then return null.
        //If not null, create a new tree node set to root.left. Then set root.left to root.right and root.right to the temp node.
        //Swap the left and right by calling the invertTree on the opposite side (right for left and left for right)
        //return the node once done.

        if(root == null){
            return null;
        }

        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;

        invertTree(root.right);
        invertTree(root.left);

        return root;
    }    
}
