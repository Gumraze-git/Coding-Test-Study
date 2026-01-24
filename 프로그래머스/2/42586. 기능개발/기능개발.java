import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 기능은 진도가 100%일 때 서비스에 반영 가능함.
        // 각 기능의 개발 속도가 모두 다름
        // 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됨.
        
        // 완료되는 날짜 파악
        List<Integer> days = new ArrayList<>();
        for (int num = 0; num < progresses.length; num++) {
            int remain = 100 - progresses[num];
            int day = (remain + speeds[num] - 1) / speeds[num]; // 올림
            days.add(day);
        }
        
        // Queue
        Queue<Integer> q = new ArrayDeque<>();
        for (int d : days) {
            q.offer(d);
        }
        
        List<Integer> result = new ArrayList<>();
        while (!q.isEmpty()) {
            int qDay = q.poll();
            int count = 1;
            
            while (!q.isEmpty() && q.peek() <= qDay) {
                q.poll();
                count++;
            }
            result.add(count);
        }
        
        
        int[] answer = result.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        return answer;
    }
}