package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int solution(int[] dot) {
        if (dot[0] > 0 && dot[1] > 0) {
            return 1;

        } else if (dot[0] > 0 && dot[1] < 0) {
            return 4;
        } else if (dot[0] < 0 && dot[1] > 0) {
            return 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            return 3;
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{2, 4}));
    }
}


