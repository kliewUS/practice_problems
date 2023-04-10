public class MinCostClimbingStairs {
     //746. Min Cost Climbing Stairs
    //https://leetcode.com/problems/min-cost-climbing-stairs/description/
    public int minCostClimbingStairs(int[] cost) {
        //Tabulation - Bottom-Up
        //Initalize an array to store intermediate values.
        //Initalize dp[0] = cost[0] and cost[1] = cost[1]
        //From 2 to cost.length - 1, the recurrance relation is dp[i] = cost[i] + min(dp[i - 1], dp[i - 2]).
        //return min(dp[cost.length-1], dp[cost.length-2])

        int[] dp = new int[cost.length];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i = 2; i < cost.length; i++){
            //System.out.println("Current 1st value at " + i + " : " + dp[i-1]);
            //System.out.println("Current 2nd value at " + i + " : " + dp[i-2]);            
            //System.out.println("Current cost at " + i + " : " + cost[i]);
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
            //System.out.println("Current dp value at " + i + " : " + dp[i]);            
        }

        return Math.min(dp[cost.length-1], dp[cost.length-2]);
    }   
}
