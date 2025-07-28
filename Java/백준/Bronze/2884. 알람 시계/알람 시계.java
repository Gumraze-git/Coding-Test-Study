import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 시간, 분 입력값 처리
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int diff = 45; // 45분
        
        if (min < diff) {
            // diff 보다 min이 작으면 1시간을 60분으로 변환
            hour = (hour + 23) % 24;
            min += 60; // min에서 60분 추가
        }
        min -= diff;
        System.out.println(hour + " " + min);
    }
}