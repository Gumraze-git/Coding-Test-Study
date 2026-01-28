import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        // n번째 글자를 기준으로 오름차순 정렬을 수행함.
        
        Arrays.sort(strings, (a, b) -> {
            // 문자가 동일한 경우에는 사전 순으로
            if (a.charAt(n) == b.charAt(n)) {
                return a.compareTo(b);
            }
            // n을 기준으로 오름차순으로
            return a.charAt(n) - b.charAt(n);
        });
        
        return strings;
    }
}