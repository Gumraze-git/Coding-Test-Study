class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int a = -1, b = -1, c = -1;
        int r1 = 101, r2 = 101, r3 = 101;

        for (int i = 0; i < rank.length; i++) {
            if (!attendance[i]) continue;

            if (rank[i] < r1) {
                r3 = r2; c = b;
                r2 = r1; b = a;
                r1 = rank[i]; a = i;
            } else if (rank[i] < r2) {
                r3 = r2; c = b;
                r2 = rank[i]; b = i;
            } else if (rank[i] < r3) {
                r3 = rank[i]; c = i;
            }
        }

        return 10000 * a + 100 * b + c;
    }
}
