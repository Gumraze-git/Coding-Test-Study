import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        // 입력 값이 없을 때 까지 받기.
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}