class Solution {
    public int solution(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {   // 대각선 위 삼각형만 검사
                if (arr[i][j] != arr[j][i]) {  // 하나라도 다르면 즉시 종료
                    return 0;
                }
            }
        }

        return 1;  // 끝까지 문제 없으면 대칭 행렬
    }
}
