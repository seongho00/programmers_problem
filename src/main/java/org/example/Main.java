package org.example;


import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
            boolean flag = true;
            if (myString.charAt(i) == pat.charAt(0)) {
                for (int j = 0; j < pat.length(); j++) {
                    if (myString.charAt(i + j) != pat.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
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

        System.out.println(solution.solution("aaaa", "aa"));

    }
}


