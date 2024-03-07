# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def middleNode(self, head):
        """
        :type head: ListNode
        :retype: ListNode
        """
        fast = head
        while fast and fast.next:
            fast = fast.next.next
            head = head.next
        return head