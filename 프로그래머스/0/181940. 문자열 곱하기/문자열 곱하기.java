class Solution {
    public String solution(String my_string, int k) {
        // my_string을 k번 반복
        
        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }
}