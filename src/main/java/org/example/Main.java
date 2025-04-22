package org.example;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> measures = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                measures.add(i);
            }
        }
        return measures;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(29));
    }
}


