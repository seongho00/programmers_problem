package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String polynomial) {
        int sum_x = 0;
        int number = 0;
        List<String> polynomialBits = Arrays.asList(polynomial.split(" \\+ "));
        for (int i = 0; i < polynomialBits.size(); i++) {
            if (polynomialBits.get(i).equals("x")) {
                polynomialBits.set(i, "1x");
            }
            if (polynomialBits.get(i).contains("x")) {
                String[] bits = polynomialBits.get(i).split("x");
                sum_x += Integer.parseInt(bits[0]);
            } else {
                number += Integer.parseInt(polynomialBits.get(i));
            }
        }
        String result = sum_x + "x + " + number;
        if (number == 0) {
            result = sum_x + "x";
            if (sum_x == 1) {
                result = "x";
            }
        } else if (sum_x == 0) {
            result = number + "";
        } else {
            if (sum_x == 1) {
                result = "x + " + number;
            }
        }

        return result;
    }


}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("1 + 5"));

    }
}


