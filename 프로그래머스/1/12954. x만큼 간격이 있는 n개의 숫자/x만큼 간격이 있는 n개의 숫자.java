class Solution {
    public long[] solution(int x, int n) {
        // x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴하여라
        long[] answer = new long[n];
        
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }
}