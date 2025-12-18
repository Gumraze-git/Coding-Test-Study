import java.util.*;

class Solution {
    public String solution(String s) {
        // 한 번만 등장하는 문자를 사전 순으로 정렬
        
        Map<Character, Integer> countMap = new HashMap<>();
        
        // 문자 등장 횟수 세기
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        // 한 번만 등장한 문자 수집
        List<Character> list = new ArrayList<>();
        
        for (char c : countMap.keySet()) {
            if (countMap.get(c) == 1) {
                list.add(c);
            }
        }
        
        // 사전 순 정렬
        Collections.sort(list);
        
        // 문자열로 변환
        StringBuilder sb = new StringBuilder();
        
        for (char c : list) {
            sb.append(c);
        }

        return sb.toString();
    }
}