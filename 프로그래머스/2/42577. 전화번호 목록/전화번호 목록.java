import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 한 번호가 다른 번호의 접두어인 경우가 있는지 확인
        // 일단 정렬하면 앞에가 같은 경우가 모임
        Arrays.sort(phone_book);
        
        for (int i = 0; i < phone_book.length - 1; i++) {
            String a = phone_book[i];
            String b = phone_book[i + 1];
            
            if (b.startsWith(a)) {
                return false;
            }
        }
        return true;
    }
}