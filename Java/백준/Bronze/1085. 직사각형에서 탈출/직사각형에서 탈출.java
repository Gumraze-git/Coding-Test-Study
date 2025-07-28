import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 현재 위치와 직사각형
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        // 경계까지의 거리 계산
        int distLeft = x;
        int distRight = w - x;
        int distBottom = y;
        int distTop = h - y;
        
        // 4값 중 최솟값.
        int answer = Math.min(
            Math.min(distLeft, distRight),
            Math.min(distTop, distBottom)
        );
        
        System.out.println(answer);
    }
}