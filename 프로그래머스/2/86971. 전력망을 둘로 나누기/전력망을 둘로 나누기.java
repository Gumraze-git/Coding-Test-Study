// 20260206 DFS 연습
import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        // 목표
        // - wires에서 전선을 하나 끊었을 때 그래프가 2개의 연결 요소로 나뉜다.
        // - 두 연결 요소의 노드 개수의 차이의 최솟값을 구하라
        
        // 인접 리스트 그래프 생성
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {   // 배열만 만들면 내부 요소가 null 이므로 리스트 배열 넣기
            graph[i] = new ArrayList<>();
        }    
        
        // wires 배열을 graph 배열에 넣기
        for (int[] w : wires) {
            int a = w[0] - 1;
            int b = w[1] - 1;
            graph[a].add(b);        // a번 노드는 b번 노드와 연결되어 있음.
            graph[b].add(a);        // b번 노드는 a번 노드와 연결되어 있음.
        }
        
        // 각 간선을 하나씩 제외해가면서 노드의 개수를 세면 됨.
        // 최소값 비교를 위해 정답을 최댓값으로 설정함.
        int answer = Integer.MAX_VALUE;
        
        for (int[] cut : wires) {
            // 자를 간선 선택
            int cutA = cut[0] - 1;
            int cutB = cut[1] - 1;
            
            boolean[] visited = new boolean[n];
            
            // 한쪽 컴포넌트 크기만 세면 됨.
            int count = dfs(cutA, -1, visited, graph, cutA, cutB);
            
            // 차이 계산
            int diff = Math.abs(n - 2 * count);
            answer = Math.min(answer, diff);
        }
        return answer;
    }
    
    private int dfs(int node, int parent, boolean[] visited, List<Integer>[] graph, int cutA, int cutB) {
        // 이번 노드 방문 처리
        visited[node] = true;
        
        // 이번 count 갱신
        int count = 1;
        
        for (int next : graph[node]) {
            // 이번 탐색에서만 cut한 간선은 건너뛰지
            if ((node == cutA && next == cutB) || (node == cutB && next == cutA)) {
                continue;
            }
            
            // 방문하지 않은 노드들의 개수 탐색
            if (!visited[next]) {
                count += dfs(next, node, visited, graph, cutA, cutB);
            }
        }
        
        return count;
    }
}