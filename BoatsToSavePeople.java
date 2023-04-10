import java.util.Arrays;

public class BoatsToSavePeople {
    //881. Boats to Save People
    //https://leetcode.com/problems/boats-to-save-people/description/

    //Sort the array from lowest to highest.
    //Initalize two pointers (Left and right).
    //Sum the left and right element. If sum is less than or equal to the limit, increment left pointer by 1 and decrement right pointer by 1.
    //If sum is greater than the limit, decrement right pointer by 1.
    //Regardless increment boats by 1.
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int left = 0;
        int right = people.length - 1;

        while(left <= right){
            int sum = people[left] + people[right];

            if(sum <= limit){
                boats++;
                left++;
                right--;
            }else{
                boats++;
                right--;
            }
        }

        return boats;
    } 
}
