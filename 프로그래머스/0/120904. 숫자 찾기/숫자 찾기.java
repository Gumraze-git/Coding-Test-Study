class Solution {
    public int solution(int num, int k) {
        String s = Integer.toString(num);
        int idx = 1;

        for (char c : s.toCharArray()) {
            if (c - '0' == k) {
                return idx;
            }
            idx++;
        }

        return -1;
    }
}
