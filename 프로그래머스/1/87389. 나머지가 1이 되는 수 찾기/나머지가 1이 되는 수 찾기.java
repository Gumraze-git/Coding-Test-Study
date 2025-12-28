class Solution {
    public int solution(int n) {
        // 자연수 n이 매개변수로 주어짐
        // n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return -1;
    }
}