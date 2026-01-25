import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        // 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶음.
        // 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해
        // Leo는 스코빌 지수가 가장 낮은 2개의 음식을 다음과 같이 섞어야함
        
        // 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 스코빌 지수 * 2)
        // 모든 음식의 스코빌 지수가 K이상이 될 때까지 반복함.
        // 모든 음식의 스코빌 지수를 K이상으로 만들기 위해 섞어야하는 최소 횟수를 return하라
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int scv : scoville) {
            pq.offer(scv);
        }
        int answer = 0;
        
        // 최소값이 K보다 크면 종료
        while (pq.peek() < K) {
            if (pq.size() < 2) return -1;
            
            int a = pq.poll();
            int b = pq.poll();
            int mixed = a + (b * 2);
            pq.offer(mixed);
            answer++;
            
        }
        return answer;
    }
}