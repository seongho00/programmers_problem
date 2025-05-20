package org.example;


import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("americano") || order[i].contains("anything")) {
                answer += 4500;
            } else if (order[i].contains("cafelatte")) {
                answer += 5000;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[]{"cafelatte", "americanoice", "hotcafelatte", " anything"}));

    }
}


