import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력 값 받기
        String input = br.readLine();
        String grade = input.substring(0,1);
        String point = input.substring(1);

        // 성적에 따른 학점 출력
        if (grade.equals("A")) {
            if (point.equals("+")) {
                System.out.println("4.3");
            } else if (point.equals("0")) {
                System.out.println("4.0");
            } else {
                System.out.println("3.7");
            }
        } else if (grade.equals("B")) {
            if (point.equals("+")) {
                System.out.println("3.3");
            } else if (point.equals("0")) {
                System.out.println("3.0");
            } else {
                System.out.println("2.7");
            }
        } else if (grade.equals("C")) {
            if (point.equals("+")) {
                System.out.println("2.3");
            } else if (point.equals("0")) {
                System.out.println("2.0");
            } else {
                System.out.println("1.7");
            }
        } else if (grade.equals("D")) {
            if (point.equals("+")) {
                System.out.println("1.3");
            } else if (point.equals("0")) {
                System.out.println("1.0");
            } else {
                System.out.println("0.7");
            }
        } else {
            System.out.println("0.0");
        }
    }
}