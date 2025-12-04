class Solution {
    public int solution(String myString, String pat) {
        // myString의 연속된 부분 문자열 중 pat 이 존재하면 1
        // 그렇지 않으면 0
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}