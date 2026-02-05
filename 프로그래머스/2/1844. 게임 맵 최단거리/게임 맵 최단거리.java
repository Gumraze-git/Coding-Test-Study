// 20260205 BFS 문제
import java.util.*;

class Solution {
    
    // 상하좌우 이동을 위한 방향 벡터
    private int[] DR = {-1, 1, 0, 0};
    private int[] DC = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int rows = maps.length;
        int cols = maps[0].length;
        
        // 방문 여부 + 최단거리 저장 배열
        int[][] distance = new int[rows][cols];
        
        // 시작점 (0, 0)이 막혀있으면 도착 불가
        if (maps[0][0] == 0) return -1;
        
        // BFS
        Queue<int[]> queue = new ArrayDeque<>();
        
        // 시작점 초기화
        queue.add(new int[]{0, 0});
        distance[0][0] = 1;     // 시작 칸도 거리 1로 카운드
        
        // BFS 루프
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int r = cur[0];
            int c = cur[1];
            
            // 현재 칸에서 4방향으로 이동 시도
            for (int k = 0; k < 4; k++) {
                int nr = r + DR[k];
                int nc = c + DC[k];
                
                // 맵 범위 밖이면 무시
                if (nr < 0 || nr >= rows || nc < 0 || nc >= cols) continue;
                
                // 벽이면 이동 불가
                if (maps[nr][nc] == 0) continue;
                
                // 이미 방문한 칸이면 다시 갈 필요 없음
                if (distance[nr][nc] != 0) continue;
                
                // 방문 처리 + 거리 갱신
                distance[nr][nc] = distance[r][c] + 1;
                
                // 다음 탐색
                queue.add(new int[]{nr, nc});
            }
        }
        
        
        // 도달 못했으면 여전히 0이므로 -1 반환
        return (distance[rows - 1][cols - 1] == 0)? -1 : distance[rows - 1][cols - 1];
    }
}