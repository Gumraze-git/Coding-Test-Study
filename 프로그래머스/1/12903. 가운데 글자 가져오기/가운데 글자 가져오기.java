class Solution {
    public String solution(String s) {
        // 가운데 글자 반환하는 함수, 짝수이면 가운데 두 글자를 반환함
        int len = s.length();
        int mid = len / 2;
        
        return (len % 2 == 0) 
            ? s.substring(mid - 1, mid + 1)
            : s.substring(mid, mid + 1);
    }
}