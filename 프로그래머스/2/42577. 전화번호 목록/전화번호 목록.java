import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 전화번호부에 적힌 전화번호, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인
        
        Set<String> set = new HashSet<>();
        
        for (String s : phone_book) {
            set.add(s);
        }
        
        for (String s : phone_book) {
            // 접두어는 자신을 제외함
            for (int i = 1; i < s.length(); i++) {
                String prefix = s.substring(0, i);
                if (set.contains(prefix)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}