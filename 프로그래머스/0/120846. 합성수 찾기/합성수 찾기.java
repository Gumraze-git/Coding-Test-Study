class Solution {
    public int solution(int n) {
        // 에라토스테네스의 체 기반
        // 작은 소수부터 시작해여 그 배수를 차례로 지워나가면, 남는 수는 모두 소수이다.
        boolean[] isNotPrime = new boolean[n + 1];

        isNotPrime[0] = true;
        isNotPrime[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 4; i <= n; i++) {
            if (isNotPrime[i]) {
                count++;
            }
        }

        return count;
    }
}
