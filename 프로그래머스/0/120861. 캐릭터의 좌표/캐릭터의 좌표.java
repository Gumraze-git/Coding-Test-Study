class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        // up, down, left, right 방향키가 있음.
        // 모든 입력이 끝난 뒤의 캐릭터의 좌표를 return하라.
        int[] answer = new int[2];
        
        // 보드의 한계 계산
        int xLim = board[0] / 2;
        int yLim = board[1] / 2;
        
        // 입력에 따라 이동
        for (String s : keyinput) {
            if (s.equals("up")) {
                if (answer[1] < yLim) answer[1]++;
            } else if (s.equals("down")) {
                if (answer[1] > -yLim) answer[1]--;
            } else if (s.equals("left")) {
                if (answer[0] > -xLim) answer[0]--;
            } else { // right
                if (answer[0] < xLim) answer[0]++;
            }
        }
        return answer;
    }
}