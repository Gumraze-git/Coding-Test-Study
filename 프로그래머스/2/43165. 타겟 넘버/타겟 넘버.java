// 20260204 dfs 연습
class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(0, 0, numbers, target);
    }
    
    // dfs: 현 상태에서 시작해서, 가능한 모든 선택을 끝까지 수행
    // sum에서 시작해 target을 만들 수 있는 모든 경우의 수
    private int dfs(int index, int sum, int[] numbers, int target) {
        // 종료 조건
        // 모든 값을 사용했을 때
        if (index == numbers.length) {
            // sum이 target과 일치하면
            return (sum == target) ? 1 : 0;
        }
        
        return dfs(index + 1, sum + numbers[index], numbers, target) + dfs(index + 1, sum - numbers[index], numbers, target);

    }
}