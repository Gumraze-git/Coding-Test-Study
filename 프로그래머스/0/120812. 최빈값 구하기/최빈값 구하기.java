import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        int answer = -1;
        int count = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                count = entry.getValue();
                answer = entry.getKey();
            }
        }
        
        // 최대 빈도값이 몇 번 등장했는지 세기
        int countMax = 0;
        for (int value : map.values()) {
            if (value == count) countMax++;
        }

        // 여러 개면 -1 반환
        if (countMax > 1) return -1;

        return answer;
    }
}
