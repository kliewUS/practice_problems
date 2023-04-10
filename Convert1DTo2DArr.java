public class Convert1DTo2DArr {
    //2022. Convert 1D Array Into 2D Array
    //https://leetcode.com/problems/convert-1d-array-into-2d-array/
    //Check if the length == m * n. If not, return an empty array as it's impossible to fit the elements in the 2D array.
    //If it is, initalize an empty 2D array with m rows and n columns and an index variable to keep track of the current index in the original array.
    //As we itreate through the 2D array, put the original elements into the new 2D array and increment the index value.
    //Return the 2D array.
    public int[][] construct2DArray(int[] original, int m, int n) {
        //[1,2,3,4] 0 to 3
        //First Row: 0 to 1
        //Second Row: 2 to (2 * n) - 1 = 2 to 3

        if(original.length != m * n){
            int[][] empty = {};
            return empty;
        }

        int[][] convertArray = new int[m][n];
        int index = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                convertArray[i][j] = original[index];
                index++;
            }
        }

        return convertArray;
    }    
}
