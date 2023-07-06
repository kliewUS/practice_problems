public class NumSeniorCitizens {
    //2678. Number of Senior Citizens
    //https://leetcode.com/problems/number-of-senior-citizens/
    //Grab the substring of (11, 13).
    //Convert to int and check if age > 60.
    //If it is, increment counter.
    //Return counter
    public int countSeniors(String[] details) {
        int counter = 0;

        for(int i = 0; i < details.length; i++){
            int age = Integer.valueOf(details[i].substring(11, 13));

            if(age > 60){
                counter++;
            }
        }

        return counter;
    }    
}
