package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int solution(int[] box, int n) {
            int x = box[0] / n;
            int y = box[1] / n;
            int z = box[2] / n;

        return x * y * z;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{10, 8, 6}, 3));
    }
}


