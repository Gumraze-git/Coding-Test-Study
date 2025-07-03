import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1부터 30까지 담긴 리스트 생성
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            list.add(i);
        }

        // 입력값 받아서 리스트에 담기
        List<Integer> gradesList = new ArrayList<>(28);
        for (int i = 0; i < 28; i++) {
            String line = br.readLine();
            gradesList.add(Integer.parseInt(line.trim()));
        }

        // 차집합 계산
        Set<Integer> setB = new HashSet<>(gradesList);

        List<Integer> diff = list.stream()
        .filter(e -> !setB.contains(e))
        .sorted()
        .collect(Collectors.toList());

        // 정렬 후 출석 번호 호출
        for (int num : diff) {
            System.out.println(num);    
        }
    }
}