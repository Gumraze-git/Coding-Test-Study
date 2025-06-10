import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader로 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        String grade;

        // long 타입으로 변환 및 합산
        if (input >= 90) {
            grade = "A";
        } else if (input >= 80) {
            grade = "B";
        } else if (input >= 70) {
            grade = "C";
        } else if (input >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println(grade);
    }
}