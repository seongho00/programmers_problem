package org.example;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> words = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            try {
                words.add(Integer.parseInt(my_string.split("")[i]));
            } catch (Exception e) {
                continue;
            }
        }
        Collections.sort(words);

        return words.stream().mapToInt(x -> x).toArray();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("hi12392"));
    }
}


