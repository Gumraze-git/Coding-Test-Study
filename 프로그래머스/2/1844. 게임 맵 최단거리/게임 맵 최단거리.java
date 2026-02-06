// 20260206 BFS -> 가중치 없는 최단 거리
import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        // map의 열과 행의 크기
        int n = maps.length;
        int m = maps[0].length;
        
        // 현재 상태: (r, c, dist)
        Queue<int[]> queue = new ArrayDeque<>();
        
        // 각 칸까지의 최단거리, 0이면 미 방문
        int[][] distMap = new int[n][m];
        
        // 시작 상태 정의
        distMap[0][0] = 1;
        queue.offer(new int[]{0, 0, 1});
        
        // 갈수 있는 방향 정의
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        // BFS 도달 가능한 모든 상태를 전부 처리함.
        while (!queue.isEmpty()) {
            // 큐에서 하나를 꺼냄
            int[] cur = queue.poll();
            
            // 현재 상태 정의
            int r = cur[0];     // 현재 위치: row
            int c = cur[1];     // 현재 위치: col
            int dist = cur[2];  // 현재 위치까지의 이동한 거리
            
            // 목적지에 도달하면 최단거리임.
            if (r == n-1 && c == m-1) {
                return dist;
            }
            
            // 다음 상태 처리: 모든 방향에 대해 체크함.
            for (int k = 0; k < 4; k++) {
                // 다음 방향
                int nextRow = r + dr[k];
                int nextCol = c + dc[k];
                
                // 가능한 방향인지 확인
                if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= m) continue;
                
                // 벽이 있는지 확인
                if (maps[nextRow][nextCol] == 0) continue;
                
                // 방문한 경우 넘어감: 0 이면 방문 안한 상태임
                if (distMap[nextRow][nextCol] != 0) continue;
                
                // 다음 상태 업데이트
                // 한 칸 움직였으므로 +1
                distMap[nextRow][nextCol] = dist + 1;
                
                // 다음 상태로 업데이트
                queue.offer(new int[]{nextRow, nextCol, dist + 1});
            }
        }
        // 끝까지 못갔으면 도달 불가
        return -1;
    }
}