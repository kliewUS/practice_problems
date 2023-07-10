public class ConcatArrayValue {
    //2562. Find the Array Concatenation Value
    //https://leetcode.com/problems/find-the-array-concatenation-value/
    //Have two pointers. One at the first element and one at the last element.
    //Use string concat to combine the numbers. Convert them back to int and add to the sum.
    //Repeat until there are either no elements or there is one element.
    //If there is one element remaining, then add the value to the sum.
    public long findTheArrayConcVal(int[] nums) {
        long sum = 0;
        int firstPointer = 0;
        int lastPointer = nums.length - 1;

        while(firstPointer <= lastPointer){
            if(firstPointer == lastPointer){
                sum += nums[firstPointer];
            }else{
                String s = "" + nums[firstPointer] + nums[lastPointer];
                int res=Integer.parseInt(s);
                sum += res;  
            }

            firstPointer++;
            lastPointer--;
        }

        return sum;
    }
}