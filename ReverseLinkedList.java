public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        //Set the current pointer to the head.
        //Set the prev pointer to null.
        //Set the next pointer to the current.next

        //Iterate through the list. 
        //Set current.next pointer to the prev pointer.
        //Set the prev to the current pointer.
        //Set the current pointer to next.

        ListNode cur = head;
        ListNode prev = null;

        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}