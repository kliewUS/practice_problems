import java.util.Arrays;

public class RowWithMaxOnes {
    //2643. Row With Maximum Ones
    //https://leetcode.com/problems/row-with-maximum-ones/
    //Initalize an array of length of 2. 
    //Iterate through the matrix. Count the number of ones in each row.
    //If it's greater than the current max, get the current row and current max.
    //Reset the counter and repeat.
    //Return the res array.
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] res = new int[2];
        Arrays.fill(res, 0);

        for(int i = 0; i < mat.length; i++){
            int count = 0;
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }

            if(count > res[1]){
                res[0] = i;
                res[1] = count;
            }
        }

        return res;
    }    
}
