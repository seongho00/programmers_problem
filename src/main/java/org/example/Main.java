package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                odd += num_list[i];
            } else {
                even += num_list[i];
            }
        }
        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{5, 7, 8, 3}));
    }
}


