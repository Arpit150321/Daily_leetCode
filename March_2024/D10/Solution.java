package March_2024.D10;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        set1.retainAll(set2);
        int result[] = new int[set1.size()];
        int index = 0;
        for (int num : set1) {
            result[index++] = num;
        }
        return result;
    }
}
