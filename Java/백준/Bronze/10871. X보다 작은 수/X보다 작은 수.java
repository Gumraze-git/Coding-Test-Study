import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 전체 줄을 읽은 뒤
        String line = br.readLine();

        // StringTokenizer로 분리
        StringTokenizer st = new StringTokenizer(line);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        // 다음 전체 줄을 읽은 뒤
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder(); // 배열을 담을 빌더 생성

        for (int i = 0; i < A; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num < B) {
                sb.append(num).append(' ');
            }
        }
        
        // 마지막 공백 제거 후 출력
        System.out.println(sb.toString().trim());
        br.close();
    }
}