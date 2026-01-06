class Solution {
    public int solution(int a, int b, int n) {
        // 콜라 빈 병 a개를 가져다주면 콜라 b병을 주는 마트가 있음.
        // 빈 병 n개를 가져다주면 몇 병을 받을 수 있는가?
        int answer = 0;
        int rest = n;
        
        // 남은 콜라가 a 보다 많을 동안 반복
        while (rest >= a) {
            // 교환 횟수
            int exchange = rest / a;
            // 새로 받은 콜라
            int newBottle = exchange * b;
            answer += newBottle;  // 갱신
            
            // 남은 콜라 갱신
            rest = (rest % a) + newBottle;
            
        }
        return answer;
    }
}