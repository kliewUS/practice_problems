public class LinkedListCycleII {
    //142. Linked List Cycle II
    //https://leetcode.com/problems/linked-list-cycle-ii/description/  
    public ListNode detectCycle(ListNode head) {
        //Use Fast and Slow Pointer.
        //Initalize Fast and Slow pointer to start at the head.
        //Fast will by two nodes. Slow will by one node.
        //If both fast and slow pointer meet, then we have a cycle. Initalize another pointer called current.
        //Keep iterating both current and slow point until the two pointers meet. Return the slow pointer's position.
        //Otherwise, return false if either fast or fast.next is null.


        if(head == null){
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                
                ListNode cur = head;

                while(cur != slow){
                    cur = cur.next;
                    slow = slow.next;
                }

                return slow;
            }
        }

        return null;        
    }    
}
