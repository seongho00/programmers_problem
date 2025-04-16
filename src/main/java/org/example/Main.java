package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List solution(int[] emergency) {

        List<Integer> num = Arrays
                .stream(emergency)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> rs = new ArrayList<>();

        for (int i = 0; i < num.size(); i++) {
            rs.add(0);
        }

        int index = 0;
        while (true) {
            for (int i = 0; i < num.size(); i++) {
                if (Collections.max(num) == -1){
                    break;
                }
                if (Collections.max(num).equals(num.get(i))) {
                    num.set(i, -1);
                    rs.set(i,++index);
                }
            }

            if (index == num.size()) {
                break;
            }
        }


        return rs;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }
}