class Solution {
    public int solution(int[] a, int[] b) {
        // a와 b의 내적으로 구하여라.
        int answer = 0;
        
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}