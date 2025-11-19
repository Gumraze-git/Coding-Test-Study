import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine(); // 한 줄 전체 입력
        
        Main main = new Main();
        boolean result = main.isPalindrome(string);
        
        System.out.println(result ? 1 : 0);
        
    }
    
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
    
        // 서로 중앙으로 이동해 나가다 겹치는 지점에 도달하면 종료
        while (start < end) {
            // 영숫자인지 판별하고 유효하지 않으면 한 칸씩 이동
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            } else {    // 유효한 문자라면 앞 글자와 뒷 글자를 모두 소문자로 비교하여 비교
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                    // 하나라도 일지차히 않는다면 팰린드롬이 아니므로 false 리턴
                    return false;
                }
                // 앞쪽 문자는 한 칸 뒤로, 뒤쪽 문자는 한 칸 앞으로 이동
                start++;
                end--;
                
            }
        }
    // 무사히 종료 될 때만 팰린드롬이므로 true 리턴
    return true;
    }
}
