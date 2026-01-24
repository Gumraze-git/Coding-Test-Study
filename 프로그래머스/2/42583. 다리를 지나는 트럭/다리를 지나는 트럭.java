import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        // 대기 트럭 큐
        Queue<Integer> waitQ = new ArrayDeque<>();
        for (int w : truck_weights) {
            waitQ.offer(w);
        }

        // 다리 상태 큐
        Queue<Integer> bridgeQ = new ArrayDeque<>();
        for (int i = 0; i < bridge_length; i++) {
            bridgeQ.offer(0);
        }

        int time = 0;
        int bridgeWeightSum = 0;

        // 대기 트럭이 남아 있거나, 다리 위에 무게가 남아 있으면 계속
        while (!waitQ.isEmpty() || bridgeWeightSum > 0) {

            // 시간 1초 경과
            time++;

            // 다리 위 트럭 한 칸 전진
            int out = bridgeQ.poll();
            bridgeWeightSum -= out;

            // 새 트럭 진입 가능 여부 판단
            if (!waitQ.isEmpty() && bridgeWeightSum + waitQ.peek() <= weight) {
                int in = waitQ.poll();     // 트럭 진입
                bridgeQ.offer(in);
                bridgeWeightSum += in;
            } else {
                bridgeQ.offer(0);          // 진입 불가, 빈 칸 유지
            }
        }

        return time;
    }
}
