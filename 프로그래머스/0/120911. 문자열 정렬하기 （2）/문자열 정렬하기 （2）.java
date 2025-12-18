import java.util.*;

class Solution {
    public String solution(String my_string) {
        // 영어 대소문자로 이루어진 문자열 모두 소문자로 바꾸로 정렬하라
        
        String answer = "";
        
        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += c;
            }
        }
        
        // 사전순으로 정렬
        char[] temp = answer.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
}