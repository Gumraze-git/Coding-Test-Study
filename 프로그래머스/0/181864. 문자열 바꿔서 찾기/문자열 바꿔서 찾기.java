class Solution {
    public int solution(String myString, String pat) {
        // myString의 "A"를 "B"로 "B"를 "A"로 바꾼 문자열 중 pat이 있으면? 1 : 0
        String result = "";
        
        for (char c : myString.toCharArray()) {
            result += (c == 'A')
                ? 'B'
                : 'A';
        }
        return result.contains(pat) ? 1 : 0;
    }
}