package org.example;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n, String control) {

        for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i) == 'w') {
                n += 1;
            } else if (control.charAt(i) == 'a') {
                n -= 10;
            } else if (control.charAt(i) == 'd') {
                n += 10;
            } else if (control.charAt(i) == 's') {
                n -= 1;
            }
        }
        return n;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(0, "wsdawsdassw"));

    }
}


