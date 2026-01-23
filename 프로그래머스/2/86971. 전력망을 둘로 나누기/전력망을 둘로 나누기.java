import java.util.*;

class Solution {
    
    
    private List<List<Integer>> graph;
    private boolean[] visited;
    
    
    public int solution(int n, int[][] wires) {
        
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] w : wires) {
            int a = w[0];
            int b = w[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        System.out.println(graph);
        
        int answer = Integer.MAX_VALUE;
        
        for (int[] w : wires) {
            // 끊은 상태 정의
            int cutA = w[0];
            int cutB = w[1];
            
            visited = new boolean[n + 1];
            
            // 한쪽 컴포넌트 크기 세기
            int count = dfsCount(cutA, cutA, cutB);
            
            int diff = Math.abs(n - 2 * count);
            answer = Math.min(answer, diff);
        }
        
        return answer;
    }
    
    private int dfsCount(int node, int cutA, int cutB) {
        if (visited[node]) return 0;
        
        visited[node] = true;
        int count = 1;
        
        for (int next : graph.get(node)) {
            if ((node == cutA && next == cutB) || (node == cutB && next == cutA)) {
                continue;
            }
            
            count += dfsCount(next, cutA, cutB);
        }
        
        return count;
    }
    
}