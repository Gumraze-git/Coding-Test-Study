class Solution {
    public String solution(String my_string, int m, int c) {
        // 두 정수 m, c가 주어질 때, my_string을 한 줄에 m글자씩 가로로 적었을 때
        // 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return
        
        // String answer = "";
        
        // StringBuilder 사용 연습
        StringBuilder answer = new StringBuilder();
        
            
        for (int i = 0; i < my_string.length(); i += m) {
            // char temp = my_string.charAt(i + (c - 1));
            // answer += temp;
            
            // StringBuilder 사용 연습
            answer.append(my_string.charAt(i + (c - 1)));
        }
        
        return answer.toString();
    }
}