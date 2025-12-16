class Solution {
    public int solution(int n) {
        int fact = 1;
        int answer = 1;
        while (fact <= n) {
            answer++;
            fact *= answer;
        }
        return answer - 1;
    }
}