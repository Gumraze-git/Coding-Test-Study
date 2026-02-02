class Solution {
    // count 선언
    private int target;
    private int[] numbers;
    
    public int solution(int[] numbers, int target) {
        // n개의 음이 아닌 정수가 있음.
        // 정수들의 순서를 바꾸지 않고 target으로 만들 수 있는 방법의 수를 return
        return dfs(0, 0, numbers, target);
    }
    
    // 상태 정의
    // dfs(index, sum)
    // index까지 처리했고
    // 현재 누적합이 sum일 때
    // target을 만들 수 있는 경우의 수
    private int dfs(int index, int sum, int[] numbers, int target) {
        // 종료 조건
        if (index == numbers.length) {
            return (sum == target) ? 1 : 0;
        }
        // 재귀 분기
        int plus = dfs(index + 1, sum + numbers[index], numbers, target);
        int minus = dfs(index + 1, sum - numbers[index], numbers, target);
        
        return plus + minus;
    }
    
    
}