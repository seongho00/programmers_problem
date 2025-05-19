package org.example;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Solution {
    public long solution(long n) {
        String n_str = String.valueOf(n);

        List<String> list = new ArrayList<>(Arrays.asList(n_str.split("")));

        Collections.sort(list);
        Collections.reverse(list);
        long answer = Long.parseLong(String.join("", list));


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(118372));

    }
}


