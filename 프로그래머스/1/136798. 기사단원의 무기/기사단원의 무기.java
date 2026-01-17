class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int n = 1; n <= number; n++) {
            int count = 0;

            // 약수 개수 구하기
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    count += (i == n / i) ? 1 : 2;
                }
            }

            // 제한 조건 적용
            if (count > limit) {
                answer += power;
            } else {
                answer += count;
            }
        }

        return answer;
    }
}
