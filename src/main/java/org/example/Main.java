package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int solution(int n) {

        int answer = 0;
        for (int i = 1; i <= n; i++) {

            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    if (count >= 3) {
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer;
    }

}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(15));
    }
}


