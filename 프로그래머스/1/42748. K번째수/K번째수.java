import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(
                array,
                commands[i][0] - 1, // 시작 인덱스 보정
                commands[i][1]      // 끝 인덱스 (미포함)
            );

            Arrays.sort(temp); // 정렬

            answer[i] = temp[commands[i][2] - 1]; // k번째 수
        }

        return answer;
    }
}
