package org.example;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(999));
    }
}

class Solution {
    public int solution(int hp) {
        return  hp / 5 + (hp % 5) / 3  + ((hp % 5) % 3);
    }
}