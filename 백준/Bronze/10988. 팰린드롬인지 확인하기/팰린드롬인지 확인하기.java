import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine(); // 한 줄 전체 입력
        
        Main main = new Main();
        boolean result = main.isPalindrome(string);
        
        System.out.println(result ? 1 : 0);
        
    }
    // 문자열 직접 비교 방법 수행
    public boolean isPalindrome(String s) {
        // 정규식 변환후 소문자로 변경
        String replacedString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        // 문자열 뒤집기 후 String 타입으로 변경
        String reversedString = new StringBuilder(replacedString).reverse().toString();
        // 두 문자열이 동일한지 비교
        return s.equals(reversedString);      
    }
}
