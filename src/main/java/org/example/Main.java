package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String string : s1) {
            for (String s : s2) {
                if (string.equals(s)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[] {"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}));
    }
}


