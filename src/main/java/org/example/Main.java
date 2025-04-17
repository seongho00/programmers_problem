package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[] num_list) {
        // 모든 원소 곱의 합
        int sumOfMultiples = 1;
        for (int i = 0; i < num_list.length; i++) {
            sumOfMultiples *= num_list[i];
        }

        // 모든 원소 제곱의 합
        int squaresOfSum = 0;
        for (int i = 0; i < num_list.length; i++) {
            squaresOfSum += num_list[i];
        }
        squaresOfSum *= squaresOfSum;

        // 값 비교
        if (squaresOfSum > sumOfMultiples) {
            return 1;
        }

        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{5, 7, 8, 3}));
    }
}


