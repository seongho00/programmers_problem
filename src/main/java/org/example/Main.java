package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public long solution(int balls, int share) {
        return factorial(balls , share) / factorial(share, share);
    }
    static long factorial(int number, int count) {
        long rs = 1;

        while(count > 0){
            int i = number;
            rs *= i;
            count --;
            number--;
        }

        return rs;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(20,3));
    }
}


