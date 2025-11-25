import java.util.*;

class Solution {
    public List<Integer> solution(String myString) {
        // x를 기준으로 문자열의 길이를 반환
        List<Integer> answer = new ArrayList<>();
        int count = 0;
        
        for (char c : myString.toCharArray()) {
            if (c == 'x') {
                answer.add(count);
                count = 0;
            } else {
                count++;
            }
        }
        
        // 마지막 구간 처리
        answer.add(count);
        return answer;
    }
}