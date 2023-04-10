public class LinkedListCycle {
    //141. Linked List Cycle
    //https://leetcode.com/problems/linked-list-cycle/description/
    public boolean hasCycle(ListNode head) {
        //Use Fast and Slow Pointer.
        //Initalize Fast and Slow pointer to start at the head.
        //Fast will by two nodes. Slow will by one node.
        //If both fast and slow pointer meet, then we have a cycle. Return true. 
        //Otherwise, return false if either fast or fast.next is null.

        if(head == null){
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }

        return false;
    }
}
