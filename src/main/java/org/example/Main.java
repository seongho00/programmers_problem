package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int n) {
        double sqrt = Math.sqrt(n);

        if (sqrt == (int) sqrt) {
            return 1;

        } else {
            return 2;
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(976));

    }
}


