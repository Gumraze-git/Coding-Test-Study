class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int idx = 0; // 단어 내 인덱스

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                answer.append(' ');
                idx = 0; // 단어가 바뀌면 인덱스 초기화
            } else {
                if (idx % 2 == 0) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                idx++;
            }
        }

        return answer.toString();
    }
}
