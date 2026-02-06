import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 게임의 실패율을 계산하여라
        // 실패율 = 스테이지에 도달했으나 아직 클리어 못한 플레이어수 / 스페이지에 도달한 플레이어수
        
        // 스테이지별로 현재 멈춰있는 인원 수 확인
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < stages.length; i++) {
            int s = stages[i];
            if (s <= N) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        
        // 스테이지에 도달한 플레이어수
        int reached = stages.length;
        
        // 정답
        List<double[]> list = new ArrayList<>();
        
        for (int i = 1; i <= N; i++) {
            // i stage에서 멈춘 사람
            int fail = map.getOrDefault(i, 0);
            
            // reached가 i 스테이지의 분모 역할
            double rate = (reached == 0) ? 0.0 : (double) fail / reached;
            list.add(new double[]{i, rate});
            
            // 다음 스테이지로 넘어가면, i에서 막힌 사람은 도달 못하므로 제외
            reached -= fail;
        }
        
        Collections.sort(list, (a, b) -> {
            // rate는 내림차순
            int cmp = Double.compare(b[1], a[1]);
            if (cmp != 0) return cmp;
            // stage는 오름차순
            return Double.compare(a[0], b[0]);
        });
        
        int[] answer = new int[N];
        for (int idx = 0; idx < N; idx++) {
            answer[idx] = (int) list.get(idx)[0];
        }
        return answer;
    }
}