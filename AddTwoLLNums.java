import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class AddTwoLLNums {
    //2. Add Two Numbers
    //https://leetcode.com/problems/add-two-numbers/description/
    //Pretty bad solution. Would not recommend doing this. Probably try to redo in later time.
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Initalize two arrays
        //Iterate through the both linked list and add the value to the arrays.
        //Reverse the arrays and make them strings.
        //Convert them into longs and add them.
        //Convert back into a string and make them an array again.
        //Reverse the array and iterate through the array and create a new linked list to store the nodes.

        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ListNode resList = new ListNode(0); //Result List
        ListNode cur = resList; //Pointer

        while(l1 != null){
            num1.add(l1.val);
            l1 = l1.next;
        }

        while(l2 != null){
            num2.add(l2.val);
            l2 = l2.next;
        }

        Collections.reverse(num1);
        Collections.reverse(num2);

        String numStr1 = num1.stream().map(Object::toString)
                    .collect(Collectors.joining(""));

        String numStr2 = num2.stream().map(Object::toString)
                    .collect(Collectors.joining(""));       

        BigInteger bigInt1 = new BigInteger(numStr1);
        BigInteger bigInt2 = new BigInteger(numStr2);

        BigInteger res = bigInt1.add(bigInt2);

        String bigIntString = res.toString();

        for(int i = bigIntString.length() - 1; i >= 0; i--){           
            int digit = Character.getNumericValue(bigIntString.charAt(i));
            ListNode node = new ListNode(digit);
            cur.next = node;
            cur = cur.next;
        }

        return resList.next;
    }
}
