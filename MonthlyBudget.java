import java.util.LinkedHashMap;

public class MonthlyBudget {
    public static void main(String args[]){
        LinkedHashMap<Integer, Integer> budget = new LinkedHashMap<>(); 
        //In Code chef case, we would instead split the input and put the first value as the key and second as the value.
        budget.put(1000, 10);
        budget.put(250, 50);
        budget.put(1500, 50);


        budget.forEach((monthlyBudget, dailyCost) -> {
            dailyCost *= 30;

            if(dailyCost > monthlyBudget){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        });
    }
}
