package org.example;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Solution {
    public int solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int number : numbers) {
            list.add(number);
        }

        Collections.sort(list);

        for (int i = 0; i < 10; i++) {
            if (list.contains(i)) {
                continue;
            }

            sum += i;

        }

        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));

    }
}


