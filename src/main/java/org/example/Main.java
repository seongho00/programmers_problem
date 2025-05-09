package org.example;


import java.util.*;


class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(3, 5));

    }
}


