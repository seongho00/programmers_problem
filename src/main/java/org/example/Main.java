package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int solution(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1 ; j < numbers.length; j++) {
                if (max < numbers[j] * numbers[i]) {
                    max = numbers[j] * numbers[i];
                }
            }
        }
        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{0, 31, 24, 10, 1, 9}));
    }
}


