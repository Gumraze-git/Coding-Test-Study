// 20260206 DP 연습
import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        // 모든 값을 업데이트 해가면서 처리하면 됨.
        int n = triangle.length;
        
        // triangle[i][j]를 i,j까지의 최대 합으로 덮어쓰면서 풀이
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                // CASE 1: 맨 왼쪽 -> 위에서 바로 내려오는 경우만 가능
                if (j == 0) {
                    triangle[i][j] = triangle[i-1][j] + triangle[i][j];
                } else if (j == triangle[i].length - 1) {
                    // CASE 2: 맨 오른쪽 -> 위에서 바로 내려오는 경우만 가능
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i][j];   
                } else {
                    // CASE 3: 중간 위치인 경우
                    triangle[i][j] = Math.max(triangle[i-1][j-1], triangle[i-1][j]) + triangle[i][j];
                }   
            }
        }
        // 마지막 행에서 최댓값이 정답임.
        int answer = 0;
        for (int v : triangle[n - 1]) {
            answer = Math.max(answer, v);
        }
        return answer;
    }
}