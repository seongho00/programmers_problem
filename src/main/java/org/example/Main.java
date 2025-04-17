package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        // 세 숫자 모두 다를 때
        if (a != b && a != c && b != c) {
            return a + b + c;
        } else if (a == b && a == c) { // 세 숫자 모두 같을 때
            return (3 * a) * ((int) (Math.pow(a, 2)) * 3) * ((int) (Math.pow(a, 3)) * 3);
        } else { // 나머지 경우
            return (a + b + c) * ((int) (Math.pow(a, 2)) + (int) (Math.pow(b, 2) + Math.pow(c, 2)));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(4, 4, 4));
    }
}


