class Solution {    
    public int solution(int n, int[][] computers) {
        // 컴퓨터의 개수: n
        // 연결에 대한 정보: computers
        // i번 컴퓨터와 j번 컴퓨터가 연결되어 있으면 computers[i][j] = 1
        // 네트워크의 개수를 return하라
        
        // 네트워크의 수
        int networkCount = 0;
        // 방문한 네트워크 처리
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            // 방문하지 않은 컴퓨터
            if (!visited[i]) {
                // 방문하지 않은 컴퓨터가 있는 네트워크 찾음
                networkCount++;
                
                // 같은 네트워크에 있는 컴퓨터들 모두 방문 처리
                dfs(i, computers, visited);
            }
        }
        
        return networkCount;
    }
    // i번 컴퓨터와 같은 네트워크의 컴퓨터들을 모두 visited함.
    private void dfs(int i, int[][] computers, boolean[] visited) {
        // 나 자신 방문 처리
        visited[i] = true;
        
        // 나와 연결된 모든 컴퓨터 확인
        for (int j = 0; j < computers.length; j++) {
            // 연결되어 있고, 아직 방문하지 않았다면
            if (computers[i][j] == 1 && !visited[j]) {
                // 해당 컴퓨터에서도 동일하게 탐색
                dfs(j, computers, visited);
            }
        }
        
        
    }
}