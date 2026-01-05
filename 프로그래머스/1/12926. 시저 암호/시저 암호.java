class Solution {
    public String solution(String s, int n) {
        // 시저 암호: 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식
        // 문자열 s, 거리n으로 s를 n만큼 민 암호문 함수 solution을 완성하라
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                answer.append(c);
            } else if (c >= 'a' && c <= 'z') {
                char shifted = (char) ((c - 'a' + n) % 26 + 'a');
                answer.append(shifted);
            } else if (c >= 'A' && c <= 'Z') {
                char shifted = (char) ((c - 'A' + n) % 26 + 'A');
                answer.append(shifted);
            }
        }
        
        return answer.toString();
    }
}