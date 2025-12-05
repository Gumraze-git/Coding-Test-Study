class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        int x = board.length;
        int y = board[0].length;
        
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i + j <= k) {
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }
}