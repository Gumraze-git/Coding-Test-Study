class Solution {
    public String solution(String my_string) {
        // 대문자는 소문자로
        StringBuilder answer = new StringBuilder();
        
        for (char c: my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            } else {
                answer.append(Character.toUpperCase(c));
            }
        }
        
        return answer.toString();
    }
}