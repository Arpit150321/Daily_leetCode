package March_2024.D4;

import java.util.Arrays;

//Definition for singly-linked list.

public class Solution {
    public static void main(String[] args) {

    }

    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left = 0;
        int score = 0;
        int maxScore = 0;
        int right = tokens.length - 1;
        while (right >= left) {
            if (tokens[left] <= power) {
                power = power - tokens[left];
                left = left + 1;
                score += 1;
            } else if (score >= 1) {
                power = power + tokens[right];
                right = right - 1;
                score -= 1;
            } else {
                break;
            }
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }
}
