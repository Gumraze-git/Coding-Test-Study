class Solution {
    public int[][] solution(int n) {
        // n이 매개변수로 주어질 때 n x n 크기의 이차원 배열 arr을 return
        int[][] answer = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }
}