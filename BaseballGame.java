import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    //682. Baseball Game
    //https://leetcode.com/problems/baseball-game/
    //Initalize a new list to hold the elements.
    //If it's an int, add to the list.
    //If '+', then add two of the previous scores if any.
    //If 'D', then double the previous score if any.
    //If 'C', remove from the list.
    //After that iterate through the list to get the sum.
    public int calPoints(String[] operations) {
        List<Integer> res = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < operations.length; i++){
            if("+".equals(operations[i]) && res.size() >= 2){
                res.add(res.get(res.size() - 1) + res.get(res.size() - 2));
            }else if("D".equals(operations[i]) && res.size() >= 1){
                res.add(2 * res.get(res.size() - 1));
            }else if("C".equals(operations[i])){
                res.remove(res.size() - 1);
            }else{
                res.add(Integer.parseInt(operations[i]));
            }
        }

        for(int j = 0; j < res.size(); j++){
            sum += res.get(j);
        }

        return sum;
    }    
}
