import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 숫자 개수
        String numbers = br.readLine();          // 공백 없는 숫자 문자열

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += numbers.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
