package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[] numbers) {
        int max = numbers[0] * numbers[1];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] > max) {
                    max = numbers[i] * numbers[j];
                }
            }
        }

        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{1, 2, -3, 4, -5}));

    }
}


