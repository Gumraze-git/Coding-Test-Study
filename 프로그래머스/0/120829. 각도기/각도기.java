class Solution {
    public int solution(int angle) {
        // 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4
        if (angle <= 90) {
            return (angle == 90) ? 2 : 1;
        } else {
            return (angle == 180) ? 4 : 3;
        }
    }
}