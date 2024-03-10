<h2>349. Intersection of Two Arrays</h2>
<h4> Link: https://leetcode.com/problems/intersection-of-two-arrays/description/?envType=daily-question&envId=2024-03-10</h4>

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The problem seems to require finding the intersection of two arrays. The use of sets suggests that the duplicates are not wanted, as sets automatically eliminate duplicates.

# Approach
<!-- Describe your approach to solving the problem. -->
The approach here is to utilize two sets, one for each input array. We add all elements from nums1 to set1 and all elements from nums2 to set2. Then, we use the retainAll() method to keep only the elements that are common to both sets. Finally, we convert the resulting set to an array and return it.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
1. Constructing set1 takes $O(n)$ time, where n is the number of elements in nums1.
2. Constructing set2 takes $O(m)$ time, where m is the number of elements in nums2.
retainAll() operation takes $O(min(n, m))$ time.
3. Converting the set to an array takes $O(k)$ time, where k is the size of the resulting set.
4. Overall, the time complexity is $O(n + m + k)$, where n and m are the sizes of the input arrays and k is the size of the resulting intersection array.

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
1. Two sets are created, which store the unique elements from nums1 and nums2, respectively. So, the space complexity is $O(n + m)$, where n and m are the sizes of the input arrays. Additionally, space is required for the resulting array, which can have at most $min(n, m)$ elements. Therefore, the total space complexity is $O(min(n, m))$.