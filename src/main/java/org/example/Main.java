package org.example;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            list.add(num_list[i]);
        }
        if (list.get(list.size() - 1) > list.get(list.size() - 2)) {
            list.add(list.get(list.size() - 1) - list.get(list.size() - 2));
        } else {
            list.add(list.get(list.size() - 1) * 2);
        }

        return list;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{5, 2, 1, 7, 5}));

    }
}


