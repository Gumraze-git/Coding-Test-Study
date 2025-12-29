class Solution {
    public int[] solution(long n) {
        // 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 형태로 리턴하라
        String s = new StringBuilder(Long.toString(n)).reverse().toString();
        int[] answer = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            answer[i] = s.charAt(i) - '0';
        }
        return answer;
    }
}