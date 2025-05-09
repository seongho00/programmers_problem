package org.example;


import java.util.*;


class Solution {
    public int solution(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(10));

    }
}


