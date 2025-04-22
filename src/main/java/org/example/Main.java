package org.example;


import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.Arrays;

class Solution {
    public String solution(String my_string, int num1, int num2) {

        List<String> my_string_bits = Arrays.asList(my_string.split(""));

        String num1_bit = my_string_bits.get(num1);
        my_string_bits.set(num1,my_string_bits.get(num2));
        my_string_bits.set(num2,num1_bit);

        return String.join("", my_string_bits);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("hello",1,2));
    }
}


