class Solution {
    public String solution(String my_string, String letter) {
        // my_string에서 letter를 제거한 문자열 return
        return my_string.replaceAll(letter, "");
    }
}