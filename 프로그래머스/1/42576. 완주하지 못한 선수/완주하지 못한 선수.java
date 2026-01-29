import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 한 명빼고 모든 선수가 마라톤을 완주했음.
        // 완주하지 못한 선수의 이름을 return
        Map<String, Integer> map = new HashMap<>();
        
        // 참가자 매핑
        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        
        // 완주자 처리
        for (int j = 0; j < completion.length; j++) {
            map.put(completion[j], map.get(completion[j]) - 1);
        }
        
        // 완주 못한 사람 찾기
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return "";
    }
}