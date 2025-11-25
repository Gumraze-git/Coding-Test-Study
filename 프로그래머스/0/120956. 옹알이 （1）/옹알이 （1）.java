class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String pattern = "aya|ye|woo|ma";

        for (String s : babbling) {
            String temp = s.replaceAll(pattern, "");
            if (temp.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}