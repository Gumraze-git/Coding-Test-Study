class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();

        for (int[] q : queries) {
            int s = q[0];
            int e = q[1];

            // 두 포인터로 구간 뒤집기
            while (s < e) {
                char temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;

                s++;
                e--;
            }
        }

        return new String(arr);
    }
}