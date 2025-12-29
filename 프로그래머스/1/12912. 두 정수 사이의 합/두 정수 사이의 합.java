class Solution {
    public long solution(int a, int b) {
        // 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합
        
        long answer = 0;
        if (a == b) {
            return a;
        } else {
            long bigNum = Math.max(a, b);
            long smallNum = Math.min(a, b);
            for (long i = smallNum; i <= bigNum; i++) {
                answer += i;
            }
        }
        return answer;
    }
}