class Solution {
    public int[][] solution(int n) {
        // n이 매개변수로 주어질 때 n x n 크기의 이차원 배열 arr을 return
        int[][] answer = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            // n번 반복하여 n개의 배열을 만듬
            for (int j = 0; j < n; j++) {
                answer[i][j] = (i == j)
                    ? 1
                    : 0;
            }   
        }
        return answer;
    }
}