import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> result = new Stack<>();
        
        for (int m : moves) {
            int col = m - 1;
            for (int[] b : board) {
                // 비어있으면 pass
                if (b[col] == 0) continue;
                
                // 비어있지 않으면
                int doll = b[col];      // 인형 선택
                b[col] = 0;             // 인형 뽑기
                
                if (!result.isEmpty() && result.peek() == doll) {
                    result.pop();
                    answer += 2;
                } else {
                    result.push(doll);
                }
                break; // 한 번 집으면 move 종료
            }
        }
        return answer;
    }
}