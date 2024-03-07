<h2>2864. Maximum Odd Binary Number</h2>
<h4> Link: https://leetcode.com/problems/maximum-odd-binary-number/description/?envType=daily-question&envId=2024-03-01</h4>

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The goal is to find the maximum odd binary number that can be obtained by flipping at most one bit.

# Approach
<!-- Describe your approach to solving the problem. -->
To achieve this, we count the number of ones and zeros in the given binary string. Then, we construct the maximum odd binary number by appending the maximum possible number of ones (one less than the total number of ones in the string) followed by the remaining zeros, and finally appending one more one at the end.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
1. Counting the number of ones and zeros in the string requires traversing the entire string, which takes O(n) time, where n is the length of the string.
2. Constructing the resulting string takes O(n) time as well.
3. Overall, the time complexity is O(n).

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
1. We use a StringBuilder to construct the resulting string, which requires O(n) extra space to store the resulting string.
2. Additionally, we use a few integer variables which require constant space.
3. Therefore, the space complexity is O(n).