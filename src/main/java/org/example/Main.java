package org.example;


import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<String> solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < picture.length; i++) {
            String temp = "";
            for (int j = 0; j < picture[i].length(); j++) {

                for (int l = 0; l < k; l++) {
                    temp += picture[i].charAt(j);
                }

            }
            for (int j = 0; j < k; j++) {

                answer.add(temp);
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[]{".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."}, 2));

    }
}


