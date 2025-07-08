import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 값 받기
        String line = br.readLine();

        // 길이 출력
        System.out.println(line.length());
    };
};