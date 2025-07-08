import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력값 받기
        String input = br.readLine();
        int num = Integer.parseInt(br.readLine());

        // num 번째 문자 출력
        System.out.println(input.substring(num - 1, num));
    }
};