class Solution {

    private int count;

    public int solution(int num) {
        count = 0;
        return collatz((long) num);
    }

    private int collatz(long n) {
        if (n == 1) return count;
        if (count >= 500) return -1;

        count++;
        if (n % 2 == 0) return collatz(n / 2);
        else return collatz(n * 3 + 1);
    }
}
