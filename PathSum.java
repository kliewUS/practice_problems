public class PathSum {
    //112. Path Sum
    //https://leetcode.com/problems/path-sum/description/
    public boolean checkPathSum(TreeNode root, int targetSum, int sum){
        if(root == null){
            return false;
        }

        sum += root.val;

        if(root.left == null && root.right == null){
            return sum == targetSum;
        }

        return checkPathSum(root.left, targetSum, sum) || checkPathSum(root.right, targetSum, sum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        //Traverse every path on the tree.
        //If root is null, return false.
        //Add the node value to sum.
        //If we reach to the leaf node, then check if the sum is equal to the target sum.
        //If no path sums equal to the target sum, return false. Otherwise, true.
        return checkPathSum(root, targetSum, 0);
    }    
}
