class Solution {
    public String solution(String my_string) {
        // 모음을 제거한 문자열을 return
        return my_string.replaceAll("[aeiou]", "");
    }
}