package March_2024.D5;

public class Solution {
    public static void main(String[] args) {

    }

    public int minimumLength(String s) {
        int left = 0, right = s.length() - 1;
        while (right > left && s.charAt(left) == s.charAt(right)) {
            int temp = left;
            while (left < s.length() && s.charAt(left) == s.charAt(temp)) {
                left++;
            }
            while (right > -1 && s.charAt(right) == s.charAt(temp)) {
                right--;
            }
            if (right < left) {
                return 0;
            }
        }
        return right - left + 1;
    }
}
