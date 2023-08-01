import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReformatDate {
    //1507. Reformat Date
    //https://leetcode.com/problems/reformat-date/
    //Split string. 
    //Do conversion of day, month, and year separately.
    //Remove last two chars of the date and convert.
    //Look up month via indexOf.
    //ParseInt for year.
    public String reformatDate(String date) {
        String[] temp = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        List<String> months = new ArrayList<String>(Arrays.asList(temp));
        String[] dateString = date.split(" ");
        StringBuilder res = new StringBuilder();

        res.append(dateString[2] + "-");
        
        String month;

        if(months.indexOf(dateString[1]) + 1 < 10){
            month = "0" + Integer.toString(months.indexOf(dateString[1]) + 1) + "-";
        }else{
            month = Integer.toString(months.indexOf(dateString[1]) + 1) + "-";
        }

        res.append(month);

        if(Integer.parseInt(dateString[0].substring(0, dateString[0].length() - 2)) < 10){
            res.append("0" + dateString[0].substring(0, dateString[0].length() - 2));
        }else{
            res.append(dateString[0].substring(0, dateString[0].length() - 2));
        }


        return res.toString();
    }    
}
