class Solution {
    public int solution(int a, int b, boolean flag) {
        // flag가 true이면 a + b, false 이면 a - b
        return (flag)? a + b : a - b;
    }
}