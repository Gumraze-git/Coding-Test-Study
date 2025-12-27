class Solution {
    public int solution(String A, String B) {
        int len = A.length();
        int answer = 0;

        while (answer < len) {
            if (A.equals(B)) {
                return answer;
            }
            A = A.charAt(len - 1) + A.substring(0, len - 1);
            answer++;
        }

        return -1;
    }
}
