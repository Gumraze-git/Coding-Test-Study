import java.util.*;

class Solution {
    public int solution(int[] array) {
        // 7이 총 몇개 있는지?
        int answer = 0;
        StringBuilder result = new StringBuilder();
        
        // 전부 String으로 만들어서 String에 append 함.
        for (int i : array) {
            result.append(String.valueOf(i));
        }
        
        // 해당 String에서 7의 개수 세기
        for (char c : result.toString().toCharArray()) {
            if (c - '0' == 7) {
                answer++;
            }
        }
        
        return answer;
    }
}