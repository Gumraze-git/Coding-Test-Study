// 20260203 dfs 연습
class Solution {
    
    // max값을 전역으로 관리
    private int max = 0;
    public int solution(int k, int[][] dungeons) {
        // 각 던전을 탐험하기 위해서는 최소 필요 피로도와 소모 피로도를 고려해야함.
        // 최대한 많이 던전을 탐험하려고 함.
        // 최대 방문 던전 수를 return
        // 해당 던전을 방문 했는지
        boolean[] visited = new boolean[dungeons.length];
        
        dfs(k, 0, visited, dungeons);
        return max;
    }
    
    // dfs
    // 현재 상태 k, 클리어한 던전의 수 cleared, 방문 처리 visited, 던전
    private void dfs(int k, int cleared, boolean[] visited, int[][] dungeons) {
        // 최대값 갱신
        max = Math.max(max, cleared);
        
        // 모든 던전에 대하여
        for (int i = 0; i < dungeons.length; i++) {
            // 방문하지 않았으며, 최소 피로도가 달성되어 있으면
            if (!visited[i] && k >= dungeons[i][0]) {
                // 방문 상태 업데이트
                visited[i] = true;
                
                // 피로도 업데이트
                int next = k - dungeons[i][1];
                
                // 다음 던전 이동, 클리어한 던전 업데이트
                dfs(next, cleared + 1, visited, dungeons);
                
                // 되돌리기
                visited[i] = false;
            }
        }        
    }
}