import java.util.*;

class Solution {
    public List<String> solution(String[] picture, int k) {
        
        List<String> answer = new ArrayList<>();
        
        // 가로 확대 수행
        for (String s : picture) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                sb.append(String.valueOf(c).repeat(k));
            }
            for (int i = 0; i < k; i++) {
                answer.add(sb.toString());
            }
        }
        
        return answer;
    }
}