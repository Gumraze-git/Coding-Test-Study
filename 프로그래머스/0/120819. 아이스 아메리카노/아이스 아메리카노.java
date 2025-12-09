class Solution {
    public int[] solution(int money) {
        // 아이스 아메리카노는 5,500원임
        // money가 주어질 때 최대로 마실 수 있는 아메리카노의 잔수와 남는 돈 반환
        int[] answer = {money/5500, money % 5500};
        return answer;
    }
}