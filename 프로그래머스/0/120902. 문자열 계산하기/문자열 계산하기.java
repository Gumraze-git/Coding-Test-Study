class Solution {
    public int solution(String my_string) {
        // 문자열 계산하기
        String[] tokens = my_string.split(" ");
        
        int answer = Integer.parseInt(tokens[0]);
        
        for (int i = 1; i < tokens.length; i += 2) {
            // 연산자 확인
            String op = tokens[i];
            
            int num = Integer.parseInt(tokens[i + 1]);
            
            if (op.equals("+")) {
                answer += num;
            } else {
                answer -= num;
            }
        }
        return answer;
    }
}