package org.example;


import java.util.*;
import java.util.stream.Collectors;


class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(d);
        List<Integer> distinctNumbers = new ArrayList<>(numbers.stream().distinct().collect(Collectors.toList()));

        for (Integer number : distinctNumbers) {
            numbers.remove(number);
        }
        numbers = numbers.stream().sorted().distinct().collect(Collectors.toList());

        // 숫자가 모두 같을 때
        if (distinctNumbers.size() == 1) {
            return 1111 * distinctNumbers.get(0);
        }

        // 3개의 숫자가 같을 때
        if (distinctNumbers.size() == 2 && numbers.size() == 1) {
            int distinctNumber = numbers.get(0) == distinctNumbers.get(0) ? distinctNumbers.get(1) : distinctNumbers.get(0);
            return (10 * numbers.get(0) + distinctNumber) * (10 * numbers.get(0) + distinctNumber);

        }

        // 두개씩 숫자가 같을 때
        if (distinctNumbers.size() == 2 && numbers.size() == 2) {
            int p = numbers.get(0);
            int q = numbers.get(1);
            return (p + q) * Math.abs(p - q);

        }

        // 두개만 같은 숫자 일 때 
        if (distinctNumbers.size() == 3) {
            distinctNumbers.remove(numbers.get(0));
            int q = distinctNumbers.get(0);
            int r = distinctNumbers.get(1);
            return q * r;
        }
        // 모두 다를 때
        if (distinctNumbers.size() == 4) {
            return Collections.min(distinctNumbers);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(1, 2, 4, 3));

    }
}


