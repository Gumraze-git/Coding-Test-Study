import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");

        // 빈 문자열 제거
        List<String> list = new ArrayList<>();
        for (String s : arr) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }

        // 리스트를 배열로 변환 후 정렬
        String[] result = list.toArray(new String[0]);
        Arrays.sort(result);

        return result;
    }
}
