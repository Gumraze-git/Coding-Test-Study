class Solution {
    public int[] solution(int[] arr) {
        // 길이가 1 작은 answer 배열 생성
        int[] answer = new int[arr.length - 1];
        if (arr.length == 1) {
            // 길이가 하나일 경우 -1 반환
            return new int[]{-1};
        } else {
            // 작은 수의 인덱스 찾기
            int min = arr[0];
            int minIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            
            // 최소값 제외한 배열 생성
            int idx = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i == minIndex) {
                    continue;
                }
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}