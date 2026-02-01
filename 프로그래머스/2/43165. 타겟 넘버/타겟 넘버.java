class Solution {

    private int count;

    public int solution(int[] numbers, int target) {
        count = 0;
        dfs(numbers, target, 0, 0); // idx=0, sum=0 시작
        return count;
    }

    private void dfs(int[] numbers, int target, int idx, int sum) {
        // 종료 조건: 모든 숫자를 다 사용한 경우
        if (idx == numbers.length) {
            if (sum == target) count++;
            return;
        }

        // 다음 상태: + 선택
        dfs(numbers, target, idx + 1, sum + numbers[idx]);

        // 다음 상태: - 선택
        dfs(numbers, target, idx + 1, sum - numbers[idx]);
    }
}
