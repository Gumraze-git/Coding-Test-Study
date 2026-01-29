import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 실패율 = (i 스테이지에서 멈춘 사람 수) / (i 스테이지에 도달한 사람 수)
        // stages의 값:
        // - 1..N : 해당 스테이지에서 아직 클리어 못하고 멈춘 상태(= 실패)
        // - N+1  : 모든 스테이지 클리어

        // 1) 스테이지별 "실패자 수" 집계: failCountMap[i] = i에서 멈춘 사람 수
        Map<Integer, Integer> failCountMap = new HashMap<>();
        for (int stg : stages) {
            if (stg <= N) {
                failCountMap.put(stg, failCountMap.getOrDefault(stg, 0) + 1);
            }
        }

        // 2) 핵심: "도달자 수(reached)"를 누적으로 관리하면서 실패율 계산
        // reached = 현재 스테이지 i에 도달한 사람 수
        // 처음 i=1일 때는 모든 유저가 1스테이지에 도달했다고 볼 수 있으므로 stages.length로 시작
        int reached = stages.length;

        // stageFailure[i]에 실패율 저장 (인덱스 1..N 사용)
        double[] stageFailure = new double[N + 1];

        for (int i = 1; i <= N; i++) {
            int fail = failCountMap.getOrDefault(i, 0);

            if (reached == 0) {
                // i 스테이지에 도달한 사람이 0명이면 실패율은 0
                stageFailure[i] = 0.0;
            } else {
                // 실패율 계산
                stageFailure[i] = (double) fail / reached;
            }

            // 다음 스테이지(i+1) 도달자 수는
            // 현재 i에서 "멈춘 사람(fail)"을 제외한 나머지
            reached -= fail;
        }

        // 3) 이제 정렬: 실패율 내림차순, 실패율 같으면 스테이지 번호 오름차순
        List<Integer> stagesOrder = new ArrayList<>();
        for (int i = 1; i <= N; i++) stagesOrder.add(i);

        stagesOrder.sort((a, b) -> {
            int cmp = Double.compare(stageFailure[b], stageFailure[a]); // 실패율 내림차순
            if (cmp != 0) return cmp;
            return Integer.compare(a, b); // 스테이지 번호 오름차순
        });

        // 4) List<Integer> -> int[]
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) answer[i] = stagesOrder.get(i);

        return answer;
    }
}
