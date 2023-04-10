/**
    Finally, after purchasing a water cooler during the April long challenge, Chef noticed that his water cooler requires 2 liters of water to cool for one hour.

    How much water (in liters) would be required by the cooler to cool for N hours?

    Input Format:
    The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.
    The first and only line of each test case contains an integer N, as described in the problem statement.

    Output Format:
    For each test case, output the number of liters of water required by the water cooler to cool for N hours.

    Constraints:
    1 <= T <= 1000
    1 <= N <= 1000

    Sample Input 1:
    2
    1
    2

    Sample Output 2:
    2
    4

    https://www.codechef.com/problems/WATERREQ
 **/

import java.util.List; // import just the List interface
import java.util.ArrayList; // import just the ArrayList class
import java.util.Arrays;

public class WaterReq {

    public static void main(String args[]){

        int counter = 0;

        List<Integer> hours = Arrays.asList(1, 2, 4, 6, 8, 10, 20, 24, 48);


        while(counter < hours.size()){ //Grab first input to set as size. And iterate from there.
            System.out.println(hours.get(counter) * 2);
            counter++;
        }

    }

}