import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 숫자를 long으로 읽음
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long result = (A + B) * (A - B);
        System.out.println(result);
    }
}