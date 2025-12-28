class Solution {
    public String solution(int num) {
        // 짝수일 경우 Even, 홀수는 Odd
        return num % 2 == 0 ? "Even" : "Odd";
    }
}