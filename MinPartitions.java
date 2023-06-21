public class MinPartitions {
    //1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
    //https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
    //Get the highest digit and return that digit.
    public int minPartitions(String n) {
        int digit = 0;

        for(int i = 0; i < n.length(); i++){
            if(digit < Character.getNumericValue(n.charAt(i))){
                digit = Character.getNumericValue(n.charAt(i));
            }
        }

        return digit;
    }
}