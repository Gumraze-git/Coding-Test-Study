// 20260206 DFS 연습

import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        // 네트워크의 개수를 찾아서 return 하여라
        
        // 각 노드의 방문을 수행했는지 확인하기 위한 상태
        boolean[] visited = new boolean[n];
        
        // 방문했다는 것은 새로운 네트워크를 찾았다는 의미 -> answer++
        int answer = 0;
        
        // 모든 노드에 방문함
        for (int node = 0; node < n; node++) {
            // 방문을 안했으면 방문 처리
            if (!visited[node]) {
                visited[node] = true;
                // 방문을 했다는 것은 새로운 네트워크를 찾았다는 읨
                answer++;
                
                // 방문한 노드와 연결이 되어 있는 노드들을 처리해야함.
                dfs(node, visited, computers);
            }
        }
        return answer;
    }
    
    // dfs: 현재 노드는 방문 처리를 했음, 인접 노드에 대한 방문 처리를 해주어야함.
    // node: 현재의 노드
    // vistied: 방문 상태
    // computers: 원본 배열
    private void dfs(int node, boolean[] visited, int[][] computers) {
        // 연결되어 있는 노드 찾기
        for (int linked = 0; linked < visited.length; linked++) {
            // 1이면 연결인데, 연결인 상태이면서 방문을 안했어야함.
            // 다음 노드가 방문을 안했어야함. 다음 노드는 뭐지"?
            // visited[0] = true
            // visited[1] = false -> false이어야함. -> 그러니까 !visited[linked]
            if (computers[node][linked] == 1 && !visited[linked]) {
                // 그러면 연결되어 있고 방문을 안한 노드가 있으면 해당 노드는 방문 처리 해주어야함.
                visited[linked] = true;
                
                // 그리고 그 노드가 또 다른 노드랑 연결되어 있을 수 있으니까 다시 들어감
                dfs(linked, visited, computers);
            }
            // 여기서 dfs는 node에 대한 모든 처리가 끝남.
            // 다른 노드로 가야함.
        }
        
    }
}