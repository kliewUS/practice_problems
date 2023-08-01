import java.util.Arrays;

public class AvgSalaryNoMaxMin {
    //1491. Average Salary Excluding the Minimum and Maximum Salary
    //https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
    //Sort the array. Then iterate from 1 to n-2.
    //Divide result by n - 2.
    public double average(int[] salary) {
        double res = 0.0;
        Arrays.sort(salary);

        for(int i = 1; i < salary.length - 1; i++){
            res += salary[i];
        }

        return res / (salary.length - 2);
    }    
}
