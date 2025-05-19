package org.example;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Solution {
    public String solution(String s) {
        List<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            numbers.add(Integer.parseInt(list.get(i)));
        }


        return Collections.min(numbers) + " " + Collections.max(numbers);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("1 2 3 4"));

    }
}


