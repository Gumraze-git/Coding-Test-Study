import java.util.*;

class Solution {
    public int[] solution(String s) {
        // 문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나왔으면서,
        // 자신과 가장 가까운 곳이 있는 같은 글자가 어디 있는지
        // 처음 나오면, -1
        // 중복 출현이면, 가장 가까운 것과의 차이
        
        int len = s.length();
        int[] answer = new int[len];
        
        // 문자별 마지막 등장 위치 저장
        Map<Character, Integer> lastIndex = new HashMap<>();
        
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            
            if (!lastIndex.containsKey(c)) {
                answer[i] = -1;
            } else {
                answer[i] = i - lastIndex.get(c);
            }
            lastIndex.put(c, i);
        }
        
        return answer;
    }
}