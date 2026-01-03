import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 가로
        int m = Integer.parseInt(st.nextToken()); // 세로

        StringBuilder sb = new StringBuilder();

        String line = "*".repeat(n);
        for (int i = 0; i < m; i++) {
            sb.append(line).append('\n');
        }

        System.out.print(sb.toString());
    }
}
