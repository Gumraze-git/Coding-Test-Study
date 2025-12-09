class Solution {
    // 최대공약수(GCD) 계산: 유클리드 호제법
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // 최소공배수(LCM) 계산
    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public int solution(int n) {
        // 6조각 피자를 n명이 똑같이 먹기 위해 필요한 최소 판 수
        int total = lcm(6, n);
        return total / 6;
    }
}
