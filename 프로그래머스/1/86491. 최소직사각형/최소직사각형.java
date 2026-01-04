import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        // 지갑의 크기를 결정함.
        // 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들었을 때의 크기를 return
        
        // 기존 데이터 형식 복사
        int[][] answer = new int[sizes.length][2];
        
        // 카드를 (min, max) 형태로 전환
        for (int i = 0; i < sizes.length; i++) {
            int min = Math.min(sizes[i][0], sizes[i][1]);
            int max = Math.max(sizes[i][0], sizes[i][1]);
            
            answer[i][0] = min;
            answer[i][1] = max;

            System.out.println(Arrays.toString(answer[i]));
        }
        
        // 지갑의 크기 결정
        int wid = answer[0][0];
        int hei = answer[0][1];
        
        for (int i = 1; i < answer.length; i++) {
            wid = Math.max(wid, answer[i][0]);
            hei = Math.max(hei, answer[i][1]);
        }
        
        return wid * hei;
    }
}