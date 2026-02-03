// 20260203 연습
class Solution {
    public int solution(int n, int[][] computers) {
        // 네트워크 찾기
        // 네트워크를 찾으면 해당 네트워크와 연결된 곳들은 모두 방문 처리
        
        // 네트워크의 개수
        int count = 0;
        
        // 방문확인 배열 = 노드의 수많큼
        boolean[] visited = new boolean[n];
        
        // 모든 노드에 대해서
        for (int i = 0; i < n; i++) {
            // 방문하지 않은 노드가 있다면
            if (!visited[i]) {
                // 네트워크의 수 증가
                count++;
                // 탐색 수행
                dfs(i, n, visited, computers);
            }
        }
        
        return count;
    }
    
    // dfs 구현
    private void dfs(int i, int n, boolean[] visited, int[][] computers) {
        // 탐색을 시작하며 i번째는 방문 완료 처리
        visited[i] = true;
        
        // i번 컴퓨터와 j번 컴퓨터가 연결되어 있으면 computers[i][j] = 1
        // 모든 j에 대해서
        for (int j = 0; j < n; j++) {
            // 연결되어 있다는 것은 하나의 네트워크라는 의미 -> computers[i][j] == 1
            // 연결되어 있는데 방문처리를 하지 않았다면? -> !visited[j]
            if (computers[i][j] == 1 && !visited[j]) {
                // 다음 방문 처리를 위한 탐색 수행
                dfs(j, n, visited, computers);
            }
        }
    }
}