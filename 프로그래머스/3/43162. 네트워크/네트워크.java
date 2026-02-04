// 20260204 dfs 연습
class Solution {
    public int solution(int n, int[][] computers) {
        // 네트워크의 개수 찾기
        int count = 0;          // 네트워크의 수
        boolean[] visited = new boolean[n];     // 방문 여부 확인
        
        // 모든 컴퓨터에 대해서
        for (int i = 0; i < n; i++) {
            // 방문하지 않은 노드가 있다면
            if (!visited[i]) {                
                // 방문한 네트워크의 수 업데이트
                count++;
                // 해당 노드와 관련된 네트워크를 확인
                dfs(i, n, computers, visited);
            }
        }
        
        
        return count;
    }
    
    // dfs: 네트워크에 속한 노드들을 전부 방문 처리하기
    private void dfs(int i, int n, int[][] computers, boolean[] visited) {
        // 현재 노드 방문 처리
        visited[i] = true;
        
        // count를 언제 올려야하는지
        for (int j = 0; j < n; j++) {
            // i와 연결된 모든 j중에서 아직 방문하지 않은 j만 dfs(j)
            if (computers[i][j] == 1 && !visited[j]) {
                dfs(j, n, computers, visited);
            }
        }
        
    }
}