class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder(myString.length());

        for (char c : myString.toCharArray()) {
            if (c == 'a' || c == 'A') {   // a 또는 A는 모두 'A'
                answer.append('A');
            } else if (Character.isUpperCase(c)) { // A가 아닌 대문자들은 소문자 변환
                answer.append(Character.toLowerCase(c));
            } else {                                // 나머지 소문자는 그대로
                answer.append(c);
            }
        }

        return answer.toString();
    }
}
