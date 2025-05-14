package org.example;


import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A", "0");
        myString = myString.replace("B", "A");
        myString = myString.replace("0", "B");
        if (myString.contains(pat)) {
            return 1;
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("ABBAA", "AABB"));

    }
}


