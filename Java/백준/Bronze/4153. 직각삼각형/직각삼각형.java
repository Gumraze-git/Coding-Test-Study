import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        // 0, 0, 0이 들어올때까지 입력값 받기
        while ((line = br.readLine()) != null) {
            if (line.equals("0 0 0")) {
                break;
            }

            // 토큰화
            StringTokenizer st = new StringTokenizer(line, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            boolean firResult = false;
            boolean secResult = false;

            if ((a + b > c) && (b + c > a) && (c + a > b)) {
                firResult = true;
            }

            // 최댓값 찾기
            int[] sides = {a, b, c};
            Arrays.sort(sides);

            // 올바른 변수 이름과 비교
            long a2 = (long)sides[0] * sides[0];
            long b2 = (long)sides[1] * sides[1];
            long c2 = (long)sides[2] * sides[2];

            if (a2 + b2 == c2) {
                secResult = true;
            }
            
            if (firResult && secResult) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}