class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];

            if (x >= 50 && x % 2 == 0) {
                // 50 이상 & 짝수 → 2로 나누기
                answer[i] = x / 2;
            } else if (x < 50 && x % 2 == 1) {
                // 50 미만 & 홀수 → 2배
                answer[i] = x * 2;
            } else {
                // 조건에 해당하지 않으면 그대로
                answer[i] = x;
            }
        }
        return answer;
    }
}
