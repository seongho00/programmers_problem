package org.example;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int p_count = 0;
        int y_count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                p_count++;
            }
            if (s.charAt(i) == 'y') {
                y_count++;
            }
        }
        if (p_count == y_count) {
            return true;
        }

        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("pPoooyY"));

    }
}


