class Solution {
    public int solution(int[][] board) {
        // 지뢰는 2차원 배열 board에 1로 표시되어 있음.
        // board에는 지뢰가 매설된 지역 1과, 지뢰가 없는 지역 0만 존재함.
        // 위험지역은 지뢰의 인접한 위, 아래, 좌, 우, 대각선임.
        // 안전한 지역의 칸 수를 return하라
        
        // 보드의 크기
        int n = board.length;
        int m = board[0].length;
        
        // 정답
        int answer = 0;
        
        // 위험지역 8방향
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        // 위험지역 표시 배열
        boolean[][] danger = new boolean[n][m];
        
        // 지뢰가 있는 모든 좌표 확인
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // 지뢰가 있는 좌표 표기
                if (board[i][j] == 1) {
                    danger[i][j] = true;
                    
                    for (int d = 0; d < 8; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];
                        
                        if (nx >= 0 && nx< n && ny >= 0 && ny < m) {
                            danger[nx][ny] = true;
                        }
                    }
                }
            }
        }
        
        // 안전한 지역 카운트
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!danger[i][j]) {
                    answer++;
                }
            }
        }
        return answer;
    }
}