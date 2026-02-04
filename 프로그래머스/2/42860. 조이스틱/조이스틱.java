// 20260204 그리디 연습
class Solution {
    public int solution(String name) {
        // 수직 이동
        int vertical = 0;
        
        // 수직 이동 합
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            
            int up = c - 'A';
            int down = 'Z' - c + 1;
            
            vertical += Math.min(up, down);
        }
        
        // 가로 이동
        int horizontal = name.length() - 1;
        
        for (int i = 0; i < name.length(); i++) {
            int next = i + 1;
            
            // i 다음부터 연속된 'A' 구간 스킵
            while (next < name.length() && name.charAt(next) == 'A') {
                next++;
            }
            
            // 케이스 1) 오른쪽으로 i까지 갔다가 다시 돌아와서 끝으로
            int moveRightThenBack = 2 * i + (name.length() - next);
            
            // 케이스 2) 왼쪽부터 처리하고 다시 돌아옴
            int moveLeftThenBack = i + 2 * (name.length() - next);
            
            horizontal = Math.min(horizontal, Math.min(moveRightThenBack, moveLeftThenBack));
        }
        
        return vertical + horizontal;
    }
}