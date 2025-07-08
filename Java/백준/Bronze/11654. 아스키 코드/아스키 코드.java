import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력값 받기
        String asc = br.readLine();

        // 단일 문자로 변환
        char ch = asc.charAt(0);

        // ASCII 코드로 변환
        int result = (int) ch;

        // 출력
        System.out.println(result);
    }
};
