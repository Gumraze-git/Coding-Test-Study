class Solution {
    public int solution(int[] array, int n) {
        // array에 n이 몇 개 있는지 return
        int answer = 0;
        
        // 순회하면서 n의 개수 찾기
        for (int i : array) {
            if (i == n) {
                answer++;
            }
        }
        return answer;
    }
}