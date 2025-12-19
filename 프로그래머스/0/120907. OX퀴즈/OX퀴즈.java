class Solution {
    public String[] solution(String[] quiz) {
        // 
        String[] answer = new String[quiz.length];
        int idx = 0;
        for (String s : quiz) {
            // 토큰으로 분리
            String[] tokens = s.split(" ");
            
            int fir = Integer.parseInt(tokens[0]);
            int sec = Integer.parseInt(tokens[2]);
            int expected = Integer.parseInt(tokens[4]);
            int result;
            
            if (tokens[1].equals("+")) {
                result = fir + sec;
            } else {
                result = fir - sec;
            }
            
            if (result == expected) {
                answer[idx++] = "O";
            } else {
                answer[idx++] = "X";
            }
        }
        return answer;
    }
}