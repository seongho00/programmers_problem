package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {

        int time = 0;
        int maxHealth = health;
        int castingTime = bandage[0];
        int recoveryBySec = bandage[1];
        int plusRecovery = bandage[2];
        int success = 0;

        int attacksIndex = 0;

        while (time <= attacks[attacks.length - 1][0]) {

            int attackTime = attacks[attacksIndex][0];
            int damage = attacks[attacksIndex][1];
            // 공격 당했을 때
            if (time == attackTime) {
                health -= damage;
                attacksIndex++;
                success = 0;
                if (health <= 0) {
                    return -1;
                }
            } else { // 공격 타이밍이 아닐 때

                //연속 성공 여부
                success++;
                // 피 채우기
                health += recoveryBySec;
                // 연속 성공이 성공하면? 추가체력회복
                if (success == castingTime) {
                    health += plusRecovery;
                    success = 0;
                }

                // 체력이 만땅이상이면?
                if (health > maxHealth) {
                    health = maxHealth;
                }
            }
            time++;
        }

        return health;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{3, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}}));

    }
}


