package org.example;


import java.util.*;

class Solution {
    public int solution(int[] numbers, int n) {
        int answer = numbers[0];
        for (int i = 1; i <= n; i++) {
            if (answer > n) {
                return answer;
            }
            answer += numbers[i];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{34, 5, 71, 29, 100, 34}, 123));

    }
}


