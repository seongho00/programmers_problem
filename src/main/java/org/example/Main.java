package org.example;


import java.util.*;


class Solution {
    public List<Integer> solution(long n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = String.valueOf(n).length() - 1; i >= 0; i--) {
            answer.add(String.valueOf(n).charAt(i) - '0');
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(12345));

    }
}


