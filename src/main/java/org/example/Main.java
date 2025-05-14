package org.example;


import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("masterpiece"));

    }
}


