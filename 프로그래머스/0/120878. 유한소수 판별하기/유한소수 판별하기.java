class Solution {
    public int solution(int a, int b) {
        // 1) 먼저 a/b를 기약분수로 만든다.
        //    유한소수 판정은 "기약분수의 분모"만 보면 된다.
        int g = gcd(a, b);
        b /= g;

        // 2) 기약분수의 분모 b에서 2와 5를 가능한 한 모두 제거한다.
        //    (유한소수의 분모는 소인수가 2와 5만 존재해야 함)
        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;

        // 3) 2와 5를 다 제거하고도 분모가 1이 아니면
        //    다른 소인수가 남아있다는 뜻 => 무한소수(2)
        return (b == 1) ? 1 : 2;
    }

    // 유클리드 호제법으로 최대공약수(GCD) 구하기
    private int gcd(int x, int y) {
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
}
