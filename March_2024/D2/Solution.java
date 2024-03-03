package March_2024.D2;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

    }

    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
