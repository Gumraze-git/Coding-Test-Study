class Solution {
    public int solution(int[][] dots) {
        // 2차원 배열
        // 주어진 4개의 점을 2개씩 이었을 때 두 직선이 평행이 되는 경우가 있으면 1, 아니면 0을 return
        // 모든 직선의 기울기를 비교
        
        // case 1: (0,1) vs (2,3)
        if ((dots[1][0] - dots[0][0]) * (dots[3][1] - dots[2][1]) ==
            (dots[1][1] - dots[0][1]) * (dots[3][0] - dots[2][0])) {
            return 1;
        }

        // case 2: (0,2) vs (1,3)
        if ((dots[2][0] - dots[0][0]) * (dots[3][1] - dots[1][1]) ==
            (dots[2][1] - dots[0][1]) * (dots[3][0] - dots[1][0])) {
            return 1;
        }

        // case 3: (0,3) vs (1,2)
        if ((dots[3][0] - dots[0][0]) * (dots[2][1] - dots[1][1]) ==
            (dots[3][1] - dots[0][1]) * (dots[2][0] - dots[1][0])) {
            return 1;
        }

        return 0;
    }
}