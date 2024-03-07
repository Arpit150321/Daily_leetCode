package March_2024.D7;

public class Solution {
    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            head = head.next;
        }
        return head;
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
