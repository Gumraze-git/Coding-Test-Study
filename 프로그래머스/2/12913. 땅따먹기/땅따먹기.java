import java.util.*;

class Solution {
    int solution(int[][] land) {
        // 행의 개수
        int n = land.length;
        // row행의 col열을 밟았을 때 얻을 수 있는 최대 점수
        int[][] dp = new int[n][4];
        
        // 0번째 행은 그대로 시작값
        for (int c = 0; c < 4; c++) {
            dp[0][c] = land[0][c];
        }
        
        // 1번 행부터 누적
        for (int r = 1; r < n; r++) {
            // 현재 행의 각 열을 선택함.
            for (int c = 0; c < 4; c++) {
                // 이전 행에서, 현재 열을 제외하고 선택할 수 있는 최대 점수
                int bestPrev = 0;
                // 같은 열은 제외한 나머지 열 중 최댓값을 찾는다.
                for (int k = 0; k < 4; k++) {
                    // 같은 열은 금지
                    if (k == c) continue;
                    bestPrev = Math.max(bestPrev, dp[r - 1][k]);
                }
                // 현재 칸의 점수 + 이전 행에서 가능한 최대 점수
                dp[r][c] = land[r][c] + bestPrev;
            }
        }
        
        // 마지막 행에서 최댓값
        int answer = 0;
        for (int c = 0; c < 4; c++) {
            answer = Math.max(answer, dp[n - 1][c]);
        }
        return answer;
    }
}