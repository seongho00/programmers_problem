package org.example;


import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


class Solution {
    public boolean solution(int x) {
        int sum = 0;

        // 기존 숫자 보존
        int temp = x;

        // 일,십,백 숫자 더하기
        while (true) {

            // 일의 숫자 더하기
            sum += x % 10;

            // 십의 숫자가 있을 때
            if (x / 10 != 0) {
                x = x / 10;
            } else {
                break;
            }

        }

        return temp % sum == 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(10));

    }
}


