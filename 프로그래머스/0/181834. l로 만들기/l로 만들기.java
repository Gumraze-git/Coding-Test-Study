class Solution {
    public String solution(String myString) {
        // 알파벳 순서 'l' 보다 앞서는 모든 문자를 'l'로 바꾸어라.
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            answer += myString.charAt(i) < 'l'
                ? 'l'
                : myString.charAt(i);
            
            // if (myString.charAt(i) < 'l') {
            //     answer += 'l';
            // } else {
            //     answer += myString.charAt(i);
            // }
        }
        return answer;
    }
}