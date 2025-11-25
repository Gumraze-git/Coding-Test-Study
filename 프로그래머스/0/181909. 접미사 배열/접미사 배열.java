import java.util.*;

class Solution {
    public List<String> solution(String my_string) {
        // 접미사 배열
        // banana의 모든 접미사를 사전순으로 정렬
        List<String> answer = new ArrayList<>();
        
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer.add(my_string.substring(i, my_string.length()));
        }
        Collections.sort(answer); // List 정렬
        return answer;
    }
}