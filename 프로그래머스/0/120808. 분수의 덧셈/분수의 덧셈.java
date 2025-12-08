class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        // 분자 계산
        int numerator = numer1 * denom2 + numer2 * denom1;
        // 분모 계산
        int denominator = denom1 * denom2;
        
        // 최대 공약수 계산
        int x = numerator;
        int y = denominator;
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        int gcd = x;
        
        // 기약 분수로 만들기
        numerator /= gcd;
        denominator /= gcd;
        return new int[]{numerator, denominator};
    }
}