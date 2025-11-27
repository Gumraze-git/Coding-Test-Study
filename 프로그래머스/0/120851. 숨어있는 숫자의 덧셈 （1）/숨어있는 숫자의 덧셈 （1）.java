class Solution {
    public int solution(String my_string) {
        // my_string 안의 모든 자연수의 합
        int answer = 0;
        
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                // answer += Integer.parseInt(String.valueOf(c));
                answer += c - '0';
            }
        }
        return answer;
    }
}