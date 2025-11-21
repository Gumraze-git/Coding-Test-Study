class Solution {
    public int solution(int a, int b, int c) {
        int x = a + b + c;
        int y = a * a + b * b + c * c;
        int z = a * a * a + b * b * b + c * c * c;

        if (a == b && b == c) {
            // 세 숫자가 모두 같은 경우
            return x * y * z;
        } else if (a == b || a == c || b == c) {
            // 두 개만 같은 경우
            return x * y;
        } else {
            // 모두 다른 경우
            return x;
        }
    }
}