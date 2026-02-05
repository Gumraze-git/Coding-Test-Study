import java.util.*;

class Solution {
    public int[] solution(String s) {
        // 바깥 괄호 제거
        // "},{"를 기준으로 각 집합 문자열 분리
        
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        
        String body = s.substring(2, s.length() - 2);
        String[] groups = body.split("\\},\\{");
        
        // 문자열 길이 오름차순으로 정렬
        Arrays.sort(groups, Comparator.comparingInt(String::length));
        
        for (String g : groups) {
            if (g.isEmpty()) continue;
            
            String[] nums = g.split(",");
            for (String numStr : nums) {
                int val = Integer.parseInt(numStr);
                // 처음 보는 원소면 추가
                if (seen.add(val)) {
                    result.add(val);
                }
            }
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}