// counter를 이용하여 풀이
class Solution {
    boolean solution(String s) {
        int count = 0;
        
        for (char ch: s.toCharArray()) {
            if (ch == '(') {
                count ++;
            } else if (ch == ')') {
                count --;
            }
            
            // 중간에 닫는 괄호가 많아지면 false
            if (count < 0) {
                return false;
            }
        }
        
        // 모두 짝지어졌다면 0, 아니면 false
        return count == 0;
    }
}