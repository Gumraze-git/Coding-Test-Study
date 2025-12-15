class Solution {
    public int solution(int[] numbers, int k) {
        // 공 던지기
        // 공은 1번부터 던지며, 오른쪽으로 한 명을 건너뛰고 그 다음 사람에게만 던질 수 있음.
        // K번째로 공을 던지는 사람의 번호를 return
        // 시작
        int index = 0;
        
        // k번 반복 수행
        for (int i = 1; i < k; i++) {
            index = (index + 2) % numbers.length;
        };
        
        return numbers[index];
    }
}