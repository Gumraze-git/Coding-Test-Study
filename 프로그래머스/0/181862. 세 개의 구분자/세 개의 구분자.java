class Solution {
    public String[] solution(String myStr) {
        // 1. split 수행
        String[] arr = myStr.split("[abc]+");

        // 2. 유효한 문자열 개수 세기
        int count = 0;
        for (String s : arr) {
            if (!s.isEmpty()) {
                count++;
            }
        }

        // 3. 결과가 없다면 "EMPTY" 반환
        if (count == 0) {
            return new String[]{"EMPTY"};
        }

        // 4. 유효 문자열 개수만큼 배열 생성 후 복사
        String[] result = new String[count];
        int idx = 0;
        for (String s : arr) {
            if (!s.isEmpty()) {
                result[idx++] = s;
            }
        }

        return result;
    }
}
