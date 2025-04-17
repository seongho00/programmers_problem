package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        if (direction.equals("left")) {
            int last_number = numbers[0];
            for (int i = 0; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] =last_number;
        } else {
            int first_number = numbers[numbers.length - 1];
            for (int i = numbers.length - 1; i >= 1; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = first_number;

        }
        return numbers;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left"));
    }
}


