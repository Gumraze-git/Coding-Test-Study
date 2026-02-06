// 20260206 DFS 연습
class Solution {
    public int solution(int[] numbers, int target) {
        // numbers의 값을 모두 사용해서 target과 같은지 비교해야함.
        // 모든 경우에 대한 처리를 순차적으로 해야함. -> DFS
        return dfs(0, 0, numbers, target);
    }
    
    // dfs는 현재 상태의 값만 바꾸고 다음 상태는 다음 DFS에게 넘긴다.
    // index: 현재의 인덱스로 끝까지 더했는지 확인하기 위함.
    // sum: 끝까지 더 한 후의 결과
    // numbers[]: 값 갱신을 위한 원본 배열
    // target: 대조할 값
    private int dfs(int index, int sum, int[] numbers, int target) {
        // 종료 조건
        // 끝까지 더한 값이 target과 동일해야함.
        // 현재의 인덱스가 원본 배열의 크기와 동일 -> 끝까지 순회했다는 의미
        if (index == numbers.length) {
            // 더한 값이 target과 동일하면 1, 그렇지 않으면 0
            return (sum == target) ? 1 : 0;
        }
        
        // 아직 연산 수행 중인 경우
        // 다음 인덱스
        int next = index + 1;
        // 덧셈 값 업데이트 = 현재 sum + numbers[next]
        int nextPlusSum = sum + numbers[index];
        // 빼는 경우 업데이트
        int nextMinusSum = sum - numbers[index];
        
        // dfs가 plus를 끝까지 탐색하고
        int plus = dfs(next, nextPlusSum, numbers, target);
        // 마지막 plus가 일치하지 않으면 minus를 탐색하러 돌아옴
        int minus = dfs(next, nextMinusSum, numbers, target);
        
        return plus + minus;
    }
}