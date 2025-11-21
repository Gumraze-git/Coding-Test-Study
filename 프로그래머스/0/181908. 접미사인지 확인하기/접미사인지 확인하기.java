class Solution {
    public int solution(String my_string, String is_suffix) {
        // 접마사인지 확인하기
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }
}