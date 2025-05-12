package org.example;


import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int odd_sum = 0;
        int even_sum = 0;
        for (int i = 0; i < num_list.length; i++) {
            if ((i + 1) % 2 == 0) {
                even_sum += num_list[i];
            } else {
                odd_sum += num_list[i];
            }
        }

        if (odd_sum > even_sum) {
            return odd_sum;
        }

        return even_sum;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{4, 2, 6, 1, 7, 6}));

    }
}


