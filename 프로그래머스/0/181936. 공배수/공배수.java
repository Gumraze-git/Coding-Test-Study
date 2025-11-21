class Solution {
    public int solution(int number, int n, int m) {
        // number가 n의 배수이면서 m의 배수이면 1 -> 공배수이면 1 : 아니면 0
        return (number % n == 0 && number % m == 0) ? 1 : 0;
    }
}