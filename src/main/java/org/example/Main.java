package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int num, int k) {
        List<String> list = Arrays.asList((num + "").split(""));
        String q = k +"";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(q)) {
                return i + 1;
            }
        }

        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(232443	, 4));

    }
}


