class Solution {
    public String solution(String rsp) {
        // 가위는 2, 바위는 0, 보는 5        
        StringBuilder sb = new StringBuilder();
        for (char c : rsp.toCharArray()) {
            if (c == '2') {
                sb.append('0');
            } else if (c == '0') {
                sb.append('5');
            } else {
                sb.append('2');
            }
        }
        return sb.toString();
    }
}