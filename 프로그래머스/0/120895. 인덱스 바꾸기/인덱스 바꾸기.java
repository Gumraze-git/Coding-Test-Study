class Solution {
    public String solution(String my_string, int num1, int num2) {
        // my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열 return
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            if (i == num1) {
                answer.append(my_string.charAt(num2));
            } else if (i == num2) {
                answer.append(my_string.charAt(num1));
            } else {
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }
}