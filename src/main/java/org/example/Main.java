package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        List<String> list = Arrays.asList(my_string.split(""));
        Collections.sort(list);

        return String.join("", list);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("Bcad"));

    }
}


