// 20260203 연습
class Solution {
    public int solution(int[] numbers, int target) {
        // 숫자를 더하거나 빼서 target과 동일하게 하는 방법의 개수를 return하라        
        return dfs(0, numbers, 0, target);
    }
    
    // dfs 정의: 각 단계에서 어떤 것을 수행해야하는지
    private int dfs(int index, int[] numbers, int sum, int target) {
        // 종료 조건: 끝까지 계산을 수행했을 때
        if (index == numbers.length) {
            // 숫자를 다 사용했고, 이 경로가 정답이면 1
            return (sum == target) ? 1 : 0;
        }
        
        // 현재 단계에서 해야할 것
        // 덧셈 및 뺄샘 수행
        return dfs(index + 1, numbers, sum + numbers[index], target) + dfs(index + 1, numbers, sum - numbers[index], target);

    }
}