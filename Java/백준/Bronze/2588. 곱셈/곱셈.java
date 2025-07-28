import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();

        int result = 0;
        int place = 1;
        
        for (int i = 1; i <= 3; i++) {
            // 뒤에서 i번째 문자를 뽑아낸다
            char ch = B.charAt(B.length() - i);
            // '0' 문자를 빼서 실제 숫자로 변환
            int digit = ch - '0';
            System.out.println(A * digit);
            result += A * digit * place;
            place *= 10;
        }
        System.out.println(result);
    }
}