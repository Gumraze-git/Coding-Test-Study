class Solution {
    public boolean solution(String s) {
        // 문자열 s의 길이가 4 or 6임
        if (s.length() == 4 || s.length() == 6) {
            for (char c : s.toCharArray()) {
            // 문자가 하나라도 있으면
            if (!Character.isDigit(c)) {
                return false;
                }
            }       
        } else {
            return false;
        }
        return true;
    }
}