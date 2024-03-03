package March_2024.D1;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

    }

    public String maximumOddBinaryNumber(String s) {
        StringBuilder newS = new StringBuilder();
        int ones = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '1') {
                ones += 1;
            }
        }
        int zero = len - ones;
        for (int i = 0; i < ones - 1; i++) {
            newS.append('1');
        }
        for (int i = 0; i < zero; i++) {
            newS.append('0');
        }
        newS.append('1');
        return newS.toString();
    }
}
