package org.example;


import java.util.*;

class Solution {
    public List<Integer> solution(int start_num, int end_num) {
        List<Integer> answer = new ArrayList<>();

        for (int i = start_num; i <= end_num; i++) {
            answer.add(i);
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(3, 10));

    }
}


