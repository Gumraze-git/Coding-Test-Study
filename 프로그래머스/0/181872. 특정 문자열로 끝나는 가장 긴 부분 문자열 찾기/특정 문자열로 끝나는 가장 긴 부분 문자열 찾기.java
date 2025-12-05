class Solution {
    public String solution(String myString, String pat) {
        int len = pat.length();

        for (int i = myString.length(); i >= len; i--) {
            // i 지점에서 pat과 끝이 같은지 검사
            if (myString.substring(i - len, i).equals(pat)) {
                return myString.substring(0, i); // pat으로 끝나는 가장 긴 부분 문자열
            }
        }
        return "";
    }
}
