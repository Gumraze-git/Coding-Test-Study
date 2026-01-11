import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        // wantMap 생성 (기준 Map)
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        // windowMap 생성 (이동 Map)
        Map<String, Integer> windowMap = new HashMap<>();

        // 초기 윈도우 (0~9)
        for (int i = 0; i < 10; i++) {
            windowMap.put(
                discount[i],
                windowMap.getOrDefault(discount[i], 0) + 1
            );
        }

        // 슬라이딩 윈도우
        for (int i = 0; i <= discount.length - 10; i++) {

            // 현재 상태 비교
            if (windowMap.equals(wantMap)) {
                answer++;
            }

            // 마지막 윈도우면 종료
            if (i == discount.length - 10) break;

            // 왼쪽 제거
            String out = discount[i];
            windowMap.put(out, windowMap.get(out) - 1);
            if (windowMap.get(out) == 0) {
                windowMap.remove(out);
            }

            // 오른쪽 추가
            String in = discount[i + 10];
            windowMap.put(in, windowMap.getOrDefault(in, 0) + 1);
        }

        return answer;
    }
}
