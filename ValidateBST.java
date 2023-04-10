public class ValidateBST{
    //98. Validate Binary Search Tree
    //https://leetcode.com/problems/validate-binary-search-tree/description/

    //Set the inital node range from INT_MIN to INT_MAX.
    //Make a recursive call to the left subtree first. Set the max val to the root's value.
    //If any value in the left subtree is greater than the root node, then return false as it's not a valid BST.
    //Also check to make sure all nodes in the parent node's left subtree are also less than the parent node. Likewise with all the nodes parent's node right subtree, check to make sure all the nodes are greater than the parent node.
    //If the root's left subtree is a BST, repeat the same process with the right subtree. This time set the min val to the root's value.
    //If both the root's left and right subtrees are BSTs, return true. Otherwise, return false.
    //Note: Use null to avoid edge cases suc as the node value being the min/max integer.

    public boolean checkValidBST(TreeNode node, Long min, Long max){
        if(node == null){
            return true;
        }

        Long root_val = Long.valueOf(node.val);

        //System.out.println("Current min: " + min);
        //System.out.println("Current max: " + max);

        if(root_val <= min){
            return false;
        }

        if(root_val >= max){
            return false;
        }        

        return checkValidBST(node.left, min, root_val) && checkValidBST(node.right, root_val, max);
    }

    public boolean isValidBST(TreeNode root) {
        return checkValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}