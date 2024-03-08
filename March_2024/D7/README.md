<h2>3005. Count Elements With Maximum Frequency</h2>
<h4> Link: https://leetcode.com/problems/count-elements-with-maximum-frequency/description/?envType=daily-question&envId=2024-03-08</h4>

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The problem aims to find the maximum frequency elements in an array and count how many times they occur.

# Approach
<!-- Describe your approach to solving the problem. -->
To solve the problem, the code iterates through the input array to find the maximum value. Then, it initializes an array of counts for each value up to the maximum value found. Next, it counts the frequency of each element in the input array using the count array. Finally, it finds the maximum frequency among all elements and counts how many elements have this maximum frequency.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
1. The first loop to find the maximum value in the input array takes O(n) time, where n is the length of the input array.
2. The second loop to count the frequency of each element takes O(n) time.
3. The third and fourth loops to find the maximum frequency and count the elements with this frequency both take O(maxValue) time, where maxValue is the maximum value in the input array.
4. Therefore, the overall time complexity is O(n + maxValue).

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
1. An additional array arr of size maxValue + 1 is created, which takes O(maxValue) space.
2. Therefore, the space complexity is O(maxValue).