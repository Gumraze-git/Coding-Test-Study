import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 숫자를 long으로 읽음
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        long firResult = (A + B) % C;
        long secResult = ((A % C) + (B % C)) % C;
        long thiResult = (A * B) % C;
        long fouResult = ((A%C) * (B%C))%C;

    
        System.out.println(firResult);
        System.out.println(secResult);
        System.out.println(thiResult);
        System.out.println(fouResult);
    }
}