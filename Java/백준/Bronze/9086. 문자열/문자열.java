import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력값 받기
        int num = Integer.parseInt(br.readLine());

        // 값 뽑기
        for (int i = 1; i <= num; i++) {
            String line = br.readLine();

            char firstChar = line.charAt(0);
            char lastChar = line.charAt(line.length() - 1);

            System.out.println(String.valueOf(firstChar) + String.valueOf(lastChar));
        }
    }
}