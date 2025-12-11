class Solution {
    public String solution(String my_string, int n) {
        // my_string에 들어있는 각 문자를 n만큼 반복
        StringBuilder sb = new StringBuilder();
        
        for (char c : my_string.toCharArray()) {
            sb.append(String.valueOf(c).repeat(n));
        }
        return sb.toString();
    }
}