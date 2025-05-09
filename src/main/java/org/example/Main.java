package org.example;


import java.util.*;


class Solution {
    public List<Long> solution(int x, int n) {
        List<Long> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            answer.add(((long) x * (i + 1)));
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(2, 5));

    }
}


