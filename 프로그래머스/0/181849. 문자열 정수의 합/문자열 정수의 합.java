class Solution {
    public int solution(String num_str) {
        // 각 자리수의 합을 return
        
        int answer = 0;
        for (char s : num_str.toCharArray()) {
            answer += s-'0';
        }
        return answer;
    }
}