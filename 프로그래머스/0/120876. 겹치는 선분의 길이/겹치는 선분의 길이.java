import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        // 선분 3개가 평행하게 있음. 
        // 세 선분의 시작과 끝이 들어가 있는 2차원 배열 lines
        // 두 개 이상의 선분이 겹치는 부분의 길이를 return
        
        int answer = 0;
        
        // count 배열 생성
        int max = Math.max(lines[0][1], Math.max(lines[1][1], lines[2][1]));
        int min = Math.min(lines[0][0], Math.min(lines[1][0], lines[2][0]));
        int[] count = new int[max - min];
        
        // line이 있는 곳에 1씩 더함
        for (int i = 0; i < lines.length; i++) {
            for (int x = lines[i][0]; x < lines[i][1]; x++) {
                count[x - min]++;
            }
        }
        
        for (int i : count) {
            if (i > 1) {
                answer++;
            }
        } 
        
        return answer;
    }
}