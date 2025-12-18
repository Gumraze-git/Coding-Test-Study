class Solution {
    public String solution(String cipher, int code) {
        // code의 배수 번째 글자로 암호 cipher를 해독함.
        StringBuilder answer = new StringBuilder();
        for (int i = code; i <= cipher.length(); i += code) {
            answer.append(cipher.charAt(i-1));
        }
        return answer.toString();
    }
}