public class EmployeeTarget {
    //2798. Number of Employees Who Met the Target
    //https://leetcode.com/problems/number-of-employees-who-met-the-target/
    //Check if each employee's hours is equal or greater than target. Increment if employee meets target.
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int counter = 0;

        for(int i = 0; i < hours.length; i++){
            if(hours[i] >= target){
                counter++;
            }
        }

        return counter;
    }    
}
