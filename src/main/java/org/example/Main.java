package org.example;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;


class Solution {
    public long solution(long n) {

        double sqrt = Math.sqrt(n);
        int intSqrt = (int) sqrt;

        // 제곱근인 경우
        if (sqrt - intSqrt == 0) {
            return (long) (intSqrt + 1) * (intSqrt + 1);
        }

        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(121));

    }
}


