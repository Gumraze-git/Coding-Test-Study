class Solution {
    public int solution(String my_string) {
        int sum = 0;
        for (String s : my_string.split("\\D+")) {
            if (!s.isEmpty()) {
                sum += Integer.parseInt(s);
            }
        }
        return sum;
    }
}
