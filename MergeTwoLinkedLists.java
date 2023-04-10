

//21. Merge Two Sorted Lists
//https://leetcode.com/problems/merge-two-sorted-lists/solutions/

public class MergeTwoLinkedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //If listNode are empty, return an empty ListNode.
        //If there is one non-empty listnode, return the non-empty listnode.

        //When merging the listNodes, sort the listNodes in ascending order.

        //Iterate through both lists until the next node for both list are null.
        //Compare the values for both nodes. If node from list 1 is greater than list 2, then insert the node.
        //Vice versa with node from list 2 is greater than list 1.

        //Revisit on the weekend.

        ListNode head = new ListNode();
        ListNode cur = head;      

        while(list1 != null && list2 != null){ 
            if(list1.val <= list2.val){
                cur.next = list1;
                list1 = list1.next;
            }else{
                cur.next = list2;
                list2 = list2.next;
            }

            cur = cur.next;
        }

        if(list1 != null){
            cur.next = list1;
        }else{
            cur.next = list2;
        }

        return head.next;
    }
}
