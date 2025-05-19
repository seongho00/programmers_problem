package org.example;


import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


class Solution {
    public int solution(int n) {
        int answer = n;
        int n_1_count = Integer.toBinaryString(n).length() - Integer.toBinaryString(n).replace("1", "").length();

        while (true) {
            answer++;
            int answer_1_count = Integer.toBinaryString(answer).length() - Integer.toBinaryString(answer).replace("1", "").length();

            if (answer_1_count == n_1_count) {
                return answer;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(15));

    }
}


