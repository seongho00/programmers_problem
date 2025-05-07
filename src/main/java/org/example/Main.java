package org.example;


import java.util.*;

class Solution {
    public List<Integer> solution(int[] numList, int n) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers_abs = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        boolean plus;
        for (int i = 0; i < numList.length; i++) {
            numbers.add(numList[i] - n);
            numbers_abs.add(Math.abs(numList[i] - n));
        }
        Collections.sort(numbers_abs);
        for (int i = 0; i < numbers_abs.size(); i++) {
            plus = false;
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers_abs.get(i) == -numbers.get(j) && numbers_abs.get(i) != 0) {
                    answer.add(-numbers_abs.get(i) + n);
                    numbers.remove(j);
                    plus = true;
                }
            }
            if (!plus) {
                if (i != 0) {
                    if (Objects.equals(numbers_abs.get(i), numbers_abs.get(i - 1))) {
                        answer.add(i - 1, numbers_abs.get(i) + n);
                    } else {
                        answer.add(numbers_abs.get(i) + n);
                    }
                } else {
                    answer.add(numbers_abs.get(i) + n);
                }


            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{1, 2, 3, 4, 5}, 1));

    }
}


