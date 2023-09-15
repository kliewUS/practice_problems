import java.util.List;

public class CountMatches {
    // 1773. Count Items Matching a Rule.
    // https://leetcode.com/problems/count-items-matching-a-rule/
    // Init a counter.
    // Iterate through the array.
    // Check if the ruleKey and ruleValue matches. If it does, add to the count.
    // Return the count.
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int column = 0;

        if (ruleKey.equalsIgnoreCase("color")) {
            column = 1;
        } else if (ruleKey.equalsIgnoreCase("name")) {
            column = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(column).equalsIgnoreCase(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}
