package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int solution(int[] numbers, int k) {
        int index = (((k - 1) * 2) % numbers.length);
        return numbers[index];
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{1, 2, 3}, 3));
    }
}


