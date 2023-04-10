public class BalancedBinaryTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        // 110. Balanced Binary Tree
        // https://leetcode.com/problems/balanced-binary-tree/description/
        // Absolute difference between the heights of left and right subtree of any
        // nodes <= 1
        // Both left and right subtrees should be balanced for every node.
        // To achieve this, recursion is required.
        // To get the absolute difference, we will first call a height helper function.
        // If it's a leaf node, return -1.
        // Otherwise, get the max height between the two child nodes and add one to get
        // the height of the parent node.
        // Keep doing this until we reached the root node. Then determine if the
        // absolute difference of the left and right subtrees for all nodes <= 1.
        // Redo this problem in the weekend.

        public int height(TreeNode node) {
            if (node == null) {
                return -1;
            }

            return Math.max(height(node.left), height(node.right)) + 1;
        }

        public boolean isBalanced(TreeNode root) {

            if (root == null) {
                return true;
            }

            return Math.abs(height(root.left) - height(root.right)) < 2
                    && isBalanced(root.left) && isBalanced(root.right);
        }
    }
}
