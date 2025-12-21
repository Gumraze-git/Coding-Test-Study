class Solution {
    public int solution(int[] array, int height) {
        // 키가 담긴 정수 배열 array와 키 heigth가 주어질때 height보다 큰 사람의 수
        int answer = 0;
        
        // 순회하면서 비교
        for (int i : array) {
            if (i > height) {
                answer++;
            }
        }
        return answer;
    }
}