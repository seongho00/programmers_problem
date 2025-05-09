package org.example;


import java.util.*;


class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            answer += Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i)));
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(987));

    }
}


