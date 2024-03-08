package March_2024.D8;

public class Solution {
    public static void main(String[] args) {

    }

    public int maxFrequencyElements(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        for (int num : nums) {
            if (maxValue < num) {
                maxValue = num;
            }
        }
        int arr[] = new int[maxValue + 1];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        int maxFreq = 0;
        for (int val : arr) {
            if (val > maxFreq) {
                maxFreq = val;
            }
        }
        int count = 0;
        for (int val : arr) {
            if (val == maxFreq) {
                count++;
            }
        }
        return count * maxFreq;
    }
}
