import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        int[] answer;

        if (n == 1) {
            // num_list[0] ~ num_list[b] (b 포함)
            answer = Arrays.copyOfRange(num_list, 0, b + 1);

        } else if (n == 2) {
            // num_list[a] ~ num_list[끝]
            answer = Arrays.copyOfRange(num_list, a, num_list.length);

        } else if (n == 3) {
            // num_list[a] ~ num_list[b] (b 포함)
            answer = Arrays.copyOfRange(num_list, a, b + 1);

        } else { // n == 4
            // num_list[a] ~ num_list[b]를 c 간격으로 뽑기
            // 먼저 결과 배열의 길이를 계산
            int size = ((b - a) / c) + 1; // 등차수열 항 개수 공식

            answer = new int[size];

            int idx = 0;
            for (int i = a; i <= b; i += c) {
                answer[idx++] = num_list[i];
            }
        }

        return answer;
    }
}