class Solution {
    public String[] solution(String[] strArr) {
        // 홀수번째 인덱스의 문자열을 모든 문자를 대문자로,
        // 짝수번째 인덱스의 문자열은 모두 소문자로
        String[] answer = new String[strArr.length];
        
        for (int i = 0; i < strArr.length; i++) {
            answer[i] = (i % 2 == 0)
                ? strArr[i].toLowerCase()
                : strArr[i].toUpperCase();
        }
        return answer;
    }
}