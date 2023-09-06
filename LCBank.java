public class LCBank {
    //1716. Calculate Money in Leetcode Bank.
    //https://leetcode.com/problems/calculate-money-in-leetcode-bank/
    //Keep track of current day as a variable.
    //Also keep track of the amount of money that is put in to the bank that day.
    //Increment that counter by 1 for every week.
    public int totalMoney(int n) {
        int account = 0;
        int currentDay = 0;
        int dayNum = 1;
        int deposit = 1; 

        while(dayNum <= n){

            if(currentDay != 0 && currentDay % 7 == 0){
                currentDay = 0;
                deposit += 1;
            }
            
            account += (deposit + currentDay);
            dayNum += 1;
            currentDay += 1;

        }

        return account;
    }    
}
