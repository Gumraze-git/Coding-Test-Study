class Solution {
    public int[] solution(int[][] score) {
        // 영어 점수와 수학 점수의 평균으로 등수를 매기기
        
        int[] answer = new int[score.length];
        
        int[] sum = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            sum[i] = score[i][0] + score[i][1];
        }
        
        // 나보다 평균이 높은 사람이 몇 명있는가?
        for (int i = 0; i < score.length; i++) {
            int rank = 1;
            for (int j = 0; j < sum.length; j++) {
                if (sum[j] > sum[i]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}