package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int solution(int order) {
        int count = 0;
        // 문자열로 변환
        String orderStr = order + "";
        // 하나씩 List 배열에 담기
        List<String> numbers = new ArrayList<>(Arrays.asList(orderStr.split("")));

        // 숫자가 3, 6, 9 일 때 count 하나씩 추가
        for (String number : numbers) {
            if (number.equals("3") || number.equals("6") || number.equals("9")) {
                count++;
            }
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(29423));
    }
}


