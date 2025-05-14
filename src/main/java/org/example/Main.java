package org.example;


import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String binomial) {
        int answer = 0;

        if (binomial.contains(" - ")) {
            binomial = binomial.replace(" - ", " + -");
        }
        if (binomial.contains(" + ")) {
            List<String> num_list = new ArrayList<>(Arrays.asList(binomial.split(" \\+ ")));
            return Integer.parseInt(num_list.get(0)) + Integer.parseInt(num_list.get(1));
        }

        if (binomial.contains(" * ")) {
            List<String> num_list = new ArrayList<>(Arrays.asList(binomial.split(" \\* ")));
            return Integer.parseInt(num_list.get(0)) * Integer.parseInt(num_list.get(1));
        }


        return answer;
    }

}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("43 + 12"));

    }
}


