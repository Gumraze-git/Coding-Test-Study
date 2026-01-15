import java.util.*;

class Solution {
    public int solution(String s) {
        int len = s.length();
        int answer = 0;

        for (int i = 0; i < len; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;   // 이 회전이 유효한지

            for (char c : rotated.toCharArray()) {

                // 여는 괄호
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } 
                // 닫는 괄호
                else {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }

                    char open = stack.pop();

                    if (c == ')' && open != '(') {
                        isValid = false;
                        break;
                    }
                    if (c == ']' && open != '[') {
                        isValid = false;
                        break;
                    }
                    if (c == '}' && open != '{') {
                        isValid = false;
                        break;
                    }
                }
            }

            // 모든 문자 처리 후에도 스택이 비어 있어야 함
            if (isValid && stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
