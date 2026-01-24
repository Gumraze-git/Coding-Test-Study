import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        // 특정 프로세스가 몇 번째로 실행되는지
        // 실행 대기 큐에서 대기중인 프로세스를 하나 꺼낸다.
        // 큐에서 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면, 방금 꺼낸 프로세스를 다시 큐에 넣음.
        // 만약 그런 프로세스가 없다면, 방금 꺼낸 프로세스를 실행한다.
        // 한 번 실행한 프로세스는 다시 큐에 넣지 않고 종료함.
        int answer = 0;
        
        // 큐에 인덱스 데이터 적재
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < priorities.length; i++) {
            q.offer(i);
        }
        
        while (!q.isEmpty()) {
            int current = q.poll();
            
            // current보다 우선순위가 큰 프로세스가 큐에 남아있는지 검사
            boolean hasPrior = false;
            for (int idx : q) {
                if (priorities[idx] > priorities[current]) {
                    hasPrior = true;
                    break;
                }
            }
            
            // 더 높은 우선 순위가 있으면 current를 다시 뒤로 보냄
            if (hasPrior) {
                q.offer(current);
                continue;
            }
            
            // 더 높은 우선 순위가 없으면
            answer++;
            
            // 목표 location을 찾으면
            if (current == location) {
                return answer;
            }   
        }
        return answer;
    }
}