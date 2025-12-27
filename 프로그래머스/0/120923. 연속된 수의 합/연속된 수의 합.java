class Solution {
    public int[] solution(int num, int total) {
        // 연속된 num개의 정수를 더해 total이 되는 result를 반환해라.
        
        int[] answer = new int[num];
        int start = (total - num * (num - 1) / 2) / num;
        
        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }
        
        return answer;
    }
}