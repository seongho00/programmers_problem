package org.example;


import java.util.*;


import java.util.*;

class Solution {
    public int solution(int n) {
        if (n == 0) {
            return 0;
        }
        int answer = 1;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(6));

    }
}


