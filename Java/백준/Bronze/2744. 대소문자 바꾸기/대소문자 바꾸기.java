import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 값 받기
        String line = br.readLine();

        // 문자를 순회하면서 소문자는 대문자로 대문자는 소문자로 변환
        StringBuilder sb = new StringBuilder();
        for (char word: line.toCharArray()) {
            if (Character.isLowerCase(word)) {
                sb.append(Character.toUpperCase(word));
            } else {
                sb.append(Character.toLowerCase(word));
            }
        }
        System.out.println(sb.toString());
    };
};