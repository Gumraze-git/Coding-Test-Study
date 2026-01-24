import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];

        Deque<Integer> stack = new ArrayDeque<>(); // 인덱스 스택

        for (int i = 0; i < n; i++) {
            // 현재 가격이 더 낮아지는 순간, 보류 중이던 과거 시점들의 답 확정
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int k = stack.pop();
                answer[k] = i - k;
            }
            // 현재 시점은 아직 떨어졌는지 모르므로 보류
            stack.push(i);
        }

        // 끝까지 떨어지지 않은 시점들 처리
        while (!stack.isEmpty()) {
            int k = stack.pop();
            answer[k] = (n - 1) - k;
        }

        return answer;
    }
}
