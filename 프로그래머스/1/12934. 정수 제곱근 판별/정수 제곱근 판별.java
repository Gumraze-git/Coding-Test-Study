class Solution {
    public long solution(long n) {
        // 정수 n이 어떤 양의 정수 x의 제곱인지 아닌지 판단
        // n이 x의 제곱수라면,(x + 1)^2를 return
        // 그렇지 않으면 -1을 return
        long num = (long) Math.sqrt(n);
        if (num * num != n) {
            return -1;
        } else {
            return (num + 1) * (num + 1);
        }
    }
}