package org.example;


import java.util.*;


class Solution {
    public String solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            return "Even";
        }

        return "Odd";
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(3));

    }
}


