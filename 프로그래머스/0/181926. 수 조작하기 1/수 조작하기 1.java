class Solution {
    public int solution(int n, String control) {
        // 정수 n과 문자열 control
        // w -> +1
        // s -> -1
        // d -> +10
        // a -> -10
        int answer = n;
        for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i) == 'w') {
               answer += 1; 
            } else if (control.charAt(i) == 's') {
                answer -= 1;
            } else if (control.charAt(i) == 'd') {
                answer += 10;
            } else if (control.charAt(i) == 'a') {
                answer -= 10;
            }
        }
        return answer;
    }
}