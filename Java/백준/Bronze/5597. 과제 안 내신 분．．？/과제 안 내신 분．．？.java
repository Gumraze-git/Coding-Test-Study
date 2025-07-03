import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1~30까지 출석 체크 배열
        boolean[] present = new boolean[31];  // 0번은 안 쓰고 1~30 사용

        // 28명의 번호를 읽어서 해당 인덱스를 true로 마킹
        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine().trim());
            present[num] = true;
        }

        // 마킹되지 않은(결석한) 번호만 출력
        for (int i = 1; i <= 30; i++) {
            if (!present[i]) {
                System.out.println(i);
            }
        }
    }
}