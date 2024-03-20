# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
#Use Fast and Slow Pointer
#Init fast and slow to head node.
#Fast moves by two nodes
#Slow moves by one node.
#If both the fast and slow pointer meet at the same node, return true.
#Otherwise return false if fast or fast.next is None.
class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if head is None:
            return False

        fast = head
        slow = head

        while fast is not None and fast.next is not None:
            fast = fast.next.next
            slow = slow.next
            if fast == slow:
                return True
        
        return False