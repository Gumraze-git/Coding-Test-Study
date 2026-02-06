import java.util.*;

class Solution {
    public int solution(String dartResult) {
        // 3번의 기회, 각 기회마다 0~10
        // S,D,T = 1제곱,2제곱,3제곱
        // * = 해당 점수와 이전 점수 2배
        // # = 해당 점수 음수
        // * / # 는 옵션이며, 없을 수도 있음

        // 1) 문자 큐로 만들기
        Queue<String> q = new ArrayDeque<>();
        for (String s : dartResult.split("")) q.offer(s);

        int[] scores = new int[3];
        int idx = -1; // 현재 처리 중인 라운드 인덱스(0~2)

        while (!q.isEmpty()) {
            String cur = q.poll();

            // 2) 숫자 시작이면: 점수 파싱(특히 10 처리)
            if (isDigit(cur)) {
                int num = cur.charAt(0) - '0';

                // "10" 처리: cur이 "1"이고 다음이 "0"이면 묶어서 10
                if (num == 1 && !q.isEmpty() && "0".equals(q.peek())) {
                    q.poll();
                    num = 10;
                }

                idx++;              // 새 라운드 시작
                scores[idx] = num;  // 기본 점수 저장
                continue;
            }

            // 3) 보너스(S/D/T): 현재 라운드 점수 제곱 적용
            if ("S".equals(cur) || "D".equals(cur) || "T".equals(cur)) {
                if ("S".equals(cur)) {
                    // 1제곱: 그대로
                } else if ("D".equals(cur)) {
                    scores[idx] = scores[idx] * scores[idx];
                } else { // "T"
                    scores[idx] = scores[idx] * scores[idx] * scores[idx];
                }

                // 보너스 뒤에는 옵션(*, #)이 올 수도 있고 안 올 수도 있음
                if (!q.isEmpty()) {
                    String opt = q.peek();
                    if ("*".equals(opt)) {
                        q.poll();
                        scores[idx] *= 2;
                        if (idx - 1 >= 0) scores[idx - 1] *= 2;
                    } else if ("#".equals(opt)) {
                        q.poll();
                        scores[idx] *= -1;
                    }
                }
                continue;
            }

            // cur이 '*', '#'로 단독으로 오는 케이스는 정상 입력에선 보너스 뒤에서 처리됨
        }

        return scores[0] + scores[1] + scores[2];
    }

    private boolean isDigit(String s) {
        char c = s.charAt(0);
        return c >= '0' && c <= '9';
    }
}
