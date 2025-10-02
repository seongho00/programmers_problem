package org.example;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(int n) {
        String text = "수박";
        // 짝수 일 때
        if (n % 2 == 0) {
            return text.repeat(n / 2);
        }
        else {
            return text.repeat(n / 2) + text.repeat(n / 2);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr_int = new int[]{4, 3, 2, 1};
        int[] arr_int2 = new int[]{-1, 0, 1};

        System.out.println(solution.solution(3));

    }
}


