// 다익스트라 우선순위 큐
import java.util.*;

class Solution {
    // 그래프의 간선: (다음 마을, 도로 비용)
    static class Edge {
        int to;
        int cost;
        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
        @Override
        public String toString() {
            return "(" + to + ", " + cost + ")";
        }
    }
    
    // 우선순위 큐에 넣을 "상태": (현재 마을, 1번에서 여기까지의 비용)
    static class State {
        int node;
        int dist;
        State(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }
    }
    
    public int solution(int N, int[][] road, int K) {
        // 1번 부터 시작해서 K 시간 안에 주문을 받을 수 있는 마을의 개수 return
        // 가중치가 있는 그래프에서 단일 시작점, 최단 거리
        // 그래프 구성
        List<List<Edge>> graph = new ArrayList<>();        
        for (int i = 0; i <= N; i++) graph.add(new ArrayList<>());
        
        for (int[] r : road) {
            int a = r[0];
            int b = r[1];
            int c = r[2];
            
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c));
        }
        
        //System.out.println(graph);
        
        // distance 표 초기화
        int[] distance = new int[N + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[1] = 0; // 시작점은 비용 0
        
        // 우선순위 큐 초기화
        PriorityQueue<State> pq = 
            new PriorityQueue<>(Comparator.comparingInt(s -> s.dist));
        pq.add(new State(1, 0));
        
        // 다익스트라 루프
        while (!pq.isEmpty()) {
            State cur = pq.poll();
            int now = cur.node;         // 현재의 위치
            int distNow = cur.dist;     // 현재의 거리(비용)
            
            // 오래된 상태이거나 유의하지 않으면 버림
            if (distNow > distance[now]) continue;
            
            // now에서 갈 수 있는 모든 이웃을 확인
            for (Edge e : graph.get(now)) {
                int next = e.to;
                int newDist = distNow + e.cost;
                
                // 더 싼 비용이면 distance 갱신 + 새로운 상태를 pq에 추가
                if (newDist < distance[next]) {
                    distance[next] = newDist;
                    pq.add(new State(next, newDist));
                }
            }
        }
        
        // K 이하로 도달 가능한 마을 개수 세기
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (distance[i] <= K) count++;
        }
        
        return count;
    }
}