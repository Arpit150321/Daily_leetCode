package March_2024.D3;

//Definition for singly-linked list.
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

public class Solution {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode front, rear;
        front = head;
        rear = head;
        for (int i = 0; i < n; i++) {
            if (front.next == null) {
                return head.next;
            }
            front = front.next;
        }
        while (front.next != null) {
            rear = rear.next;
            front = front.next;
        }
        rear.next = rear.next.next;
        return head;
    }
}
