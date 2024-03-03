# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        pre_head = ListNode(0,head)
        front = back = pre_head
        while front and n >= 0:
            front = front.next
            n -= 1
        while front:
            front = front.next
            back = back.next
        back.next = back.next.next
        return pre_head.next

        

            
