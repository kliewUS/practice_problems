public class MidLinkedList {
    //876. Middle of the Linked List
    //https://leetcode.com/problems/middle-of-the-linked-list/description/
    public ListNode middleNode(ListNode head) {
        //Use Fast and Slow Pointer.
       //Initalize Fast and Slow pointer to start at the head.
       //Fast will by two nodes. Slow will by one node.
       //If both fast and slow pointer meet, then we have found the middle node. Return the node where the two pointers met. 

       ListNode fast = head;
       ListNode slow = head;       

       while(fast != null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
       }


       return slow;
   }    
}
