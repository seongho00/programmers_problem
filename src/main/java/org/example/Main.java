package org.example;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Solution {
    public List solution(int[] arr, int divisor) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int number : arr) {
            list.add(number);
        }

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) % divisor == 0) {
                list2.add(list.get(i));
            }

        }

        if (list2.size() == 0) {
            list2.add(-1);
        }

        return list2;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{5, 9, 7, 10}, 5));

    }
}


