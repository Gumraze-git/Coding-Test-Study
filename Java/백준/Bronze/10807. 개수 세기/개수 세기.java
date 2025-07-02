import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 입력값 받기
        int size = Integer.parseInt(br.readLine());

        // 두 번째 입력값 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 세 번째 입력값 받기
        int compareNum = Integer.parseInt(br.readLine());

        // 결과를 반영할 객체 생성
        int result = 0;
        for (int num : arr) {
            if (num == compareNum) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}