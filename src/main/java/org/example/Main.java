package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String my_string) {
        int answer = 0;

        if (my_string.contains(" - ")) {
            my_string = my_string.replace(" - ", " + -");
        }

        List<String> my_strings = Arrays.asList(my_string.split(" \\+ "));

        for  (int i = 0; i < my_strings.size(); i++) {
            answer += Integer.parseInt(my_strings.get(i));
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("3 + 4"));
    }
}


