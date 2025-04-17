package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int solution(int n) {
        int count = 1;
        while (true) {

            if (factorial(count) <= n) {
                count++;
                continue;
            }
            break;
        }
        return count - 1;
    }

    private int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(3628800));
    }
}


