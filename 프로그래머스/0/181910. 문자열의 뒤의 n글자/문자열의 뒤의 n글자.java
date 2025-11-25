class Solution {
    public String solution(String my_string, int n) {
        // my_string의 뒤의 n까지의 글자를 return
        return my_string.substring(my_string.length() - n, my_string.length());
    }
}