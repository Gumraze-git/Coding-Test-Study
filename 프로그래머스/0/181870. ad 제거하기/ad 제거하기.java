import java.util.*;

class Solution {
    public List<String> solution(String[] strArr) {
        // 배열 내 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 반환
        List<String> answer = new ArrayList<>();
        for (String s : strArr) {
            if (!s.contains("ad")) {
                answer.add(s);
            }
        }
        return answer;
    }
}