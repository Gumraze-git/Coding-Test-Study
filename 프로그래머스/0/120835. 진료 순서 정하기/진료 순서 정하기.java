import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        // 정렬용 배열 복사
        int[] sorted = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(sorted);

        // 큰 값부터 순위 부여
        int rank = 1;
        for (int i = sorted.length - 1; i >= 0; i--) {
            for (int j = 0; j < emergency.length; j++) {
                if (sorted[i] == emergency[j]) {
                    answer[j] = rank;
                    break;
                }
            }
            rank++;
        }

        return answer;
    }
}
