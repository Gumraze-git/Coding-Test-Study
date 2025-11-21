class Solution {
    public int solution(int num, int n) {
        // num이 n의 배수면 1, 아니면 0
        return (num % n == 0) ? 1 : 0;
    }
}