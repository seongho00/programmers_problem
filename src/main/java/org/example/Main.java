package org.example;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;


class Solution {
    public int solution(int[] absolutes, boolean[] signs) {

        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                sum += absolutes[i];
            } else {
                sum -= absolutes[i];
            }
        }

        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{4,7,12}, new boolean[]{true,false,true}));

    }
}


