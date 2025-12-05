class Solution {
    public String[] solution(String my_string) {
        // 단어가 공백 한개 이상으로 구분되어 있는 문자열을 분리하라.
        return my_string.trim().split("\\s+");
    }
}
