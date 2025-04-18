package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> solution(int n) {

        List<Integer> numbers = new ArrayList<>();
        int i = 2;
        // 입력받은 정수까지 반복
        while (i <= n) {
            // 나눠지는 수가 있을 때 = 없을 때 까지 반복
            if (n % i == 0) {
                n = n / i;
                numbers.add(i);
            } else {
            // 나눠지는 수가 없으면 다음 수로 넘어감
                i++;
            }

        }
        // 중복된 값 제거
        numbers = numbers.stream().distinct().collect(Collectors.toList());
        // 오림차순 정렬
        Collections.sort(numbers);
        return numbers;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(420));
    }
}


