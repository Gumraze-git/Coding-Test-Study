import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 숫자를 long으로 읽음
        long result = 0;

        for (int i = 0; i < 5; i++) {
            long num = Long.parseLong(st.nextToken());
            long temp = num * num;
            result += temp;
        }
    
        System.out.println(result%10);
    }
}