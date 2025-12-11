class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (int i = my_string.length() - 1; i >= 0; i--) {
            sb.append(my_string.substring(i, i + 1));
        }
        return sb.toString();
    }
}