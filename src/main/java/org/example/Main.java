package org.example;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        List<Integer> A_list = new ArrayList<>();
        List<Integer> B_list = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            A_list.add(A[i]);
            B_list.add(B[i]);
        }

        int size = A_list.size();
        Collections.sort(A_list);
        Collections.sort(B_list);
        Collections.reverse(B_list);

        for (int i = 0; i < size; i++) {
            answer += A_list.get(i) * B_list.get(i);
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));

    }
}


