<h2>876. Middle of the Linked List</h2>
<h4> Link: https://leetcode.com/problems/middle-of-the-linked-list/description/?envType=daily-question&envId=2024-03-07</h4>

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The intuition behind this problem is to find the middle node of a singly-linked list. One common approach to finding the middle node is to use two pointers: a slow pointer and a fast pointer. The slow pointer moves one step at a time, while the fast pointer moves two steps at a time. By the time the fast pointer reaches the end of the list, the slow pointer will be at the middle node.

# Approach
<!-- Describe your approach to solving the problem. -->
The approach used here is to initialize two pointers, fast and head, both initially pointing to the head of the list. Then, while the fast pointer and its next node are not null, we advance the fast pointer by two steps and the head pointer by one step. This way, when the fast pointer reaches the end of the list, the head pointer will be at the middle node.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
1. O(n), where n is the number of nodes in the linked list. We traverse the entire list once.

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
1. O(1), as we are using only a constant amount of extra space for the two pointers, fast and head.