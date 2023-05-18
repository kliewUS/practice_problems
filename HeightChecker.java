public class HeightChecker {
    //1051. Height Checker
    //https://leetcode.com/problems/height-checker/
    //Make a copy of the height array and sort it.
    //Then compare the two arrays. If they don't match, increment counter.
    //Return said counter.
    public int heightChecker(int[] heights) {
        int counter = 0;
        int[] sorted = heights.clone();

        Arrays.sort(sorted);

        for(int i = 0; i < heights.length; i++){
            if(heights[i] != sorted[i]){
                counter++;
            }
        }

        return counter;
    }    
}
