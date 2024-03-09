<h2>2540. Minimum Common Value</h2>
<h4> Link: https://leetcode.com/problems/minimum-common-value/description/?envType=daily-question&envId=2024-03-09</h4>

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
This code aims to find the common element between two sorted arrays nums1 and nums2.

# Approach
<!-- Describe your approach to solving the problem. -->
The approach taken here is to use two pointers i and j to iterate through both arrays simultaneously. If the element at nums1[i] is less than the element at nums2[j], we increment i. If they are equal, we return that common element. If the element at nums1[i] is greater than the element at nums2[j], we increment j.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
1. $O(n+m)$, where $n$ and $m$ are the lengths of nums1 and nums2 respectively. Since both arrays are sorted, we can find the common element by iterating through both arrays once.

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
1. $O(1)$, as no extra space is used except for a few variables.