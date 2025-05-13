package org.example;


import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int i = 0;

        while (true) {
            int[] temp = new int[arr.length];
            for (int j = 0; j < arr.length; j++) {
                temp[j] = arr[j];
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= 50 && arr[j] % 2 == 0) {
                    arr[j] = arr[j] / 2;

                } else if (arr[j] < 50 && arr[j] % 2 != 0) {
                    arr[j] = arr[j] * 2 + 1;
                }
            }


            if (Arrays.equals(arr, temp)) {
                return i;
            }
            i++;

        }

    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{1, 2, 3, 100, 99, 98}));

    }
}


