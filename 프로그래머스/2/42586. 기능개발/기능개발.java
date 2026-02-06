import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 각 기능이 언제 100이 되는지 확인해야함.
        // 앞에 있는 기능이 100이 아니면 뒤에 있는 기능들은 기다려야함.
        
        // 배포되지 않은 기능들의 완료 예정일을 순서대로 담음
        Queue<Integer> q = new ArrayDeque<>();
        
        // i번째 기능이 100%가 되는 날짜를 계산
        for (int i = 0; i < speeds.length; i++) {
            // 현재 남은 작업량: 현재 30이면 70남은
            int remain = 100 - progresses[i];
            
            // 완료까지 며칠이 필요한지: 30인 상태에서 70을 speed(30)으로 처리하려면 3일이 필요함.
            int days = (remain + speeds[i] - 1) / speeds[i];
            
            // q에 넣기
            q.offer(days);
        }
        
        System.out.println(q);
        
        // 각 배포마다 몇 개의 기능이 나갔는지 저장하는 리스트
        List<Integer> releases = new ArrayList<>();
        
        while (!q.isEmpty()) {
            // 이번 배포의 기준일
            int standard = q.poll();
            // 이번에 배포되는 기능의 수, 기준 기능이 하나 있으므로 1로 시작
            int count = 1;
            
            // 다음 기능이 기준 날짜보다 같은 날이거나 더 빨리 끝나면 같이 배포 가능
            while (!q.isEmpty() && q.peek() <= standard) {
                // 기준 기능보다 먼저 끝난 기능을 배포에 포함하기 위해 q에서 제거
                q.poll();
                count++;        // 기능 하나 추가
            }
            
            // 하나의 배포가 끝났으므로 이번 배포에서 나간 기능의 수를 기록
            releases.add(count);
        }
        
        int[] answer = new int[releases.size()];
        for (int i = 0; i < releases.size(); i++) {
            answer[i] = releases.get(i);
        }
        
        return answer;
    }
}